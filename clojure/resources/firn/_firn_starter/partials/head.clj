(defn head
  [body]
  [:html
   [:head
    [:meta {:charset "UTF-8"}]
    [:link {:rel "stylesheet" :href "/static/css/main.css"}]]
   body])
