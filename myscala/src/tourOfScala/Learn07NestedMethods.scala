package tourOfScala

object Learn07NestedMethods {
  
  def main(args: Array[String]): Unit = {
    
    println("Factorial of 2:" + factorial(0))
    println("Factorial of 3:" + factorial(3))
    
  }
  
  def factorial(x: Int): Int = {
    def fact(x: Int, accumulator: Int): Int = {
      if(x<=1) accumulator
      else fact(x-1, x*accumulator)
    }
    fact(x,1)
  }
  
}