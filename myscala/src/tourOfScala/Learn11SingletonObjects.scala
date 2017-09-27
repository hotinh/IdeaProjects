package tourOfScala

object Learn11SingletonObjects extends App {
  
  def sum(l: List[Int]): Int = l.sum
  
  val l = List(1,2,3)
  println(sum(l))
  
  
  class IntPair(val x: Int, val y: Int)
  object IntPair {
    import math.Ordered
    implicit def ipord: Ordering[IntPair] = 
      Ordering.by(ip => (ip.x, ip.y))
  }
  
  
  class X {
    import X._
    def blah = foo
    
  }
  
  object X {
    private def foo=42
  }
  
}