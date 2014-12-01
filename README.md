# lein-version-file

A Leiningen plugin that writes your project version to a file
(`./VERSION` in the root of your project).

## Usage

Put `[lein-version-file "0.0.1"]` into the `:plugins` vector of your
project.clj. Or in the `:plugins` vector in the `:dev` profile in your project.clj.

    $ lein version-file

Manually write the version from your project.clj to a file.

## License

Copyright © 2014 William Roe

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
