(ns primes.core
   (:require [primes.core :refer :all]
             [clojure.pprint :refer :all])
)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn primes [n]
  (take n(filter 
  (fn is-prime [n]
    (nil?
    (some
      #(zero? (mod n %))
      (range 2 n))))
(range 2 10000))))


(defn print-primes [n]
  (printf "      Primes Multiplication Tables\n")
  (print "    ")
  (doseq [i (primes n)]
    (printf "%4d" i ))
  (println)
  (doseq [i (primes n)]
    (printf "%4d" i )
    (doseq [j (primes n)]
      (printf "%4d" (* i j) ))
    (println)))

