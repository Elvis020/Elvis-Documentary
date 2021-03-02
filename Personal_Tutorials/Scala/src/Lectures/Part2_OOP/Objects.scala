package Lectures.Part2_OOP

object Objects {
  def main(args: Array[String]): Unit ={
    /*
Scala does not have class level functionality
Objects are just like Classes but objects don't receive a parameter
With the object, when it is defined, the name of the object is its type
 and instance. WOW!


 Scala objects are singleton instances
 You can put a class and an object with the same name in a scope.
 */

    object Person {
      val N_EYES = 2
      def canFly:Boolean = true
      def apply(mother:Person, father:Person):Person = new Person("Bobbie")
    }
    // Class level functionality

    //  Factory methods - it is widely used

    println(Person.N_EYES)
    println(Person.canFly)

    class Person(name:String) //instance level functionality
    val mary = new Person("Mary")
    val john = new Person("John")

    //  bobbie is not a constructor, but an apply method on the object person.
    val bobbie = Person(mary,john);


    //A scala application is a scala object with a main function
  }

}
