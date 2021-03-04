object Main extends App{
  var list_files_in_a_directory = (new java.io.File(".")).listFiles
  list_files_in_a_directory foreach(x => println(x))
}
