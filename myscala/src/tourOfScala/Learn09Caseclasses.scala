package tourOfScala

object Learn09Caseclasses extends App {
  
  case class Book(isbn: String)
  val frankenstein = Book("978-12132312")
  
  case class Message(sender: String, recipient: String, body: String)
  val message = Message("guiliang@qq.com", "fdfd@qq.com", "haha")
  
  println(message.sender)
  
//  message.sender = "fdfdfd" // this line does not compile
  
  
  val message2 = Message("guiliang@qq.com", "fdfd@qq.com", "haha")
  val message3 = Message("guiliang@qq.com", "fdfd@qq.com", "haha")
  println(message2 == message3)
  
  
  val message4 = Message("guiliang@qq.com", "fdfd@qq.com", "haha")
  val message5 = message4.copy(sender = message4.recipient, recipient= "123@qq.com")
  println(message5.sender)
  println(message5.recipient)
  println(message5.body)
  
}