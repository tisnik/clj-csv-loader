;
;  (C) Copyright 2018, 2020, 2021  Pavel Tisnovsky
;
;  All rights reserved. This program and the accompanying materials
;  are made available under the terms of the Eclipse Public License v1.0
;  which accompanies this distribution, and is available at
;  http://www.eclipse.org/legal/epl-v10.html
;
;  Contributors:
;      Pavel Tisnovsky
;

(ns clj-csv-loader.csv-loader-test
  (:require [clojure.test :refer :all]
            [clj-csv-loader.csv-loader :refer :all]))

;
; Common functions used by tests.
;

(defn callable?
  "Test if given function-name is bound to the real function."
  [function-name]
  (clojure.test/function? function-name))

(deftest test-csv-data->maps-existence
  "Check that the clj-csv-loader.csv-loader/csv-data->maps function definition exists."
  (testing "if the clj-csv-loader.csv-loader/csv-data->maps function definition exists."
           (is (callable? 'clj-csv-loader.csv-loader/csv-data->maps))))


(deftest test-load-csv-existence
  "Check that the clj-csv-loader.csv-loader/load-csv function definition exists."
  (testing "if the clj-csv-loader.csv-loader/load-csv function definition exists."
           (is (callable? 'clj-csv-loader.csv-loader/load-csv))))


(deftest test-load-csv-for-all-dates-existence
  "Check that the clj-csv-loader.csv-loader/load-csv-for-all-dates function definition exists."
  (testing
    "if the clj-csv-loader.csv-loader/load-csv-for-all-dates function definition exists."
    (is (callable? 'clj-csv-loader.csv-loader/load-csv-for-all-dates))))
