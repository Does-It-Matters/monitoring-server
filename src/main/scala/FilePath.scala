package monitoring.server

sealed trait FilePath {
  def path: String
}

object FilePath {
  case object Test extends FilePath {
    val path: String = "./a.txt"
  }

  case object ProcStat extends FilePath {
    val path: String = "/proc/stat"
  }
}