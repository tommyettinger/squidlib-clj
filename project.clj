(defproject squidlib-clj "0.1.0-SNAPSHOT"
  :description ""
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories [["jitpack" "https://jitpack.io"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.github.SquidPony.SquidLib/squidlib "-SNAPSHOT"]
                 [com.github.SquidPony.SquidLib/squidlib-util "-SNAPSHOT"]]
  :aot [squidlib-clj.core]
  :main squidlib-clj.core)
