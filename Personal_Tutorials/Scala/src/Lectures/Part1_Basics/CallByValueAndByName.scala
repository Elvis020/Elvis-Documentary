package Lectures.Part1_Basics

object CallByValueAndByName extends App{
//  Illustrating the concepts of Call By Value and Call By Name
  def callByValue(q:Long):Unit = {
    println("Call by Value: " + q)
    println("Call by Value: " + q)
  }

  def callByName(q: => Long):Unit = {
    println("Call by Name: " + q)
    println("Call by Name: " + q)
  }

  callByName(System.nanoTime())
  callByValue(System.nanoTime())

//  Note that, he by name evaluation delays the evaluation of the expression
  //  passed next until it is used
  def infiniteFunc():Int = 1 + infiniteFunc()
  def printFirst(x:Int,y: => Int):Unit = println(x)

//  println(printFirst(infiniteFunc(),32))
  printFirst(32,infiniteFunc())

}
