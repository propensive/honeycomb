[<img src="https://img.shields.io/discord/633198088311537684?color=8899f7&label=DISCORD&style=for-the-badge" height="24">](https://discord.gg/v7CjtbnwDq)
[<img src="https://vent.dev/badge/propensive/honeycomb" height="24">](https://vent.dev/)
<img src="/doc/images/github.png" valign="middle">

# Honeycomb

_Honeycomb_ provides a typesafe representation of HTML5 which goes as far as possible in the scope of
Scala's type system to ensure that the HTML specification is correctly modeled, for example by
enforcing nesting rules between different tags.

## Features

- simple method-application style for constructing HTML nodes
- nodes and sequences of nodes may be embedded and mixed inside HTML nodes
- the type of a node defines the valid types of its child nodes, enforcing the HTML5 specification through the type system
- values of other types may be embedded in HTML, if an appropriate typeclass instance exists
- a simple named-parameter style is provided for HTML attributes
- HTML attributes are strongly-typed, and the types accepted by each are defined by typeclasses


## Getting Started

TBC


## Related Projects

The following _Niveau_ libraries are dependencies of _Honeycomb_:

[![Clairvoyant](https://github.com/propensive/clairvoyant/raw/main/doc/images/128x128.png)](https://github.com/propensive/clairvoyant/) &nbsp; [![Rudiments](https://github.com/propensive/rudiments/raw/main/doc/images/128x128.png)](https://github.com/propensive/rudiments/) &nbsp;

The following _Niveau_ libraries are dependents of _Honeycomb_:

[![Punctuation](https://github.com/propensive/punctuation/raw/main/doc/images/128x128.png)](https://github.com/propensive/punctuation/) &nbsp;

## Status

Honeycomb is classified as __fledgling__. Propensive defines the following five stability levels for open-source projects:

- _embryonic_: for experimental or demonstrative purposes only, without any guarantees of longevity
- _fledgling_: of proven utility, seeking contributions, but liable to significant redesigns
- _maturescent_: major design decisions broady settled, seeking probatory adoption and refinement
- _dependable_: production-ready, subject to controlled ongoing maintenance and enhancement; tagged as version `1.0` or later
- _adamantine_: proven, reliable and production-ready, with no further breaking changes ever anticipated

Honeycomb is designed to be _small_. Its entire source code currently consists of 615 lines of code.

## Availability

Honeycomb&rsquo;s source is available on GitHub, and may be built with [Fury](https://github.com/propensive/fury) by
cloning the layer `propensive/honeycomb`.
```
fury layer clone -i propensive/honeycomb
```
or imported into an existing layer with,
```
fury layer import -i propensive/honeycomb
```

## Contributing

Contributors to Honeycomb are welcome and encouraged. New contributors may like to look for issues marked
<a href="https://github.com/propensive/honeycomb/labels/good%20first%20issue"><img alt="label: good first issue"
src="https://img.shields.io/badge/-good%20first%20issue-67b6d0.svg" valign="middle"></a>.

We suggest that all contributors read the [Contributing Guide](/contributing.md) to make the process of
contributing to Honeycomb easier.

Please __do not__ contact project maintainers privately with questions. While it can be tempting to repsond to
such questions, private answers cannot be shared with a wider audience, and it can result in duplication of
effort.

## Author

Honeycomb was designed and developed by Jon Pretty, and commercial support and training is available from
[Propensive O&Uuml;](https://propensive.com/).



## Name

Honeycomb is named after the hexagonal prismic cells in a bees' nest, where they store their honey and their larvæ; the most innovative feature of Honeycomb is its provision of safe nesting of HTML nodes.

## License

Honeycomb is copyright &copy; 2018-21 Jon Pretty & Propensive O&Uuml;, and is made available under the
[Apache 2.0 License](/license.md).
