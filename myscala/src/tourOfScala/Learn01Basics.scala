package tourOfScala

object Learn01Basics {
  
  def main(args : Array[String]) : Unit = {
    
    //---expressions---
    println("---expressions---")
    println(1+1)
    
    val x =1
    var y =1
    
    
    //---Blocks---
    println ("---Blocks---")
    println({
      val x = 1+1
      x+1
    })
    
    
    //---Function---
    println ("---Function---")
//    (x:Int) => x+1
    val addOne = (x:Int) => x+1
    println (addOne(1))
    
    val addTwo = (x:Int, y:Int) => x+y
    println (addTwo(1,2))
    
    val getTheAnser = () => 42
    println (getTheAnser())
    
    
    //---Methods---
    println ("---Methods---")
    def add(x:Int, y:Int): Int = x+y
    println(add(1,2))
    
    def addThenMultiply(x:Int, y:Int)(multiplier:Int):Int = (x+y)*multiplier
    println(addThenMultiply(1, 2)(3))
    
    def name : String = System.getProperty("ss")
    println("Hello," + name + "!")
    
    def getSquareString(input:Double): String = {
      val square = input*input
      square.toString
    }
//    println (getSquareString())
    
    
    
    //---Classes---
    println ("---Classes---")
    class Greeter(prefix:String, suffix:String){
      def greeter(name:String):Unit=
        println(prefix+name+suffix)
    }
    val greeter = new Greeter("Hello "," !")
    greeter.greeter("Scala developer")
    
    val greeter2 = new Greeter("dfdfd "," !")
    greeter2.greeter("Scala developer")
    
    
    
    //---Case Classes---
    println ("---Case Classes---")
    case class Point(x: Int, y:Int)
    
    val point = Point(1,2)
    val anotherPoint = Point(1,2)
    val yetAnotherPoint = Point(2,2)
    println (point)
    
    if(point == anotherPoint){
      println(point + " and " + anotherPoint + " are the same.")
    }else{
      println(point + " and " + anotherPoint + " are different.")
    }
    
    if(point == yetAnotherPoint){
      println(point + " and " + yetAnotherPoint + " are the same.")
    }else{
      println(point + " and " + yetAnotherPoint + " are different.")
    }
    
    
    //---Object---
    println("---Object---")
    object IdFactory {
      private var counter=0
      def create() : Int = {
        counter +=1
        counter
      }
    }
    
    val newId:Int = IdFactory.create()
    println(newId)
    val newerId:Int = IdFactory.create()
    println(newerId)
    
    
    
    //---Traits---
    println("---Traits---")
//    trait GreeterT{
//      def greet(name:String):Unit
//    }
    
    trait GreeterT {
      def greete(name:String):Unit = {
        println("Hello, " + name + " !")
      }
    }
    
    class DefaultGreeterT extends GreeterT
    
    class CustomizableGreeterT(prefix:String, postfix:String) extends GreeterT {
      override def greete(name:String):Unit = {
        println(prefix + name + postfix)
      }
    }
    
    val greeterT = new DefaultGreeterT()
    greeterT.greete("Scala developer")
    
    val customGreeterT = new CustomizableGreeterT("How are you, ", "?")
    customGreeterT.greete("Scala developer")
    
  }
  
}