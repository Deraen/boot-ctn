# boot-ctn

Setup [clojure.tools.namespace] to watch Boot temp dirs.

[![Clojars Project](http://clojars.org/deraen/boot-ctn/latest-version.svg)](http://clojars.org/deraen/boot-ctn)

## Usage

**build.boot:**
```clj
(require '[deraen.boot-ctn :refer [init-ctn!]])

(init-ctn!)

; If you want to filter dirs, use :filter-fn option.
; To remove folders with .no-reload file:
(init-ctn! :remove-fn #(.exists (io/file % ".no-reload")))
```

## License

Copyright © 2015 Juho Teperi

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

[clojure.tools.namespace]: https://github.com/clojure/tools.namespace
