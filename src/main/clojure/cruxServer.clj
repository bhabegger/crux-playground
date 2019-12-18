(ns cruxServer
  (:require [crux.api :as crux]))

(def crux
  (crux/start-node {
     :crux.node/topology :crux.standalone/topology
     :crux.node/kv-store "crux.kv.memdb/kv"
     :crux.standalone/event-log-dir "data/eventlog-1"
     :crux.kv/db-dir "data/db-dir"
     :crux.standalone/event-log-kv-store "crux.kv.memdb/kv"
   })
)

