(ns cljs-testing-with-lein.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [cljs-testing-with-lein.core]))

(deftest a-test
  (testing "I pass"
    (is (= 1 1))))
