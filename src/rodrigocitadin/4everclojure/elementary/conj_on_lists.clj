(ns rodrigocitadin.4everclojure.elementary.conj-on-lists)

(= '(1 2 3 4) (conj '(2 3 4) 1))

(= '(1 2 3 4) (conj '(3 4) 2 1))
