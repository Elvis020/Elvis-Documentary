package Lectures.Part2_OOP

object MethodNotations extends App {
  class Person(val name:String, favouriteMovie:String, val age:Int=0) {
    def likes(movie: String) : Boolean = movie.equals(favouriteMovie)
//    def hangsOutWith(p:Person):String = s"${this.name}  hangs out with ${p.name}"
//    def +(p:Person):String = s"${this.name}  hangs out with ${p.name}"
    def +(nickName:String):Person = new Person(s"$name($nickName)",favouriteMovie)
    def unary_+ : Person = new Person(name,favouriteMovie,age+1)
    def apply():String = s"$name's favourite movie is $favouriteMovie"
    def apply(n:Int):String= s"$name watched her favourite movie $favouriteMovie $n times.And she is $age years old."
    def learns(l:String)= s"${this.name} learns $l"
//    def learns(l:String="Scala") = s"${this.name} learns $l"
    def learnsScala(): String = this learns "Scala"
  }

  val mary = new Person("Mary", "Inception")
  val tom = new Person("Tommy", "Gladiator")
//  println(mary.likes("Gladiator"))
  println("-- Using the infix notation  --")
  println(mary likes "Inception")  //Infix notation: This notation only
  // works when the method has only one parameter(Syntactic sugar)

  println()
  println("Methods acting as operator")
//  println(tom + mary) //or println(tom.+(mary))
//  In Scala, all operators are methods.


  println()
  println("Prefix Notation")
  val v = -1
  val y = 1.unary_- //x and y are the same

  println()
  println("Using the apply() method")
  println(mary.apply())
//  Or
  println(mary())

  println((mary + ("the rockstar"))())
  println(mary learns("Maths"))
  println(mary.learnsScala())
  println(mary(2))
  println((+mary).age)

//  println(+mary)
}
