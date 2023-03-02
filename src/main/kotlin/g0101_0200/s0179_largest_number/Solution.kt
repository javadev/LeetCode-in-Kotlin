package g0101_0200.s0179_largest_number

// #Medium #Top_Interview_Questions #String #Sorting #Greedy
// #2023_03_02_Time_187_ms_(100.00%)_Space_36.7_MB_(76.56%)

class Solution {
    fun largestNumber(nums: IntArray): String {
        val n = nums.size
        val s = arrayOfNulls<String>(n)
        for (i in 0 until n) {
            s[i] = nums[i].toString()
        }
        s.sortWith { a, b -> (b + a).compareTo(a + b) }
        val sb = StringBuilder()
        for (str in s) {
            sb.append(str)
        }
        val result = sb.toString()
        return if (result.startsWith("0")) "0" else result
    }
}
