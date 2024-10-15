package monitoring.server
package file

import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec

class FileReaderSpec extends AnyFeatureSpec with GivenWhenThen {
  Feature("File read") {
    Scenario("Read a test file") {
      Given("test file path")
      val path = FilePath.Test

      When("the file is read")
      val lines = FileReader.read(path.toString)

      Then("the content should match")
      assert(lines == List("test"))
    }

    Scenario("Read a cpu stat file") {
      Given("cpu stat file path")
      When("the file is read")
      Then("the content should be present")
      pending
    }

    Scenario("Read a memory info file") {
      Given("memory info file path")
      When("the file is read")
      Then("the content should be present")
      pending
    }
  }
}
