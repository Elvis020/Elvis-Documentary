object Main extends App {
//  val trade1 = new Trade("T1", "APPL", 100, 15.25)
//  val trade2 = new Trade("T1", "APPL", 100,21.1)
  //Creating the Case Class
//  case class Trade (ID: String,Symbol: String,quantity: Int,price: Double)
//  val t3 = Trade("T3", "AYT", 160, 189.25)
//  println(t3)
//  println(t3.hashCode)
//  println(t3.toString)
//  println(t3.equals(trade1))
//  trade1.setPrice(23.43)
//  trade1.value()

//  For companion object
  val trade3 = Trade("T3", "GOOGL", -190, 11.99)
  println(trade3)

//  Comments on Question 1 - Additional Exercises (if you have time)
//  You can use the companion object as a factory method to ensure that some parameters are valid
//  Also you can also make the constructor private
//  Require is used to enforce a precondition on the caller of a function or the creator of an object of some class.
//  Whereas, assert is used to check the code of the function itself. So, if a precondition fails, then you get an illegal argument exception.
//    Whereas, if an assertion fails and it's not the caller's fault and consequently you get an assertion error.
}


