package Lectures.Part2_OOP

object OOP_Basics extends App {
  val p = new Person("Elvis",43)
  println(p.name)
  p.greeting("Daniel")
  p.greeting()
}



//Constructors
class Person(val name:String, age:Int = 0){
//  Body of a class
//  x and name are fields
  val x = 2
  println(1+2)

//  Methods Overloading
  def greeting(name:String) :Unit = println(s"${this.name} says: Hi, $name")
  def greeting() :Unit = println(s"Hi, I am $name")


//  Multiple Constructors
  def this(name:String) = this(name,0)
  def this() = this("John Doe")

}
//Class parameters are not fields