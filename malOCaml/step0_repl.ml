
let read str = str

(* This `eval` is a function with two arguments - the second argument gets ignored  *)
let eval ast any = ast
let print exp = exp
let rep str = print (eval (read str) "")

let rec main =
  try
    while true do
      print_string "user> ";
      print_endline (rep (read_line ()));
    done
  with End_of_file -> ()


