package Exercises

import scala.annotation.tailrec

object FunctionsExercise extends App{
  def greeting(name:String, age:Int): String = "Hi, my name is: "+
    name+" and I am "+age+" years old!."

  println(greeting("Spacey",43))


  def aFactorialFunction(n:Int):Int = {
    if(n <= 0) 1
    else n * aFactorialFunction(n-1)

  }
  println(aFactorialFunction(4))



  def aFibonacci(n:Int):Int = {
    if(n <= 2) 1
    else aFibonacci(n-1) + aFibonacci(n-2)
  }
  println(aFibonacci(4))

  def aFunctionIsPrime(n:Int):Boolean = {
    def isPrimeUntil(t:Int): Boolean =
      if (t<=1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  println(aFunctionIsPrime(37))

//  println(aFunctionIsPrime(4))
}
