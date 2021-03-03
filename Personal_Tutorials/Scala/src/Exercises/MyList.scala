package Exercises

abstract class MyList {
//  List[String] newList = new Array[String](32);
  def head():Int
  def tail():MyList
  def isEmpty():Boolean
  def add(element:Int):MyList
  def printElements: String

//  Adding the toString method
  override def toString:String = "[" + printElements + "]"
}

object EmptyList extends MyList{
  def head():Int = throw new NoSuchElementException
  def tail():MyList = throw new NoSuchElementException
  def isEmpty():Boolean = true
  def add(element:Int):MyList = new Cons(element, EmptyList)
  //    ??? means nothing will happen
  override def printElements: String = ""
}

//Linked List:Composed of an element and a list
class Cons(h:Int, t:MyList) extends MyList {
  def head():Int =h
  def tail():MyList =t
  def isEmpty():Boolean = false
  def add(element:Int):MyList =new Cons(element, this)
  def printElements: String = {
    if(t.isEmpty) "" + h
    else h +" " + t.printElements
  }
}


object ListTest extends App {
  val list = new Cons(1,new Cons(2,new Cons(3,EmptyList)))
  println(list.tail.head)
  println(list.add(3).head())
  println(list.isEmpty)
  println(list.toString)

}

