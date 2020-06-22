;
;  (C) Copyright 2017, 2018, 2020  Pavel Tisnovsky
;
;  All rights reserved. This program and the accompanying materials
;  are made available under the terms of the Eclipse Public License v1.0
;  which accompanies this distribution, and is available at
;  http://www.eclipse.org/legal/epl-v10.html
;
;  Contributors:
;      Pavel Tisnovsky
;

(ns clj-csv-loader.csv-loader)

(require '[clojure.data.csv :as csv])
(require '[clojure.java.io  :as io])

(defn csv-data->maps
  "Convert read CSV data into proper Clojure map."
  [csv-data]
  (map zipmap
    (->> (first csv-data)  ;; header
         (map keyword)     ;; heder items -> keywords
         repeat)
    (rest csv-data)))

(defn load-csv
  "Load CSV specified by filename and convert it to a proper Clojure map."
  [filename]
  (with-open [reader (io/reader filename)]
    (let [data (csv/read-csv reader)]
         (doall (csv-data->maps data)))))

(defn load-csv-for-all-dates
  "Load CSV files for all dates specified."
  [dates-from data-directory filename]
  (zipmap dates-from
          (for [date dates-from]
            (let [full-filename (str data-directory "/" date "/" filename)]
              (load-csv full-filename)))))
