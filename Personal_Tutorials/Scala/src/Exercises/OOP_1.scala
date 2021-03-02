package Exercises

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year

object OOP_1 extends App{
  println("Printing out the Author and writer Classes")
  val author = new Writer("Charles","Dickens",1812)
  val imposter = new Writer("Charles","Dickens",1812)
  val novel = new Novel("Great Expectations",1861,author);
  val countty = new Counter(21)
  println(novel.ageOfAuthor)
  println(novel.isWrittenBy(imposter))
  println()

  println("***** Using Immutability to increase and decrease count *****")
  val count = new Counter
  count.increaseCount().increaseCount().increaseCount().print()
  count.inc(10).print()

}

class Writer(first_name:String, surname:String, val year:Int){
  def fullName(): Unit ={
    s"$first_name $surname"
  }
}
class Novel(novel_name:String, year_of_release:Int, author: Writer) {
  def ageOfAuthor  = s"The author is ${year - author.year} years old."
  def isWrittenBy(authorName:Writer)  = s"The book was written by ${authorName == this.author }"
  def copy(newYear:Int):Novel = new Novel(novel_name,newYear,author)
}

class Counter(val n:Int = 0){
//  Using Immutability to increase and decrease count
  def increaseCount(): Counter = {
    println("Incrementing")
    new Counter(n+1);
  }
  def decreaseCount(): Counter = {
    println("Incrementing")
    new Counter(n-1);
  }
  /*
  To modify the contents of an instance,you will have to return a new instance
   */

//  Overloaded functions
  def inc(d:Int): Counter= {
    if(d <= 0) this
    else increaseCount().inc(d-1)
  }
  def dec(d:Int):Counter = {
    if(d <= 0 ) this
    else decreaseCount().dec(d - 1)
  }

  def print(): Unit = println(n)
}
