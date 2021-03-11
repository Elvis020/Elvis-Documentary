package Lectures.Part2_OOP

object Generics extends App{
//  Using generics
  class MyList[+A]{
  def add[B >: A](element: B):MyList[B] = ??? //This solve the covariance issue
}
  class MyMap[Key,Value]

  val list_of_integers = new MyList[Int]
  val list_of_strings = new MyList[String]
//  NB: Traits can also be type parameterized
//  Objects cannot be type parameterized


//  Generic methods
  object MyList {
  def emptyList[A] :MyList[A] = ???
}

  val empty_list_of_integers = MyList.emptyList[Int]


//  Apparently there is a problem with Generics(Variance)
  class Animals
  class Dog extends Animals
  class Cat extends Animals

//  does List[Cat] extends List[Animals]? - Yes: and this indicates Covariance
  class Covariant[+A]
  val animal:Animals = new Cat
  val animalList:Covariant[Animals] = new Covariant[Cat]


//  Unbounded types
  class Cage[A <: Animals](animal: Animals) //Upper bounded type
  val cage = new Cage(new Dog)
  class Car
//  val newCage = new Cage(new Car)
}
