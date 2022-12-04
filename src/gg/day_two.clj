(ns gg.day-two
  (:require [clojure.string :as str]))

;; {:a rock :b paper :c scissors}
;; {:x {rock 1} :y {paper 2} :z {scissors 3}}
;; {:lose 0 :draw 3 :win 6}

;; cheekky part 2
;; x lose y draw z win

(def data (slurp "files/day-two.txt"))

(def table {
            "A X" 4,
            "A Y" 8,
            "A Z" 3,
            "B X" 1,
            "B Y" 5,
            "B Z" 9,
            "C X" 7,
            "C Y" 2,
            "C Z" 6
            })

(def table-two {
            "A X" 3, ;; rock lose
            "A Y" 4, ;; rock draw
            "A Z" 8, ;; rock win
            "B X" 1, ;; paper
            "B Y" 6,
            "B Z" 9,
            "C X" 2, ;; scissors
            "C Y" 6,
            "C Z" 7
             })

(table "A X")

(str/split-lines data)

(defn splitstring [input]
 (->> (str/split input #"\n")
      (map #(table-two %))
      (reduce +)
))

(splitstring data)




