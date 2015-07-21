(ns deraen.boot-ctn
  (:require [boot.core :refer [get-env]]
            [clojure.tools.namespace.repl :refer [set-refresh-dirs]]))

(defn init-ctn!
  "Setup clojure.tools.namespace to watch Boot temp dirs.

   Options:
   - :remove-fn - Remove folders which contain `.no-reload`-file"
  [& {:keys [remove-fn]}]
  (apply set-refresh-dirs (cond->> (get-env :directories)
                                     remove-fn (remove remove-fn))))
