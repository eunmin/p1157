(ns p1157.core-test
  (:require [clojure.test :refer :all]
            [p1157.core :refer :all]))

(deftest max-char-test
  (is (= (max-char "zZa") \Z))
  (is (= (max-char "z") \Z))
  (is (= (max-char "baaa") \A)))

