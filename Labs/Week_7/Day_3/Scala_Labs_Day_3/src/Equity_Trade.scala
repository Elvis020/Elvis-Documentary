import defaults.Trade

class Equity_Trade(ID:String,Symbol:String,quantity:Int,price:Double) extends Trade(Symbol,
  quantity)  {
  def value(): Double = {
    println(f"Value of the trade is: ${quantity * price}%4.2f")
    quantity * price
  }

  def isExecutable: Boolean = true
  override def toString: String = s"Equity Trade: $Symbol - $quantity"
}
