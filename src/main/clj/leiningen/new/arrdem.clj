(ns leiningen.new.arrdem
  "A Leiningen template for a new \"arrdem\" flavored bprojects."
  {:authors ["Reid \"arrdem\" McKenzie <me@arrdem.com>"]
   :license "https://www.eclipse.org/legal/epl-v10.html"}
  (:require [leiningen.new.templates
             :refer [->files name-to-path sanitize-ns renderer year]]
            [clojure.java.io :as io]))

(def ^{:const true}
  project-version "0.1.0-SNAPSHOT")

(def render
  (renderer "arrdem"))

;; main template entry point
(defn arrdem
  "A Leiningen template for new \"arrdem\" flavored projects."
  [^String short-name & features]
  (let [fq-name (str "me.arrdem/" short-name)
        data    {:name            short-name
                 :fq-name         fq-name
                 :clojure-version "1.9.0"
                 :fs-path         (name-to-path short-name)
                 :sanitized-ns    (sanitize-ns short-name)
                 :year            (year)}]
    (->files data
             [".editorconfig"
              (render "editorconfig" data)]

             [".gitignore"
              (render "gitignore" data)]

             ["LICENSE"
              (render "LICENSE" data)]

             ["README.md"
              (render "README.md" data)]

             ["etc/{{name}}.jpg"
              (io/reader (io/resource "template.jpg"))]

             ["docs/index.md"
              (render "index.md" data)]

             ["project.clj"
              (render "project.clj" data)]

             ["src/dev/clj/user.clj"
              (render "user.clj" data)]

             ["src/main/clj/{{fs-path}}/core.clj"
              (render "core.clj" data)]

             ["src/test/clj/{{fs-path}}/core_test.clj"
              (render "test.clj" data)])))
