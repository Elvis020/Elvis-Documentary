//import java.sql.Date
//import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
//import java.util.Date

object CelsiusToFahrenheit extends App {


//  def CelciusConverter(temp:Float):Unit = {
//    val newTemp = ((temp * 9) / 5) + 32;
//    println(s"$temp in Fahrenheit is: $newTemp F")
//  }
  def convertDate2(dateString: String): Unit = {
    var pattern = "/".r
    var newDateString = pattern.replaceAllIn(dateString, "-")

//
    var formatter = DateTimeFormatter.ofPattern("dd-MM-yy")
    var formatter2 = DateTimeFormatter.ofPattern("d MMMM yyyy")
//
    var newDate = LocalDate.parse(newDateString, formatter).format(formatter2)
  println(newDateString)

    var dateArr = newDate.split(" ")
    var day = dateArr(0)

    var dayFormat = day.toInt match {
      case 1 | 21 | 31 => day + "st"
      case 2 | 22 => day + "nd"
      case 3 | 23 => day + "rd"
      case _ => day + "th"
    }

    print(dayFormat +" "+ dateArr(1) + " " +dateArr(2))
  }


  def converter2(dateStr:String) :Unit = {
    var separate_date_string = dateStr.split("/")
    var pattern = "/".r
    var replace_pattern = pattern.replaceAllIn(dateStr,"-")
    println(replace_pattern)
  }



//  CelciusConverter(21)
//  convertDate2("01/02/15")
  converter2("01/02/15")
}
