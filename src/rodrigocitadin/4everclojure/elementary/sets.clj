(ns rodrigocitadin.4everclojure.elementary.sets
  (:require
   [clojure.set]))

(= #{:a :b :C} (set '(:a :a :b :c :c :c :c :d :d)))

(= #{:a :b :C} (clojure.set/union #{:a :b :c} #{:b :c :d}))
