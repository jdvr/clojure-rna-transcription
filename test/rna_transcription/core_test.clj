(ns rna-transcription.core-test
  (:require [clojure.test :refer :all]
            [rna-transcription.core :refer :all]))

(deftest a-test
  (testing "rna-transcription"
    (testing "one element strings"
      (is (= (translate "G") "C"))
      (is (= (translate "C") "G"))
      (is (= (translate "T") "A"))
      (is (= (translate "A") "U"))
      )
    (testing "one element invalid string"
      (is (thrown? IllegalArgumentException (translate "S")))
      )
    (testing "multiple nucleotide string"
      (is (= (translate "GCTA") "CGAU"))
      )))

