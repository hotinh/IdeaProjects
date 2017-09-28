package scalaForImpatient.chapter05

object Unit01 extends App {
  class Counter {
    private var value = 0
    def increment() {value += 1}
    def current = value
  }
  val myConuter = new Counter
  myConuter.increment()
  println(myConuter.current)
}
