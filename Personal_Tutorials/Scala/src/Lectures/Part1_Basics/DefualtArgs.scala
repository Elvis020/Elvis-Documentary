package Lectures.Part1_Basics

import scala.annotation.tailrec

object DefualtArgs extends App{

  @tailrec
  def tailRecurFactorial(n:Int, acc:Int = 1):Int = {
    if (n <= 1) acc
    else tailRecurFactorial(n-1, n * acc)
  }



  def savePicture(format:String = "jpg", width:Int,height:Int):Unit = println("Hey, you are " +
    "saving a picture")

  /*
  Note that when you have named parameters, the leading parameter, even if given a default value
  will cause type inference error
  Eg. savePicture(800,600) This will generate an error cuz it thinks 800 is the first argument
  In summary, we can't omit leading default arguments
   */

  println(tailRecurFactorial(10))
  savePicture(width=300,height=321)
}
