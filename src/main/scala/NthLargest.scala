object NthLargest extends App {

  def checkNthLargest(nums: List[Int], n: Int): Int = {

    n match {
      case n if n <= nums.length =>
        val orderedList = nums.sorted.distinct.reverse
        orderedList(n - 1)
      case _ => throw new IllegalArgumentException("Illegal n number used")

    }
  }
}