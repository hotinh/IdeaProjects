package test


object MyTest1 extends App {

  val s:List[Int] = List(1,2,3,4,5)
//  println(s.length)
//  println(s.apply(0))
//  val s2 = s.+:(6)
//  println(s2.length)
//  println(s2.apply(0))
//  println(s2.apply(5))

//  s.::(9)
//  println(s.length)

//  val n:List[Int] = Nil
//  println(n.isEmpty)

  val data: TreeNode[String] =
    TreeNode("Root",
      children = List(TreeNode("level1-1"),
        TreeNode("level1-2"),
        TreeNode("level1-3")))


  val data2: TreeNode[String] =
    TreeNode("Root",
      children = List(
        TreeNode("level1-1", children = TreeNode("level2-1", children = TreeNode("level3-1") :: Nil) :: Nil),
        TreeNode("level1-2"),
        TreeNode("level1-3")))

  case class TreeNode[T](data: T, children: Seq[TreeNode[T]] = Nil)

  var result:Seq[String] = Nil
  var count = 0

  def asciiDisplay(root: TreeNode[String]): Seq[String] = {
    val prefix = "+-"

    if (count > 1 )
      result = result.:+( " "*2 + "|" +  " "*(count-1)*2 + f"${prefix + root.data}")
    else
      result = result.:+(" "*(count)*2 + f"${prefix + root.data}")


    if (!root.children.isEmpty) {
      count += 1

      root.children.foreach(e => {
        asciiDisplay(e)
      })

      count = 1
    }

    result
  }


  asciiDisplay(data2).foreach(println)
//  println(count)

//  println(asciiDisplay(data).length)


//  println(data.children.length)
//  println(data.children.foreach(e => println(e.data)))

}
