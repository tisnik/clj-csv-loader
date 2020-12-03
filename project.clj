;
;  (C) Copyright 2018, 2019, 2020  Pavel Tisnovsky
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
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License",
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/data.csv "0.1.2"]]
  :plugins [[test2junit "1.1.0"]
            [codox "0.8.11"]
            [lein-test-out "0.3.1"]
            [lein-cloverage "1.0.7-SNAPSHOT"]])
