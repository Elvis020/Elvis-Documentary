package Day_3

import java.util.Date

import scala.+:

object Day3_Lec extends App {
  val elvis = new Person("elvis","amoako",33)
  val ama = new Person("ama","ananse")
  println(elvis.first)
  println(elvis.last)
  println(ama.age)
  println(ama.isAdult(12))
  println(elvis.toString)



  val timmy = new MyClass3
  println(timmy.toString)
  println(timmy.now)
  println(timmy.now)


  MySingleton.sayHello
  val case1 = Cash(1,12)
  val c2 = case1.copy()
  println(case1)
  println(case1.equals(c2))



//  Collections examples from the Labs

  println()
  println("** Printing Vectors **")
  val v1 = Vector(1,2,3,4,5)
  s"v1 = ${v1.foreach(x => print(x + " "))}"

  println()
  println()
  println("--Printing sequences--")
  val s1 = Seq(1,3,"Hello",4.5)
  val s2 = Seq(2,4,6,8)
  println(s2 :+ 90)
  println(s2 ++ Seq(87,32,11,21,23))
  println(s2.filter( _ > 11))  // Having problems with the underscore
  s"v1 = ${s1.foreach(x => print(x + " "))}"
  println(s2.length)
  println(s2.indices)
  println(s2.contains(2))

//  println()
  s"v1 = ${s2.foreach(x => print(x + " "))}"


  println()
  println()
  println("--Printing Arrays--")
  val namesList = List("Steve","Bob","John","Kelvin","Elvis")
  println(namesList.sortWith(_.compareTo(_) < 0).reverse)
  val arr = Array(1,2,3)
  arr(0) = 32

  val s : Seq[Int] = arr
  s.toArray
  val newS = s.reverse
  s"v1 = ${s foreach(x => print(x + " "))}"
  println()
  s"v1 = ${newS foreach(x => print(x + " "))}"

  println()
  println()
  println("-- Sets --")
  val setsArr = Set(1,3,5,7,9);println(setsArr)
  println(setsArr.contains(4))
  val addingToSet = setsArr & Set(3,4,6) //Intersection
  val UnitingSet = setsArr | Set(3,4,6) //Union
  val DiffSet = setsArr &~ Set(3,4,6)
  val addedSet = setsArr + 4;
  println(addingToSet)
  println(UnitingSet)
  println(DiffSet)
  println(addedSet + 5)


  /*
  val in constructors: only getters
  var in constructors: both setters and getters
  none in constructors: neither getter nor setter
   */
}

class Person(val first:String,val last:String,val age:Int){
//  Adding an additional constructor
  def this(first:String,last:String) = this(first,last,21)
  def isAdult(adultThreshold:Int) :Boolean = age > adultThreshold
  override def toString: String = s"$first $last $age"
}
class MyClass3  {
  lazy val now = new Date().toString
}

//Singleton objects....
object MySingleton {
  val myField = 100
  def sayHello = println("Hello")
}

//Case Classes
case class Cash ( pounds:Int, pence:Int)
//Case classes are used in pattern matching
//Case class cannot be inherited from another case class