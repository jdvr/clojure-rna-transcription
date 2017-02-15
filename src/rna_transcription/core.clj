(ns rna-transcription.core
  (:gen-class))

(def dna-nucleotide-to-rna {
  \G \C
  \C \G
})

(defn translate [string]
  (str (dna-nucleotide-to-rna (first string))))







