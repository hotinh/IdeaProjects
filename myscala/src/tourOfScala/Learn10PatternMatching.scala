package tourOfScala

import scala.util.Random

object Learn10PatternMatching extends App {
  
  val x: Int = Random.nextInt(10)
  println(x)
  
  x match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
  
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
  
  println(matchTest(3))
  println(matchTest(5))
  
  
  abstract class Notification
  case class Email(sender: String, title: String, body: String) extends Notification
  case class SMS(caller: String, message: String) extends Notification
  case class VoiceRecording(contactName: String, link: String) extends Notification
  
  def showNotification(notification: Notification): String = {
    notification match {
      case Email(email, title, _) => s"You got an email from $email with titile: $title"
      case SMS(number, message) => s"You got an SMS from $number! Messsage:$message"
      case VoiceRecording(name, link) => s"you received a Voice Recording from $name! Click the linke to hear it: $link"
    }
  }
  
  val someSms = SMS("12345", "Are you there?")
  val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
  
  println(showNotification(someSms))
  println(showNotification(someVoiceRecording))
  
  
  def showImportantNotificatio(notification: Notification, importantPeopleInfo: Seq[String]): String = {
    notification match {
      case Email(email,_,_) if importantPeopleInfo.contains(email) =>
        "You got an email from special someone!"
      case SMS(number, _) if importantPeopleInfo.contains(number) =>
        "You got an SMS from special someone!"
      case other =>
        showNotification(other)
    }
  }
    
  val importantPeopleInfo = Seq("87-3232", "jenny@gmai.com")
  val someSms2 = SMS("87-3232", "Are you there")
  val someVoiceRecording2 = VoiceRecording("Tom", "voicerecording.org/id/123")
  val importantEmail = Email("jeny@gmail.com", "Drinks tonight?", "I'm free after 5!")
  val importantSms = SMS("87-3232", "I'm here! where are you?")
  
  println(showImportantNotificatio(someSms2, importantPeopleInfo))
  println(showImportantNotificatio(someVoiceRecording2, importantPeopleInfo))
  println(showImportantNotificatio(importantEmail, importantPeopleInfo))
  println(showImportantNotificatio(importantSms, importantPeopleInfo))
  
  
  abstract class Device
  case class Phone(model: String) extends Device {
    def screenOff = "Turning screen off"
  }
  case class Computer(model: String) extends Device {
    def screenSaverOn = "Turning screen saver on.."
  }
  def goidIe(device: Device) = device match {
    case p: Phone => p.screenOff
    case c: Computer => c.screenSaverOn
  }
  println(goidIe(Phone("")))
  println(goidIe(Computer("")))
  
  
  sealed abstract class Furniture
  case class Couch() extends Furniture
  case class Chair() extends Furniture
  
  def findPlaceToSit(piece: Furniture): String  = piece match {
    case a: Couch => "Lie on the couch"
    case b: Chair => "Sit on the chair"
  }
  println(findPlaceToSit(Couch()))
  println(findPlaceToSit(Chair()))
  
}