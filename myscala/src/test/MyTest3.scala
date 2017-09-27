package test

object MyTest3 extends App {

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
    val prefix = "+-"

    def takeString(r: TreeNode[String], level:Int):String = {
      " "*(level)*2 + prefix + r.data
    }

    def mix(c: Seq[TreeNode[String]], level: Int):Unit = {
      c.foreach(e =>  {
        result = result.:+( " "*level*2 + prefix + e.data)
        if(c.length > 1) {
          e.children.foreach(e => {
            result = result.:+( " "*(level*2) + "|" + " "*(level*2-1) + prefix + e.data)
            mix(e.children, level+1)
          })
        }
      })
    }
    result = result.:+(prefix + root.data)
    mix(root.children, 1)

    result
  }


  asciiDisplay(data1).foreach(println)
  println("------------------")
  asciiDisplay(data2).foreach(println)

}
