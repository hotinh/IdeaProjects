package scalaForImpatient.chapter02

object Unit01 extends App {

  def product(s:String):Long= {
    var t:Long=1
    for(i <- s) {
      t *= i.toLong
    }
    t
  }
  println(product("Hello"))

  def product4recursive(s:String):Long={
    if(s.length==1) return s.charAt(0).toLong
    else s.take(1).charAt(0).toLong * product(s.drop(1))
  }
  println(product4recursive("Hello"))

  def mi(x: Double, n: Int):Double = {
    if(n==0) 1
    else if (n>0 && n%2==0) mi(x,n/2) * mi(x,n/2)
    else if (n>0 && n%2==1) x*mi(x,n-1)
    else 1/mi(x,-n)
  }
}
