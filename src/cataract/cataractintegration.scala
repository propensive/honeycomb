/*
    Honeycomb, version 0.2.0. Copyright 2018-21 Jon Pretty, Propensive OÜ.

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

import rudiments.*
import cataract.*

package integration.cataract:
  // given [A <: Label, B <: Label]: simplistic.CssSelection[Element[A, B]] = elem =>
  //   val attributes = elem.attributes.map {
  //     case (k, v: String) => str"$k=$v"
  //     case (k, v: Boolean) => k
  //   }.join("[", "][", "]")

  //   str"${elem.label}$attributes"
  
  //given simplistic.CssSelection[Cls] = cls => s".${cls.name}"
  //given simplistic.CssSelection[DomId] = id => s"#${id.name}"