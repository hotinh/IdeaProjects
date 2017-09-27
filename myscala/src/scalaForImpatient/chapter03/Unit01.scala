package scalaForImpatient.chapter03

import scala.collection.mutable.ArrayBuffer
import java.util.Collections

object Unit01 extends App {

  val nums = new Array[Int](10)
  val a = new Array[String](10)
  val s = Array("Hello","world")
  s(0) = "Goodbye"

  val b = ArrayBuffer[Int]()
  b += 1
  b += (1,2,3,4)
  b ++= Array(8,12,13)
//  b.trimEnd(5)
//  b.insert(2,6)
//  b.insert(2, 7,8,9)
//  b.remove(0)
//  b.remove(0,2)
  println(b)

  /*b.foreach(print)
  println()
  for (i <- 0 to 10)
    print(f"${i}%3d")
  println()
  for (i <- 0 until 10)
    print(f"${i}%3d")
  println()
  for (i <- 0 until 10 by 2)
    print(f"${i}%3d")
  println()
  for (i <- 0 until 10 by -1)
    print(f"${i}%3d")
  println()
  for(e <- b)
    print(f"${e}%3d")
  println()
  for (e <- b.reverse)
    print(f"${e}%3d")
  println()
  for (e <- b.indices)
    print(f"${e}%3d")
  println()*/

  /*val aa = Array(2,3,5,7,11)
  val result = for (e <- aa if e % 2 == 0) yield 2*e
  result.foreach(print)
  println()

  val result2 = aa.filter(_ %2 ==0).map(2*_)
  result2.foreach(print)
  println()

  val bb1 = ArrayBuffer(1,3,5,-1,-6,2)
  bb1.foreach(print)
  println()
  val result3 = for(e <- bb1 if e >0) yield e
  result3.foreach(print)
  println()

  val bb2 = ArrayBuffer(1,3,5,-1,-6,2)
  val positionsToRemove = for(i <-bb2.indices if bb2(i) <0) yield i
  for(i <- positionsToRemove.reverse) bb2.remove(i)
  bb2.foreach(print)
  println()

  val bb3 = ArrayBuffer(1,3,5,-1,-6,2)
  val positionsToKeep = for(i <- bb3.indices if bb3(i) >0) yield i
  for (j <- positionsToKeep.indices) bb3(j) = bb3(positionsToKeep(j))
  bb3.trimEnd(bb3.length - positionsToKeep.length)
  bb3.foreach(print)
  println()*/

  Array(1,1,2).toBuffer
  val ss = ArrayBuffer(1,-1,2,-2,3)
  val s1 = for (i <- ss.indices if ss(i)> 0 ) yield i
  val s2 = for (i <- ss.indices if ss(i)< 0 ) yield i
  ss.foreach(print)
  println()
  s1.foreach(print)
  println()
  s2.foreach(print)
  println()
  s2.tail.foreach(print)
  println()

  val s3 = for (i <- s1 if i > s2.head) yield i
  s3.foreach(print)
  println()

  ss.trimEnd(1)
  ss.foreach(print)
  println()


  println("dfdfd".drop(1))


  /*println(Array(1,3,7).toStream.sum)

  println(aa.toString())
  println(bb.toString())

  println(ArrayBuffer('a','b') ++: "cd")

  val xs = Array[Int](10)
  ArrayBuffer(1,3).copyToArray(xs)
  for(e <- xs)
    println(e)

  val matrix = Array.ofDim[Double](3,4)
  matrix(1)(1)=42

  val as = Array("Mary","a","had","lamb","little")
  import scala.collection.Searching._
  val result_as = as.search("beef")
  println(result_as)


  val ss = Array(1,1,2,3)
  val ss1 = ss.drop(1)
  val ss2 = ss.tail
  ss1.foreach(print)
  println()
  ss2.foreach(print)
  println()
  ss.foreach(print)
  println()*/

}
