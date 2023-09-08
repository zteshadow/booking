
import HttpServer

object Main extends App {
  println("Hello, New Era!")
  
  val http = HttpServer(2, 3)
  println(http.x)
}