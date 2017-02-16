(ns rna-transcription.core
  (:require [clojure.string :as cstr])
  (:gen-class))

(def dna-nucleotide-to-rna {
  \G \C
  \C \G
  \T \A
  \A \U
})

(defn isValid? [c]
  (contains? dna-nucleotide-to-rna c))


(defn translate-c [c]
  (if (isValid? c)
    (str (dna-nucleotide-to-rna c))
    (throw (IllegalArgumentException. "invalid string nucleotide"))))


(defn translate [string]
  (cstr/join "" (map translate-c string)))



