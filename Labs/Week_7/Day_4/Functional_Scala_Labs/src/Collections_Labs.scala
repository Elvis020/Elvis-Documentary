

object Collections_Labs extends App {
  val file_structure = (new java.io.File(".")).listFiles.toList
  val not_hidden_file_names: Unit = file_structure.filter(x => !x.toString.startsWith(raw""".\.""")).foreach(x => println(x))
  val is_File = file_structure.partition(x => x.isFile); println(is_File)
  val paired: Unit = file_structure filter(_.isFile) map(x => (x.getName,x.length)) foreach(x =>println(x))

}
