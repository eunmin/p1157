(ns p1157.core
  (:require [clojure.string :refer [upper-case]]))

(defn max-char [s]
  (->> s
       upper-case
       sort
       (partition-by identity)
       (sort-by count >)
       first
       first))
