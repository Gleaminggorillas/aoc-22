(ns gg.day-one
  (:require [clojure.string :as str]))

(def toy-data "1000
2000
3000

4000

5000
6000

7000
8000
9000

10000")

(defn to-sum [string-sum]
  (->>
    (str/split-lines string-sum)
    (map #(Integer/parseInt %))
    (reduce +)
    ))

(def example  "100\n200\n300")

(to-sum example)

(def fdata (slurp "files/day-one.txt"))

(defn max-cals [input]
(->> (str/split input #"\n\n")
     (map #(to-sum %))
     (apply max)))

(max-cals fdata)


(defn max-three [input]
(->> (str/split fdata #"\n\n")
     (map #(to-sum %))
     (sort)
     (take-last 3)
     (reduce +)
     )
)

(max-three fdata)
