

object Main {
  def main(args: Array[String]): Unit = {
    println("Algorithms")
    val obj = new MaximumSubArray();
    val ar = Array(-2, 1, -3, 4,-1,2,1,-5,4)
    val maxPossibleSum= obj.maxSubArray(ar);
    println(maxPossibleSum)

  }


}