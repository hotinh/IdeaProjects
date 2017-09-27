package scalaForImpatient.chapter03

import scala.collection.mutable.ArrayBuffer
import scala.util.Random
import java.util.TimeZone
import java.awt.datatransfer._
import scala.collection.mutable.Buffer

object Unit00 extends App {

  // 1.编写一段代码，将a 设置为一个n个随机整数的数组，要求随机数介于0（包含）和n（不包含）之间
  def makeArr(n: Int):Array[Int] = {
    val a = Array[Int](n)
    val rand = new Random()
    for (i <- a) yield rand.nextInt(n)
  }
  makeArr(10).foreach(println)


  // 2.编写一个循环，将整数数组中相邻的元素置换。例如，Array(1,2,3,4,5) 经过置换后变为 Array(2,1,4,3,5)
  def revert(arr: Array[Int]): Unit = {
    for (i <- 0 until arr.length -1 by 2) {
      val t = arr(i)
      arr(i) = arr(i+1)
      arr(i+1) =t
    }
  }
  val a = Array(1,2,3,4,5)
  revert(a)
  a.foreach(print)
  println()


  // 3.重复
  def revertyield(arr: Array[Int]) {
    for (i <- 0 until arr.length) yield {
      if (i < (arr.length-1) && i %2==0) {
        val t = arr(i)
        arr(i) = arr(i+1)
        arr(i+1) = t
      }
      arr(i)
    }
  }
  val a3 = Array(1,2,3,4,5)
  revertyield(a3)
  a3.foreach(print)
  println()


  // 4.给定一个整数数组，产出一个新的数组，包含元数组中的所有正值，以原有顺序排序，之后的元素是所有零活负值，以原有顺序排序
  def convert(arr: Array[Int]):Array[Int] = {
    val buf = ArrayBuffer[Int]()
    buf ++= (for (i <- arr if i > 0) yield i)
    buf ++= (for (i <- arr if i == 0) yield i)
    buf ++= (for (i <- arr if i < 0) yield i)
    buf.toArray
  }
  val a4 = Array(1,-1,2,-2,3,-3,5,-1,0)
  val t4 = convert(a4)
  t4.foreach(print)
  println()


  // 5.如何计算Array[Double]的平均值
  def avg(arr: Array[Double]) = {
    arr.sum / arr.length
  }
  val a5 = Array[Double](1.2, 2.1)
  println(avg(a5))

  // 6.如何重新组织Array[Int]的元素将它们以反序排列？对于ArrayBuffer[Int]
  def reverse(arr: Array[Int]): Unit ={
    for (i <- 0 until arr.length) {
      val t = arr(i)

    }
  }
  val a6 = Array(1,2,3,4,5)
  val t6 = a6.reverse
  t6.foreach(print)
  println()
  val ab6 = ArrayBuffer(1,2,3,4,5,6)
  val tb6 = ab6.reverse
  tb6.foreach(print)
  println()

  // 7.
  val a7 = Array(1,2,3,1,4,3).distinct
  val ab7= ArrayBuffer(1,2,3,1,2,3).distinct
  a7.foreach(print)
  println()

  // 8.一个整数缓冲，移除除第一个负数外的所有负数。
  // 采集负数元素的位置，丢弃第一个（位置）元素，反转该序列，然后对每个位置下标调用 a.remove(i)
  val a8 = ArrayBuffer(1,-1,2,3,-2,-3)
  def remove(arr: ArrayBuffer[Int]): Unit ={
    val positionsToRemove = for(i <- arr.indices if arr(i) < 0) yield i
    for (j <- positionsToRemove.tail.reverse) yield arr.remove(j)
  }
  remove(a8)
  a8.foreach(print)
  println()

  // 9.一个整数缓冲，移除除第一个负数外的所有负数。
  // 采集应被移动的位置和目标位置。执行这些移动并截断缓冲。不要复制第一个不需要的元素之前的任何元素
  val a9 = ArrayBuffer(1,-1,2,-2,3)
  def keep(arr: ArrayBuffer[Int]): Unit ={
    val positionsToKeep = for (i <- arr.indices if arr(i) > 0 ) yield i
    val positionsToRemove = for(i <- arr.indices if arr(i) < 0) yield i
    val keepNoFirst = for (i <- positionsToKeep if i > positionsToRemove.head) yield i
    for (i <- positionsToRemove.tail; j <- keepNoFirst) yield {
      arr(i) = arr(j)
    }
    arr.trimEnd(positionsToRemove.length -1)
  }
  keep(a9)
  a9.foreach(print)
  println()


  // 10.创建一个由 java.util.TimeZone.getAvailableIDs 返回的时序集合，判断条件是它们在美洲。去掉“America/“前缀并排序。
  def timeZoneName(): Unit = {
    val a10 = TimeZone.getAvailableIDs()
    val t = for (i <- a10 if i.startsWith("America/")) yield i.drop("America".length)
    scala.util.Sorting.quickSort(t)
    t.foreach(println)
  }
  timeZoneName()

  // 11.
//  val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
//  val buf: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)

}
