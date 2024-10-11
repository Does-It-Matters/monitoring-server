package monitoring.server

import scala.io.Source
import scala.util.{Success, Failure, Using}

object Main {
  def main(args: Array[String]): Unit = {
    val filePath = "/proc/stat"
    val result = Using(Source.fromFile(filePath)) {
      source => source.getLines().toList
    }

    result match {
      case Success(lines) => lines.foreach(println)
      case Failure(exception) => println(s"Error message: ${exception.getMessage}")
    }
  }
}