package g0101_0200.s0179_largest_number

// #Medium #Top_Interview_Questions #String #Sorting #Greedy
// #2022_10_13_Time_380_ms_(43.40%)_Space_39.9_MB_(60.38%)

class Solution {
    fun largestNumber(nums: IntArray): String {
        val n = nums.size
        val s = arrayOfNulls<String>(n)
        for (i in 0 until n) {
            s[i] = nums[i].toString()
        }
        s.sortWith { a: String?, b: String? ->
            (b + a).compareTo(
                a + b
            )
        }
        val sb = StringBuilder()
        for (str in s) {
            sb.append(str)
        }
        val result = sb.toString()
        return if (result.startsWith("0")) "0" else result
    }
}
