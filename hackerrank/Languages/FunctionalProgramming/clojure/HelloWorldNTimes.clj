(defn hello_word_n_times [n]
  (if (> n 0) 
    (do 
      (println "Hello World") (hello_word_n_times (- n 1) )
    )
    (str "")
  )  
)

(def n (Integer/parseInt (read-line)))
(hello_word_n_times n)
