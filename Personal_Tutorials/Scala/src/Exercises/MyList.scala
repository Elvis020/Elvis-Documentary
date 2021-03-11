package Exercises

abstract class MyList[A] {
//  List[String] newList = new Array[String](32);
  def head:A
  def tail:MyList[A]
  def isEmpty():Boolean
  def add[B >: A ](element:B):MyList[B]
  def printElements[A]: String = ""

//  Adding the toString methodZ
  override def toString:String = "[" + printElements + "]"
}

object EmptyList extends MyList[Nothing]{
  def head():Nothing = throw new NoSuchElementException
  def tail():MyList[Nothing] = throw new NoSuchElementException
  def isEmpty():Boolean = true
  def add[B >: Nothing](element:B):MyList[B] = new Cons(element, EmptyList)
  //    ??? means nothing will happen
  def printElements: String = ""
}

//Linked List:Composed of an element and a list
class Cons[+A](h:A, t:MyList[A]) extends MyList[A] {
  def head: A = h
  def tail: MyList[A] = t
  def isEmpty():Boolean = false
  def add[B >: A](element:B):MyList[B] =new Cons(element, this)
  def printElements: String = {
    if(t.isEmpty) "" + h
    else h +" " + t.printElements
  }
}


object ListTest extends App {
//  val list = new Cons(1,new Cons(2,new Cons(3,EmptyList)))
//  println(list.tail.head)
//  println(list.add(3).head())
//  println(list.isEmpty)
//  println(list.toString)

}

