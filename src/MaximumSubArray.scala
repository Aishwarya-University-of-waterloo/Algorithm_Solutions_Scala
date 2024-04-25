private class MaximumSubArray {
  def maxSubArray(nums: Array[Int]): Int = {
    var max = nums(0);
    var current = 0;
    for (i <- nums) {
      current = Math.max(i, current + i);
      max = Math.max(current, max);
    }
    max;
  }


}
