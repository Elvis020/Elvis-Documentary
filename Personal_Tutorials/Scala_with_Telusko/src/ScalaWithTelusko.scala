import scala.collection.immutable.Nil.tail

object ScalaWithTelusko extends App{
  var result = 8.+(7)  // 🗡 🤤The + is also a method/function in Scala 🗡
  println(result)



//  🥰Creating a class wit constructors in Scala🎟
  case class Student(var age:Int = 32, var name:String = "Elvis", var marks:Int = 66) {
  def show(): Unit = println("Hello " + name)

//  Creating a function ot compare marks  in the Student class
  def >(s: Student): Boolean = if(marks > s.marks ) true else false
}
  var s1  = Student(name="Amoako")
  var s3  = Student(21,"Elvis",99)
  println(s1)
  s1.show()
  println(s3.>(s1))


//  🥰 Arrays in Scala.
  var numsArr: List[Int] = List(1,2,3,4,5)
  var numsArr2: List[Any] = List(1,true,3,4,"Hello")
  println("---\uD83E\uDD19 Normal for-loop in Scala---")
  for(i <- numsArr) print(i + " ")   // Normal for loop in Scala
  println()
  println("---\uD83E\uDD19 Lambda Expressions in Scala---")
  numsArr.foreach{i:Int => print(i + " ")}   //Lambda expressions in Scala
  println()

//  Applying Collection methods on Arrays in Scala🙉
  println("+++\uD83D\uDE49 Applying the reverse method on the list array \uD83D\uDE49+++")
  numsArr.reverse.foreach{i:Int => print(i +" ")}
  println()


//  Using the drop method
  println("--- \uD83C\uDFEC Using the drop method \uD83C\uDFEC ---") //
//  numsArr.reverse.drop(1).foreach{i:Int => print(i +" ")} //This drops 3 elements
//  numsArr2 drop(3) foreach{i => print(i +" ")} //This drops 3 elements
  numsArr2 foreach{i => print(i +" ")} //This drops 3 elements
  println()


//  Creating a List of a Class
  println("\uD83E\uDD51 ** Food Zones *** \uD83E\uDD51")
  case class FoodZone(name:String,location:String)
  var foodZones = List(FoodZone("AmaPransah","Accra"),FoodZone("KofiB","CapeCoast"),FoodZone
  ("KojoPratt","Taadi"))
  foodZones foreach{i => println("+ "+i.name)}
  println(foodZones.head) //To get the first element in an array
  println(foodZones.tail) //To get the elements that are not first in an array
  println(foodZones.tail.tail) //To get the last element in an array



//Filtering an array in Scala
  println("=== Filtering an array in Scala ===")
  numsArr filter(x => x>=3) foreach{i => print(i+ " ")}

////  Partitioning in Scala
//  var newParts = numsArr2 partition(x => x>(4))
//  println(newParts)

}
