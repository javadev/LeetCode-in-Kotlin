package g1901_2000.s1946_largest_number_after_mutating_substring

// #Medium #Array #String #Greedy #2023_06_20_Time_346_ms_(100.00%)_Space_39.4_MB_(100.00%)

class Solution {
    fun maximumNumber(num: String, change: IntArray): String {
        val n = num.length
        val nums = num.toCharArray()
        val arr = CharArray(n)
        for (i in 0 until n) {
            val `val` = nums[i].code - '0'.code
            arr[i] = (change[`val`] + '0'.code).toChar()
        }
        var flag = false
        for (i in 0 until n) {
            if (nums[i] < arr[i]) {
                nums[i] = arr[i]
                flag = true
            } else if (flag && nums[i] > arr[i]) {
                break
            }
        }
        return String(nums)
    }
}
