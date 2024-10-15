package monitoring.server

import file.FilePath._
import file.FileReader

object Main {
  def main(args: Array[String]): Unit = {
    FileReader.read(ProcStat.toString)
              .foreach(println)
  }
}