package Lectures.Part1_Basics

import scala.annotation.tailrec

object Recurison extends App{


//  Factorial Function - Limited Factorial Function
  def factorial(n:Int):BigInt =
    if (n<=1) 1
    else {
      n * factorial(n-1)
    }


//  Better way of writing a factorial function preserves memory,
//  but both factorial functions yield the same result
  def betterFactorialFunction(n:Int):BigInt = {
    @tailrec
    def factorialHelper(x:Int, accumulator:BigInt):BigInt=
      if (x <= 1) accumulator
      else factorialHelper(x-1, x * accumulator)

//  TAIL RECURSION: Make a recursive function the last expression in a method
    factorialHelper(n,1)
  }
  println(betterFactorialFunction(4))
  println(betterFactorialFunction(12))
  println(betterFactorialFunction(5000))
  println(factorial(5000))


//  When the recursive depth is too big, you get a StackOverflowError
}
