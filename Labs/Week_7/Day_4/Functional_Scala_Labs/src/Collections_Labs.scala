

object Collections_Labs extends App {
  val file_structure = (new java.io.File(".")).listFiles.toList
//  1. val not_hidden_file_names: Unit = file_structure.filter(x => !x.toString.startsWith(raw""".\.""")).foreach(x => println(x))
//  2. val is_File = file_structure.partition(x => x.isFile); println(is_File)
//  is_File.sortBy(x => x.length)
//  3. val paired: Unit = file_structure filter(_.isFile) map(x => (x.getName,x.length)) foreach(x =>println(x))
  println()
  println("** All elements **")
  val paired1: Unit = file_structure.filter(_.isFile).sortBy(x => x.length).map(x => (x.getName,x.length))foreach(x =>println(x))
  println()
  println("** First 10 elements **")
  val paired2: Unit = file_structure.filter(_.isFile).sortBy(x => x.length).take(10).map(x => (x.getName,x.length))foreach(x =>println(x))
  println()
  println("** Last 10 elements **")
  val paired3: Unit = file_structure.filter(_.isFile).sortBy(x => -x.length).take(10).map(x => (x.getName,x.length))foreach(x =>println(x))

}
