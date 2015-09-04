(ns deraen.boot-ctn
  (:require [boot.core :refer [get-env]]
            [clojure.tools.namespace.repl :refer [set-refresh-dirs]]))

(defn init-ctn!
  "Setup clojure.tools.namespace to watch Boot temp dirs.

   Options:
   - :remove-fn - Use this to filter folders, called with the path as a parameter."
  [& {:keys [remove-fn]}]
  (apply set-refresh-dirs (cond->> (get-env :directories)
                                     remove-fn (remove remove-fn))))
