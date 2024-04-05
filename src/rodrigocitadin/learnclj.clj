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

(def -main #(println (str "Hello, " %1)))

; Using the REPL, compute the sum of 7654 and 1234.
(+ 7654 1234)

; Rewrite the following algebraic expression as a Clojure expression: ( 7 + 3 * 4 + 5 ) / 10.
(/ (+ 7 (+ 5 (* 3 4))) 10)

; Define a function greet that takes no arguments and prints "Hello".

(defn greet [] (println "Hello"))

; Redefine greet using def with fn and #().

(def greet2 (fn [] (println "Hello")))

(def greet3 #(println "Hello"))

; Define a function greeting which:
; Given no arguments, returns "Hello, World!"
; Given one argument x, returns "Hello, x!"
; Given two arguments x and y, returns "x, y!"

(defn greeting
  ([] (greeting "Hello" "World"))
  ([x] (greeting "Hello" x))
  ([x y] (str x ", " y "!")))

; Define a function do-nothing which takes a single argument x and returns it, unchanged.

(defn do-nothing [x] x)

; Define a function always-thing which takes any number of arguments, ignores all of them, and returns the number 100.

(defn always-thing [& xs] 100)

; 6) Define a function make-thingy which takes a single argument x. It should return another function, which takes any number of arguments and always returns x.

(defn make-thingy [x]
  (fn [& _args] x))

; 7) Define a function triplicate which takes another function and calls it three times, without any arguments.

(defn triplicate [f] (f) (f) (f))

; 8) Define a function opposite which takes a single argument f. It should return another function which takes any number of arguments, applies f on them, and then calls not on the result. The not function in Clojure does logical negation.

(defn opposite [f]
  (fn [& args] (not (apply f args))))

; 9) Define a function triplicate2 which takes another function and any number of arguments, then calls that function three times on those arguments. Re-use the function you defined in the earlier triplicate exercise.

(defn triplicate2 [f & args]
  (triplicate (fn [] (apply f args))))

; 10) Using the java.lang.Math class (Math/pow, Math/cos, Math/sin, Math/PI), demonstrate the following mathematical facts:
; The cosine of pi is -1
; For some x, sin(x)^2 + cos(x)^2 = 1

(Math/cos Math/PI)

(+ (Math/pow (Math/sin 0.2) 2)
   (Math/pow (Math/cos 0.2) 2))

; 11) Define a function that takes an HTTP URL as a string, fetches that URL from the web, and returns the content as a string.

(defn http-get [url]
  (slurp
   (.openStream
    (java.net.URL. url))))

(defn http-get2 [url]
  (slurp url))

; 12) Define a function one-less-arg that takes two arguments:
; f, a function
; x, a value
; and returns another function which calls f on x plus any additional arguments.

(defn one-less-arg [f x]
  (fn [& args] (apply f x args)))

; 13) Define a function two-fns which takes two functions as arguments, f and g. It returns another function which takes one argument, calls g on it, then calls f on the result, and returns that.
; That is, your function returns the composition of f and g.

(defn two-fns [f g]
  (fn [x] (f (g x))))
