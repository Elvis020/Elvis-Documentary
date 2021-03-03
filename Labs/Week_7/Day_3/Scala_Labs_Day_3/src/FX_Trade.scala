import defaults.Trade

class FX_Trade(ID: String,price: Double) extends Trade(ID,price)  {
  def isExecutable: Boolean = false

  override def toString: String = s"FX Trade: $ID - $price"

  def value(): Double = ???
}
