package test

object MyTest2 extends App {

  val data1: TreeNode[String] =
    TreeNode("Root",
      children = List(
        TreeNode("level1-1", children = TreeNode("level2-1")::Nil),
        TreeNode("level1-2"),
        TreeNode("level1-3"))
    )

  val data2: TreeNode[String] =
    TreeNode("Root",
      children = List(
        TreeNode("level1-1", children = TreeNode("level2-1", children = TreeNode("level3-1") :: Nil) :: Nil),
        TreeNode("level1-2"),
        TreeNode("level1-3"))
    )


  case class TreeNode[T](data: T, children: Seq[TreeNode[T]] = Nil)

  def asciiDisplay(root: TreeNode[String]): Seq[String] = {

    var result:Seq[String] = Nil
    var count = 0
    val prefix = "+-"

    def takeString(n:Int, r: TreeNode[String]):String = {
      if (r.children.isEmpty)
        " "*(count)*2 + prefix + r.data
      else
        " "*(count)*2 + prefix + r.data
    }

    def mix(c: Seq[TreeNode[String]]):Unit = {
      c.foreach(e => {
        count += 1
        result = result.:+(takeString(c.length, e))
        mix(e.children)
      })
      count = 0
    }

    result = result.:+(prefix + root.data)
    mix(root.children)

    result
  }


  asciiDisplay(data1).foreach(println)
  println("------------------")
//  asciiDisplay(data2).foreach(println)

}
