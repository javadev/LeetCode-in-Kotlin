package g0401_0500.s0492_construct_the_rectangle

// #Easy #Math #2023_01_03_Time_202_ms_(88.89%)_Space_33.8_MB_(55.56%)

class Solution {
    /*
      Algorithm:
     - start with an index i from the square root all the way to 1;
     - if at any time, area % i == 0 (so i is a divisor of area), then it's the closest solution.
     */
    fun constructRectangle(area: Int): IntArray {
        var low = Math.sqrt(area.toDouble()).toInt()
        while (low > 0) {
            if (area % low == 0) {
                return intArrayOf(area / low, low)
            }
            low--
        }
        return intArrayOf(0, 0)
    }
}
