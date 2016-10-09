(ns recursion)

(defn product [coll]
  (if (empty? coll)
    1
    (* (first coll) (product (rest coll)))))


(product [])                                                ;=> 1  ; special case
(product [1 2 3])                                           ;=> 6
(product [1 2 3 4])                                         ;=> 24
(product [0 1 2])                                           ;=> 0
(product #{2 3 4})


(defn singleton? [coll]
  (and (= false (empty? coll)) (empty? (rest coll))))

(singleton? [1])                                            ;=> true
(singleton? #{2})                                           ;=> true
(singleton? [])                                             ;=> false
(singleton? [1 2 3])                                        ;=> false

(defn my-last [coll]
  (if (empty? (rest coll))
    (first coll)
    (my-last (rest coll))))

(my-last [])                                                ;=> nil
(my-last [1 2 3])                                           ;=> 3
(my-last [2 5])                                             ;=> 5

(defn max-element [a-seq]
  (if (empty? a-seq)
    nil
    (if (singleton? a-seq)
      (first a-seq)
      (max (first a-seq) (max-element (rest a-seq))))))

(max-element [1 3 6])
(max-element [2 4 1 4])                                     ;=> 4
(max-element [2])                                           ;=> 2
(max-element [])                                            ;=> nil

(defn seq-max [seq-1 seq-2]
  (if (> (count seq-1) (count seq-2))
    seq-1
    seq-2))

(seq-max [1 3] [1 3])

(defn longest-sequence [a-seq]
  (if (empty? a-seq)
    nil
    (if (singleton? a-seq)
      (first a-seq)
      (seq-max (first a-seq) (longest-sequence (rest a-seq))))))

(longest-sequence [[1 2] [] [1 2 3]])                       ;=> [1 2 3](defn my-filter [pred? a-seq]
(longest-sequence [[1 2]])                                  ;=> [1 2]
(longest-sequence [])                                       ;=> nil

(defn my-filter [pred? a-seq]
  (if (empty? a-seq)
    a-seq
    (if (pred? (first a-seq))
      (cons (first a-seq) (my-filter pred? (rest a-seq)))
      (my-filter pred? (rest a-seq)))))


(my-filter odd? [1 2 3 4])                                  ;=> (1 3)
(my-filter (fn [x] (> x 9000)) [12 49 90 9001])             ;=> (9001)
(my-filter even? [1 3 5 7])                                 ;=> ()

(defn sequence-contains? [elem a-seq]
    (if (empty? a-seq)
      false
      (if (= elem (first a-seq))
          true
          (sequence-contains? elem (rest a-seq)))))



(defn my-take-while [pred? a-seq]
  (if (empty? a-seq) ()
    (if (pred? (first a-seq))
       (cons (first a-seq) (my-take-while pred? (rest a-seq)))
       ())))

(defn my-drop-while [pred? a-seq]
  (if (empty? a-seq) ()
    (if (pred? (first a-seq))
      (my-drop-while pred? (rest a-seq))
      a-seq)))


(defn seq= [a-seq b-seq]
  (if (and (empty? a-seq) (empty? b-seq))
    true
    (if (and (= (count a-seq) (count b-seq))(= (first a-seq) (first b-seq)))
        (seq= (rest a-seq) (rest b-seq))
        false)))


(defn my-map [f seq-1 seq-2]
  (if (or (empty? seq-1) (empty? seq-2))
    ()
    (cons (f (first seq-1) (first seq-2)) (my-map f (rest seq-1) (rest seq-2)))))

(defn power [n k]
  :-)

(defn fib [n]
  :-)

(defn my-repeat [how-many-times what-to-repeat]
  [:-])

(defn my-range [up-to]
  [:-])

(defn tails [a-seq]
  [:-])

(defn inits [a-seq]
  [:-])

(defn rotations [a-seq]
  [:-])

(defn my-frequencies-helper [freqs a-seq]
  [:-])

(defn my-frequencies [a-seq]
  [:-])

(defn un-frequencies [a-map]
  [:-])

(defn my-take [n coll]
  [:-])

(defn my-drop [n coll]
  [:-])

(defn halve [a-seq]
  [:-])

(defn seq-merge [a-seq b-seq]
  [:-])

(defn merge-sort [a-seq]
  [:-])

(defn split-into-monotonics [a-seq]
  [:-])

(defn permutations [a-set]
  [:-])

(defn powerset [a-set]
  [:-])

