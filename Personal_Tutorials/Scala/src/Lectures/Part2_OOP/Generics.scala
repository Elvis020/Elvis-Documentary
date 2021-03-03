package Lectures.Part2_OOP

object Generics extends App{
//  Using generics
  class MyList[A]
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

}
