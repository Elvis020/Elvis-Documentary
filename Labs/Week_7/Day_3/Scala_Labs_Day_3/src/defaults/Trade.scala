
package defaults
abstract class Trade  (val ID: String,var price: Double) {

//  def this(ID: String, Symbol: String, quantity: Int,price:Double) =this(ID, Symbol, quantity,price)
//  override def toString: String = s"$ID,$Symbol,$quantity,$price"
  def setPrice(newPrice: Double): Unit = if (newPrice >= 0) this.price = newPrice else this.price = 0.0F

    def value():Double


  def isExecutable:Boolean;


  //  Trying other means

  //  private var _price = {
  //    if (priceF >= 0) priceF
  //  }  //initialPrice is constructor parameter
  //  def newP: Double = _price //getter method
  //  def newPP (fl: Double):Unit = if (fl >= 0) _price = fl else _price=0.0F
  //  def price = _price //getter method
  //  def price_ (fl: Double):Unit = if (fl >= 0) _price = fl else _price=0.0F  //setter method
}


//  Creating the Object
//object Trade{
//  def apply(ID: String,Symbol: String,quantity: Int,  price: Double):Trade = {
//    if(quantity < 0)
//      new Trade(ID,Symbol,quantity=0,price)
//    else
//      new Trade(ID,Symbol,quantity,price)
//  }
//}


//Creating the Case Class
//case class Trade(ID: String,Symbol: String,quantity: Int,price: Double)

