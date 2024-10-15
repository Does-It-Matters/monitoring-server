package monitoring.server
package file

import scala.io.Source
import scala.util.{Failure, Success, Using}

/**
 * 직접 파일에 접근해서 내용을 읽는 객체
 */
object FileReader {

  /**
   * 특정 파일을 읽고 내용을 반환하는 메서드
   *
   * @param path 읽기 대상 파일의 경로
   * @return 파일을 정상적으로 읽었다면 파일 내용을 반환, 예외가 발생했다면 빈 내용을 반환
   */
  def read(path: String): List[String] = Using(Source.fromFile(path)) {
    _.getLines().toList
  } match {
    case Success(lines) => lines
    case Failure(exception) =>
      println(s"Error message: ${exception.getMessage}")
      List()
  }
}
