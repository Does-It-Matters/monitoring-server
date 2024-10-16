package monitoring.server
package file

/**
 * 모니터링하기 위한 리눅스 파일 경로들
 */
object FilePath extends Enumeration {
  /**
   * 테스트용 파일 경로
   */
  val Test = Value("./a.txt")

  /**
   * cpu 데이터 파일 경로
   */
  val ProcStat = Value("/proc/stat")

  /**
   * memory 사용량 파일 경로
   */
  val ProcMeminfo = Value("/proc/meminfo")
}