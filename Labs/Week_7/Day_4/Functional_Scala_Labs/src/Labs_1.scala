object Labs_1 extends App{
  def  op_do = (operation_name:String) => operation_name match {
    case "add" => ((x:Int,y:Int) => x+y)
    case "subtract" => ((x:Int,y:Int) => x-y)
    case "multiply" => ((x:Int,y:Int) => x*y)
    case "power" => ((x:Int,y:Int) => x^y)
  }
  val addMe = op_do("add")
  val subMe = op_do("subtract")
  val mulMe = op_do("multiply")
  val powMe = op_do("power")
  println(addMe(2,5))
  println(subMe(2,5))
  println(mulMe(2,5))
  println(powMe(2,5))
}
