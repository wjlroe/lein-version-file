(ns lein-version-file.plugin
  (:require [leiningen.version-file :refer [write-version-file]]))

(defn middleware
  [project]
  (update-in project [:injections] concat
             `[~(write-version-file project)]))
