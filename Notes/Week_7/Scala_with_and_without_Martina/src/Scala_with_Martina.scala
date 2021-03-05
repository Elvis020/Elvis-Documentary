object Scala_with_Martina extends App {
  val  p1 = new Person()
  println(p1.first + " " + p1.last)
  println()
  println("Immutable variables")
  val myVal = 10; println(myVal)
  val z = {val a=5;a +3}; println(z)


  println()
  println("Mutable variables")
  var myV :Int = 20;myV += 10
  println(myV + myV)
  var `a.b` = 4
  println(s"${`a.b` + 5}")


  println()
  println("Using def")
  def times2(i:Int) = i * 2;
  println(times2(3))

  def upper(strings: String*) = strings.map(_.toUpperCase())
  println(upper("one","two"))

  def sayHello(): Unit = println("Hello Everyone!")
  sayHello()


  def *(a:Int) = a +a
  println(*(3))


  println()
  println("-- String interpolation in Scala --")
  val a=1;val b=3
  println(s"$a + $b = ${a+b}")


  println()
  println("-- Regular Expressions --")
  val order = "A glass of beer"
  val order2 = "A bottle of wine"
  println(order.matches(".*beer"))
  val drink = raw".*(glass|bottle) of (beer|wine|coke).*".r
  val drink(yourA,yourD) = order
  1 to 5 foreach(println(_))

    }

class Person(val first:String="Joe",val last:String="Doe")
