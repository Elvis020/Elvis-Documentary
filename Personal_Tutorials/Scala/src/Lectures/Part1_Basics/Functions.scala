package Lectures.Part1_Basics

object Functions extends App{
  def aFunction(a: String, b: Int): String = {
    "You entered " + a+ " and " + b +
      " into the function"
  }

  println(aFunction("hello",23))
//  Parameterless function
  def aParameterLessFunc(): Int = 4
  println(aParameterLessFunc)
  println(aParameterLessFunc())
//  Also note that the compiler infers types
//  Don't let the compiler infer from recursive functions


//  A recursive function, use recursive functions instead of while loops
  def aRepeatedFunction(aString: String, b: Int):String = {
    if(b == 1) aString
    else aString + aRepeatedFunction(aString,b-1)
  }

  println(aRepeatedFunction("Elvis ",4))



  def aFunctionWithSideEffects(aString: String): Unit = println(aString)
  aFunctionWithSideEffects("Elvis is learning Scala")


  def aBigFunction(a:Int):Int = {
    def aSmallerFunction(c:Int,d:Int):Int = c + d
    aSmallerFunction(a,a-1)
  }

  println(aBigFunction(4))
}
