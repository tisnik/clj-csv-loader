;
;  (C) Copyright 2018, 2019, 2020, 2021  Pavel Tisnovsky
;
;  All rights reserved. This program and the accompanying materials
;  are made available under the terms of the Eclipse Public License v1.0
;  which accompanies this distribution, and is available at
;  http://www.eclipse.org/legal/epl-v10.html
;
;  Contributors:
;      Pavel Tisnovsky
;

(defproject org.clojars.tisnik/clj-csv-loader "0.1.0-SNAPSHOT"
  :description "Set of helper functions for loading CSV files."
  :url "https://github.com/tisnik/clj-csv-loader"
  :license {:name "Eclipse Public License",
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/data.csv "0.1.2"]]
  :plugins [[lein-codox "0.10.7"]
            [test2junit "1.1.0"]
            ;[lein-test-out "0.3.1"]
            [lein-cloverage "1.0.7-SNAPSHOT"]
            [lein-kibit "0.1.8"]
            [lein-clean-m2 "0.1.2"]
            [lein-project-edn "0.3.0"]
            [lein-marginalia "0.9.1"]]
  :project-edn {:output-file "doc/details.clj"})
