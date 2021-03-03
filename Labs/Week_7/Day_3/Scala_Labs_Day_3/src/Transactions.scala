class Transactions(ID: String,Symbol: String,quantity: Int,price: Double) extends Equity_Trade(ID,Symbol,quantity,price)  with
  FeePayable with Taxable {
  def amount:Double= {
    val valueOfTrade = new Equity_Trade(ID,Symbol,quantity,price).value()
    val tax = (valueOfTrade + flatFee )* tax_rate
    valueOfTrade + flatFee + tax
  }

}
