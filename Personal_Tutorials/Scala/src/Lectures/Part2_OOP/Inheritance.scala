package Lectures.Part2_OOP

object Inheritance extends App {
  sealed class Animal {
    val creatureType:String = "Wild";
    def eat():Unit  = println("nom - nom")
//    Protected means only use-able within class and subclasses
  }
//  Single class inheritance
  class Cat extends Animal{
  def crunch = {
    eat();
    println("crunch crunch")
  }
}
  val cat = new Cat
  cat.crunch



//  Constructors
  class Person(name:String, age:Int) {
    def this(name:String) = this(name,0)
}
  class Adult(name:String, age:Int, idCard:String) extends Person(name)


  class Dog(override val creatureType: String)  extends Animal {
//    override val creatureType: String = "domestic"
    override def eat ={
      super.eat()
      println("Doggy: crunch - crunch")
    }
  }

  val d = new Dog("K6")
  d.eat
  println(d.creatureType)


//  Type substitution
  val unknownAnimal: Animal = new Dog("K9"); // Polymorphism
  unknownAnimal.eat()


//  To prevent overrides
//  1 - use final on member
//  2 - use final on the entire class
//  3 - seal the class = extend classes in THIS FILE, prevent extension from another file
}
