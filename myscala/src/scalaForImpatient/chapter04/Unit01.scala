package scalaForImpatient.chapter04

import java.util

object Unit01 extends App {

  val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

//  val bobsScore = scores.get("Bob1")
  val bobsScore = scores.getOrElse("Bob", 0)
  println(bobsScore)

  val scores3 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
  println(scores3.get("Bob"))
  scores3("Bob") = 11
  println(scores3.get("Bob"))

  scores3 -="Alice"
  println(scores3.getOrElse("Alice",-1))

  for((k,v) <- scores) println(k+" " + v)

  for((k,v) <- scores3) yield (v,k)
  for((k,v) <- scores3) println(k +" " + v)


  val dfdfd = new java.util.HashMap()
  import scala.collection.JavaConverters.mapAsScalaMap
//  val scores6:scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]()

  val attrs = Map("FAMILY" -> "Serif", "SIZE" -> 12)
//  val font = new java.awt.Font(attrs)

  val t = (1, 3.14, "Fred")
  val second = t._2
  println(second)

  val t2 = "New York".partition(_.isUpper)
  println(t2._1)
  println(t2._2)

  val symbols = Array("<","-",">")
  val counts = Array(2,10,2)
  val pairs = symbols.zip(counts)
  for((s,n) <- pairs) print(s*n)
  println()

  val m = pairs.toMap
  for ((k,v) <- m) yield println(k + " " +v)

}
