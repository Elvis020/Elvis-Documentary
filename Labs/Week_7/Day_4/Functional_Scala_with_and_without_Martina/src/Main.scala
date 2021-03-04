import scala.annotation.tailrec

object Main extends App{
//  Lambda function
  val doubleIt = (n:Int) => n * 2
  println(doubleIt(54))

//  HOF
  val doIt = (n:Int,f:(Int =>Int)) =>f(n)
  println(doIt(100, doubleIt))
//  Using anonymous functions
  println(doIt (100, (x => x+1)))
//  OR
  println(doIt (100, (_+1)))


//  Returning function
  val multBy = (n:Int) =>((x:Int) => x * n)
  val double = multBy(2)
  println(double(4))


//  Function Composition
  val f = (x:Int) => x + 2
  val g = (x:Int) => x * 3
  val h = f compose g //f(g(x))
  val k = f andThen g //g(f(x))
  println()
  println(f(2))
  println(g(2))
  println(h(2))
  println(k(2))

  println()
  println("Closures")
  var extVal = 100
  def foo(n:Int):Int = n * extVal
  println(foo(2))
  extVal = 200
  println(foo(2))


  println()
  println("Functions and Methods")
  class AClass(val data:String){
    def aMethod(i:Int):String = data +": "+i
  }

  val obj = new AClass("Foobar")
  val fp:Int => String = obj.aMethod
//  fp returns a String but takes in an Int
  println(fp(29))


println("Collections in Functional Scala")
  val range1 = 1 until 10
  range1 foreach(x => print(x + " "))
  println()
  println(range1.forall(x => x < 5))
  println(range1.exists(x => x == 20))

  val sList = List("one","two","three")
  val sListUpper = sList.map(_.toUpperCase)
  println(sListUpper)

  println()
  println("Folding")
  val totalL = range1.foldLeft(0)((tot,curr) => tot+ curr)
  val totalR = range1.foldRight(0)((tot,curr) => tot+ curr)
  println()
  println("Filtering")
  val odds = range1.filter(x => x %2!=0)
  val filterVowels = 'a' to 'z' filter ("aeiou" contains (_))
  println(filterVowels(3))
  odds.indices.filter(x => x%2 != 0).foreach(x => println(x))
  val word = "absolutely"
  val filteringVowelsIn = word.seq.filter("aieuo" contains (_))
  println(filteringVowelsIn)
  val evens = 10.to(20)by(2)
  evens foreach(x => println(x))
  println()
  println("Zipping")
  val scores = Seq(75,90,45,22)
  val students = List("John","Mary","George","Fred","Janet")
  val zipper = students.zip(scores)
  println(zipper)
  println()
  println("For comprehension")
  val squares = for(a <- 1 until 5) yield a*a
  println(squares)

  val oddSqu =for(a <- 1 until 10 if(a % 2 != 0)) yield a*a
  println(oddSqu)

  println()
  println("Skipped to Optionals")
  val noVal:Option[String] = None
  println(noVal)
  println(noVal.getOrElse("Nothing there"))
  val capitals = Map("UK" -> "London","USA" -> "Washington DC")
  println(capitals.get("UK"))


  println()
  println("Skipped to Recursion")
println("Example of Recursion")
  //Use this function has, it has better efficiency
  @tailrec
  def factorial(n:Int,acc:BigInt=1) :BigInt = {
    if(n==0) acc
    else factorial(n-1, n*acc)
  }

//This function has a limit
  def fact2(n:Int):BigInt = {
    if(n==0) 1
    else n * fact2(n-1)
  }


//  println(fact2(10000))
  println(factorial(10000))



}
