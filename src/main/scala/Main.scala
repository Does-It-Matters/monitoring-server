package monitoring.server

import scala.io.Source
import scala.util.{Success, Failure, Using}

import FilePath._

object Main {
  def main(args: Array[String]): Unit = {
    val filePath = ProcStat.toString
    val result = Using(Source.fromFile(filePath)) {
      source => source.getLines().toList
    }

    result match {
      case Success(lines) => lines.foreach(println)
      case Failure(exception) => println(s"Error message: ${exception.getMessage}")
    }
  }
}