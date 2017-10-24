(defproject org.clojure/tools.analyzer.js "0.1.0-SNAPSHOT"
  :description "Provides js-specific passes for tools.analyzer."
  :url "https://github.com/clojure/tools.analyzer.js"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :dependencies [[org.clojure/clojure "1.7.0-alpha4"]
                 [org.clojure/tools.analyzer "0.6.5-SNAPSHOT"]
                 [org.clojure/tools.reader "0.8.12"]
                 [org.clojure/clojurescript "0.0-2371"]])
