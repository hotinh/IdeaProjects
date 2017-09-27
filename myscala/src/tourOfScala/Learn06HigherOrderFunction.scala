package tourOfScala

object Learn06HigherOrderFunction {
  
  def main(args: Array[String]): Unit = {
    
    FunTest.main(args)
  }
  
  def apply(f: Int => String, v: Int) = f(v)
    
    class Decorator(left: String, right: String) {
      def layou[A](x: A) = left + x.toString() + right
    }
    
    object FunTest extends App {
      def apply(f :Int => String, v:Int) = f(v)
      val decorator = new Decorator("[","]")
      println(apply(decorator.layou, 7))
    }
}