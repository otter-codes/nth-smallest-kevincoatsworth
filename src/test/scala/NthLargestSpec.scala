import org.scalatest._

class NthLargestSpec extends WordSpec with MustMatchers {

  "NthLargest" must {

    "return 1 when given List(1) and an n of 1" in {
      NthLargest.checkNthLargest(List(1),1) mustEqual 1
    }

    "return 2 when given List(1,2,3) and an n of 1" in {
      NthLargest.checkNthLargest(List(1,2,3),2) mustEqual 2
    }

    "return 4 when given List(1,2,3,4,5) and an n of 2" in {
      NthLargest.checkNthLargest(List(1,2,3,4,5),2) mustEqual 4
    }

    "return 3 when given List(3,3,4,4,5,5) and an n of 3" in {
      NthLargest.checkNthLargest(List(3,3,4,4,5,5),3) mustEqual 3
    }

    "Throw IllegalArgumentException when given List(1,2) and an n of 3" in {

      val e = intercept[IllegalArgumentException] {
        NthLargest.checkNthLargest(List(1,2),3)
      }
      e.getMessage mustEqual "Illegal n number used"
    }

    "Throw IllegalArgumentException when given List(1,2,3) and an n of 0" in {

      val e = intercept[IllegalArgumentException] {
        NthLargest.checkNthLargest(List(1,2,3),0)
      }
      e.getMessage mustEqual "Illegal n number used"
    }
  }
}