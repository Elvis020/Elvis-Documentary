package Exercises

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App{
//  Question 1 -  Concatenate a string n times using tail recursion
@tailrec
def sConcatenator(aString: String, n:Int, accumulator: String):String = {
    if(n<=0) accumulator
    else sConcatenator(aString, n-1, aString+accumulator)
  }
  val concatFunc = sConcatenator("Hello ",5,"")
  println(concatFunc)


//  Question 2 - IsPrime function that is tail recursive
  def isPrimeTailRec(v:Int):Boolean = {
    @tailrec
    def isPrimeHelper(m:Int, accumulator: Boolean):Boolean = {
      if (m<=1) true
      else if(!accumulator) false
      else isPrimeHelper(m-1, v%m != 0 && accumulator)
    }
    isPrimeHelper(v/2, true)
  }

  val truePrime = isPrimeTailRec(2003)
  val notTruePrime = isPrimeTailRec(695)
  println(truePrime)
  println(notTruePrime)



//  NB: Number of accumulators is proportional to number of recursive calls

//  Question 3 - Fibonnaci function that is tail recursive
  def fibFunction(n:Int):Int = {
    @tailrec
    def fibHelper(m:Int, lastNum:Int, beforeLastNum:Int):Int =
      if (m>n) lastNum
      else fibHelper(m+1, lastNum+beforeLastNum, lastNum)
    if(n<=2) 1
    else fibHelper(3,1,1)
  }
  println(fibFunction(8))
}
