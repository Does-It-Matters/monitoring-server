package monitoring.server

/**
 * 모니터링하기 위한 리눅스 파일 경로들을 모아둔 추상 타입
 */
sealed trait FilePath {
  /**
   * 파일 경로 반환 메서드
   * 
   * @return 모니터링 대상인 파일의 경로
   */
  def path: String
}

/**
 * 실제 파일 경로들을 관리하는 객체
 */
object FilePath {
  /**
   * 테스트용 파일 경로
   */
  case object Test extends FilePath {
    val path: String = "./a.txt"
  }

  /**
   * 리눅스의 cpu 사용량 모니터링 파일 경로
   */
  case object ProcStat extends FilePath {
    val path: String = "/proc/stat"
  }
}