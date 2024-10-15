package monitoring.server

import FilePath._

object Main {
  def main(args: Array[String]): Unit = {
    FileReader.read(ProcStat.toString)
              .foreach(println)
  }
}