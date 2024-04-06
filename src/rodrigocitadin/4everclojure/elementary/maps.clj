(ns rodrigocitadin.4everclojure.elementary.maps)

(= 20 ((hash-map :a 10, :b 20, :c 30) :b))

(= 20 (:b {:a 10, :b 20, :c 30}))
