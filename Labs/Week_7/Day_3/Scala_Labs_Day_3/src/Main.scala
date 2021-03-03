object Main extends App {
  val trade1 = new Trade("T1", "APPL", 100, 15.25)
//  val trade2 = new Trade("T1", "APPL", 100)
  //Creating the Case Class
  case class Trade (ID: String,Symbol: String,quantity: Int,price: Double)
  val t3 = Trade("T3", "AYT", 160, 189.25)
  println(t3)
  println(t3.hashCode)
  println(t3.toString)
  println(t3.equals(trade1))
//  trade1.setPrice(23.43)
//  trade1.value()

//  For companion object
//  val trade3 = Trade("T3", "GOOGL", 190, 11.99)
//  println(trade3.Symbol)
}


