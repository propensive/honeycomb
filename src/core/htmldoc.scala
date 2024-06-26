/*
    Honeycomb, version [unreleased]. Copyright 2024 Jon Pretty, Propensive OÜ.

    The primary distribution site is: https://propensive.com/

    Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
    file except in compliance with the License. You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software distributed under the
    License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
    either express or implied. See the License for the specific language governing permissions
    and limitations under the License.
*/

package honeycomb

import hieroglyph.*
import vacuous.*
import rudiments.*
import anticipation.*
import spectacular.*
import gossamer.*

case class HtmlDoc(root: Node["html"])

object HtmlDoc:
  given (using encoder: CharEncoder) => HtmlDoc is GenericHttpResponseStream as generic:
    def mediaType: Text = t"text/html; charset=${encoder.encoding.name}"
    def content(value: HtmlDoc): LazyList[Bytes] = LazyList(HtmlDoc.serialize(value).bytes)

  def serialize[OutputType](doc: HtmlDoc, maxWidth: Int = -1)(using HtmlSerializer[OutputType]): OutputType =
    summon[HtmlSerializer[OutputType]].serialize(doc, maxWidth)

  def simple[Stylesheet](title: Text, stylesheet: Stylesheet = false)(content: (Html[Flow] | Seq[Html[Flow]])*)
      (using att: HtmlAttribute["href", Stylesheet, ?])
          : HtmlDoc =

    val link = (att.convert(stylesheet): @unchecked) match
      case Unset      => Nil
      case text: Text => Seq(Link(rel = Text("stylesheet"), href = text))

    HtmlDoc(Html(Head(Title(title), link), Body(content*)))
