package Exercises

abstract class MyList {
  List[String] newList = new Array[String](32);
  def head():Int
  def tail():MyList
  def isEmpty():Boolean
  def add(element:Int):MyList

  object Emptyist extends MyList{
    def head():Int = ???
    def tail():MyList = ???
    def isEmpty():Boolean = ???
    def add(element:Int):MyList = ???
//    ??? means nothing will happen
  }
  class
}
