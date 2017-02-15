(ns rna-transcription.core
  (:gen-class))

(def dna-nucleotide-to-rna {
  \G \C
  \C \G
  \T \A
  \A \U
})

(defn translate [string]
  (str (dna-nucleotide-to-rna (first string))))







