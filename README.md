# Defsquare ClojureScript Immersion

A simple tools-deps project for clojurescript training. Includes :

- shadow-cljs for packaging and dev tools
- reagent as react wrapper
- tailwindcss for design system

## Usage

To launch a watcher which hot reload your code, just type

```shell
clj -A:shadow-cljs watch app
```

and go to http://localhost:3000

## REPL

To setup cursive REPL for cljs, you need to create an nREPL connected to shadow-cljs REPL as remote.

1. Run -> Run... -> Edit Configurations... -> + -> Clojure REPL -> Remote
2. Connect to server -> host localhost -> port 9000
3. Launch your app with `clj -A:shadow-cljs watch app` then go to `localhost:3000`
4. Launch your REPL and type `(shadow/repl :app)`
5. you can now evaluate forms in cursive REPL and interact with browser

