package Exercises

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year

object OOP_1 extends App{
  println("Printing out the Author and writer Classes")
  val author = new Writer("Charles","Dickens",1812)
  val novel = new Novel("Great Expectations",1861,author);
  println(novel.ageOfAuthor)
//  println(novel.isWrittenBy(author))
}

class Writer(first_name:String, surname:String, val year:Int){
  def fullName(): Unit ={
    s"$first_name $surname"
  }
}
class Novel(novel_name:String, year_of_release:Int, author: Writer) {
  def ageOfAuthor  = s"The author is ${year - author.year} years old."
//  def isWrittenBy(author:Writer)  = s"The book was written by ${author == }"
  def copy(newYear:Int):Novel = new Novel(novel_name,newYear,author)
}

//class Counter(val n:Int){
//  def currentCount() ={
//    s"$n%d"
//  }
//  def incrementAndDecrement(): Unit ={
//    val n++
//  }
