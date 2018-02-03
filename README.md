# @arrdem's Leiningen template

I realized I'd been hammering out a bunch of small projects that shared a lot of structure, in that
they:

- had more or less the same README structure
- used the contrib style `src/{dev,main,test}/{clj,cljc,jvm}` directory structure
- leveraged my [lein-git-version](https://github.com/arrdem/lein-git-version) plugin
- had a bunch of config files (`.gitignore`, `.editorconfig`) I just copied around

## Installation

Add a plugin dependency on `[me.arrdem/lein-template "0.1.0"]` to
your `~/.lein/profiles.clj`:

``` clojure
{:user {:plugins [[me.arrdem/lein-template "0.1.0"]]}
```

## Usage

    lein new arrdem some-absurd-name

## License

Copyright © 2018 Reid "arrdem" McKenzie

Distributed under the [Eclipse Public License](./LICENSE), the same as Clojure.
