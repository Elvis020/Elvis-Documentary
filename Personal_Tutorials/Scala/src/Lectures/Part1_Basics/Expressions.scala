package Lectures.Part1_Basics

object Expressions extends App{
  val x = 1 + 2
  /*
  Here 1+2 is the expression
  NB: Changing a variable is known as a side-effect
   */
  println(x)
  println(1 == x)
  println(!(1 == x))
  var aVar = 2
  aVar += 3
//  println(aVar)


//  Instructions(DO) are different from expressions
//  Instructions: Things you tell the computer to do.
//  Expressions: Things that result in a value/ Things that have a value.
//  Instructions are executed, while expressions are evaluated
//  Note that, the types of expressions are unit
//  IF - Control Flow is an expression
//  NB: There are loops in Scala, but be warned of using them
//  Everything in Scala is an expression
//  Never write while loops in Scala

  val aCond = true
  val aCondValue = if(aCond) 5 else 3
  println("Condition value: "+ aCondValue)

  val wierdValue = (aVar = 43)   // Unit == void
  println("Wierd value: " + wierdValue)
//  Examples of Side Effects: println(),while,reassigning


//  CodeBlocks
  val codeBlock = {
    val y = 2
    val z = y + 1
    if (z> 2) "hello" else "goodbye"
  }
  println(codeBlock)
//  Note: CodeBlock is an expression. The value of rhe code block is the last
  //  evaluation
  "hello world"

}
