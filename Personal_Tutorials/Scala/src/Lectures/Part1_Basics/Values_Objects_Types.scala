package Lectures.Part1_Basics

object Values_Objects_Types extends App{
//  val x: Int = 43;
//  Or
  val x = 43;
//  Values are immutable
//  The compiler can aways infer
  val aBoolean: Boolean = false;
  val aChar: Char = 'd'
  val aShort: Short = 2132
  val aLong: Long = 123313213213L
  val aFloat: Float = 32.3443F
  val aDouble: Double = 23.12
  println("Types of variables in Scala")
  println(aDouble)
  println(aFloat)
  println(aLong)
  println(aShort)
  println(aChar)
  println(aBoolean)
  println(x)
}
