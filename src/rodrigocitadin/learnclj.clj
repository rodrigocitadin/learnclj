(ns rodrigocitadin.learnclj
  (:gen-class))

; (defn greet
;   "Callable entry point to the application."
;   [data]
;   (println (str "Hello, " (or (:name data) "World") "!")))

; (defn -main
;   "I don't do a whole lot ... yet."
;   [& args]
;   (greet {:name (first args)}))

(defn -main [world]
  (println (str "Hello, " world)))

