package Lectures.Part2_OOP

object AbstractDataTypes extends App{
  //  Abstract:These are classes that contain unimplemented methods or fields
  abstract class Animal{
    val creatureType:String;
    def eat():Unit;
  }

  class Dog extends Animal{
    override val creatureType: String = "Canine"
    override def eat(): Unit = println("crunch - crunch")
  }
  //  NB:Traits are like abstract classes
  //  Traits by default have abstract fields
  trait Carnivore{
    def eat(animal: Animal):Unit
  }
  class Crocodile extends Animal with Carnivore{
    val creatureType: String = "crock"
    override def eat(): Unit = println("nom-nom")
    override def eat(animal: Animal): Unit = println(s"I'm a crocodile and I'm eating a ${animal
      .creatureType}")
  }

  val dog = new Dog
  val crocky = new Crocodile
  crocky.eat(dog)


//  Both abstract classes and traits have non-abstract and abstract methods
//  Traits don't have constructor parameters
//  You can extend multiple traits not multiple abstract class
//  Traits describe behaviours
}
