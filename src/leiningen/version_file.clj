(ns leiningen.version-file)

(defn write-version-file
  [project]
  (spit "VERSION" (:version project)))

(defn version-file
  "Write the project version to a file."
  [project & args]
  (write-version-file project))
