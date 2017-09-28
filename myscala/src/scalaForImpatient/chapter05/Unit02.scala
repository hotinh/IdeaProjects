package scalaForImpatient.chapter05

object Unit02 extends App {

  class Person {
    var age = 0
  }
  val fred = new Person
  fred.age = 21

  class Person2 {
    private var privateAge = 0
    def age= privateAge
    def age_= (newValue: Int) {
      if(newValue > privateAge) privateAge = newValue
    }
  }
  val fred2 = new Person2
  fred2.age=20
  fred2.age=12
  println(fred2.age)

}
