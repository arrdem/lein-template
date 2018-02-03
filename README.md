# @arrdem's Leiningen template

<img align="right" src="https://github.com/arrdem/lein-template/raw/master/etc/lein-template.jpg" width=300/>

[![Clojars Project](https://img.shields.io/clojars/v/me.arrdem/lein-template.svg)](https://clojars.org/me.arrdem/lein-template)

I realized I'd been hammering out a bunch of small projects that shared a lot of structure, in that
they:

- had more or less the same README structure
- used the contrib style `src/{dev,main,test}/{clj,cljc,jvm}` directory structure
- leveraged my [lein-git-version](https://github.com/arrdem/lein-git-version) plugin
- had a bunch of config files (`.gitignore`, `.editorconfig`) I just copied around

This project exists to provide push-button project creation with most of my defaults for genera
purpose projects. Additional customization will probably be required, but it's already labor-saving
for my needs.

## Installation

Add a plugin dependency on `[me.arrdem/lein-template "a.b.c"]` to your `~/.lein/profiles.clj`. See
the Clojars badge above for the latest release.

For instance,

``` clojure
{:user {:plugins [[me.arrdem/lein-template "a.b.c"]]}
```

## Usage

    lein new arrdem some-absurd-name

The arrdem template as of this time does not accept any options. In the future, flags for
Travis/CircleCI configurations may be added, but we shall see.

## License

Copyright © 2018 Reid "arrdem" McKenzie

Distributed under the [Eclipse Public License](./LICENSE), the same as Clojure.
