package scalaForImpatient.chapter04

import java.io.File
import java.util.Scanner

object Unit00 {

  //1.设置一个映射，其中包含你想要的一些装备及其价格。然后构建另一个映射采用同一个组键，但在价格上打9折
  val m1 = scala.collection.mutable.Map();

  //2.编写一段程序，从文件中读取单词。用一个可变映射来清点每一个单词出现的频率。读取这些单词的操作可以使用 java.util.Scanner:
  val in = new Scanner(new File("myfile.txt"))
  while(in.hasNext) {

  }

  //3.重复前一个练习，这次用不可变的映射

  //4.重复前一个练习，这次用已排序的映射，以便单词可以按顺序打印出来。

  //5.重复前一个练习，这次用java.util.TreeMap并使之适用于Scala API

  //6.定义一个链式哈希映射，将“Monday”映射到java.util.Calendar.MONDAY，依次类推加入其他日期。展示元素是以插入的顺序被访问的。

  //7.打印除所有Java系统属性的表格，类似下面这样：

  //8.编写一个函数 minmax(values: Array[Int})，返回数组中最小值和最大值对偶

  //9.编写一个函数 lteqgt(values: Array[Int], v: Int)，返回数组中小于 v，等于 v 和 大于 v 的数量，要求三个值一起返回

  //10.当你将两个字符串拉链在一起时，比如"Hello".zip("world")，会是什么结果？想出一个讲得通的用例。


}
