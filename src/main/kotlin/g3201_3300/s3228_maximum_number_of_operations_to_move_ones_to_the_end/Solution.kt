package g3201_3300.s3228_maximum_number_of_operations_to_move_ones_to_the_end

// #Medium #String #Greedy #Counting #2024_07_23_Time_232_ms_(44.00%)_Space_38_MB_(96.00%)

class Solution {
    fun maxOperations(s: String): Int {
        val arr = s.toCharArray()
        var result = 0
        var ones = 0
        val n = arr.size
        for (i in 0 until n) {
            ones += arr[i].code - '0'.code
            if (i > 0 && arr[i] < arr[i - 1]) {
                result += ones
            }
        }
        return result
    }
}
