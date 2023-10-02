(ns training-cljs.core
  (:require [reagent.dom :as rdom]))

(defn component [] [:div "coucou"])

(defn init! [& args]
  (rdom/render [component] (js/document.getElementById "app")))
