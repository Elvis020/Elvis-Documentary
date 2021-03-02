package Lectures.Part2_OOP

object Inheritance_and_Traits extends App {
  class Animal{
    protected def eat():Unit  = println("nom - nom")
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
}
