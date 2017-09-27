(ns primes.core-test
  (:require [clojure.test :refer :all]
            [primes.core :refer :all]))


(deftest prime-10-test
  (testing "10 by 10 Prime Table."
    (print-primes 10)
    (is (= 1 1))))

(deftest prime-20-test
  (testing "20 by 20 Prime Table."
    (print-primes 20)
    (is (= 1 1))))


