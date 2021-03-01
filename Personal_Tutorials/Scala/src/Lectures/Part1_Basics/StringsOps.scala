package Lectures.Part1_Basics

object StringsOps extends App {
  val newStr = "Hello , I am learning Scala"
  println(newStr.charAt(2))
  println(newStr.substring(1,11))
  println(newStr.split(" ").toList)
  println(newStr.startsWith("Hello"))
  println(newStr.replace("Hello","Hyy \uD83D\uDE3B"))
  println(newStr.toLowerCase())
  println(newStr.length)
  println()
println("*** Special Scala Operations ***")
  val aNumberString = "34"
//  Converting to an Int
  val aNumber = aNumberString.toInt
  println("Prepending using +:")
  println('a'+: aNumberString)
  println("Appending using :+")
  println(aNumberString :+ 'z')
  println(newStr.reverse)
  println(newStr.take(3))
  println()

  println("**** Scala Specific Interpolators ****")
  val name = "Elvis"; val age=32

//  Using the S-interpolators
  println("-- S-Interpolator --")
  val greetings = s"💻 Hello, my name is $name, and I am $age years old! 💻" //
  val anotherGreetings = s"💻 Hello, my name is $name, and I will become ${age+2} in 2 years time! 💻" //
  println(greetings)
  println(anotherGreetings)
  println()



//  Using F-Interpolators
  println("-- F-Interpolator --")
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute."
  println(myth)
  println()

  println("-- Raw Interpolator --")
  println(raw"This is a \n newline.")
  val escapedLine = "This is a \n newline"
  println(raw"$escapedLine")
}

