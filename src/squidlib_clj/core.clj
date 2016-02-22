(ns squidlib-clj.core
  (:import [squidpony.squidmath RNG]))

(def mother-rng (RNG. 1337))

(defn -main
  "I don't do a whole lot."
  [& args]
  (println (.nextInt mother-rng 100) "Hello, World!"))
