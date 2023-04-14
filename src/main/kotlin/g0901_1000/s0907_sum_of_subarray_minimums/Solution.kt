package g0901_1000.s0907_sum_of_subarray_minimums

// #Medium #Array #Dynamic_Programming #Stack #Monotonic_Stack
// #2023_04_14_Time_341_ms_(100.00%)_Space_44.3_MB_(100.00%)

class Solution {
    private fun calculateRight(i: Int, start: Int, right: IntArray, arr: IntArray, len: Int): Int {
        if (start >= len) {
            return 0
        }
        return if (arr[start] < arr[i]) {
            0
        } else (1 + right[start] + calculateRight(i, start + right[start] + 1, right, arr, len)) % MOD
    }

    private fun calculateLeft(i: Int, start: Int, left: IntArray, arr: IntArray, len: Int): Int {
        if (start < 0) {
            return 0
        }
        return if (arr[start] <= arr[i]) {
            0
        } else (1 + left[start] + calculateLeft(i, start - left[start] - 1, left, arr, len)) % MOD
    }

    fun sumSubarrayMins(arr: IntArray): Int {
        val len = arr.size
        val right = IntArray(len)
        val left = IntArray(len)
        right[len - 1] = 0
        for (i in len - 2 downTo 0) {
            right[i] = calculateRight(i, i + 1, right, arr, len)
        }
        left[0] = 0
        for (i in 1 until len) {
            left[i] = calculateLeft(i, i - 1, left, arr, len)
        }
        var answer = 0
        for (i in 0 until len) {
            val model: Long = 1000000007
            answer += ((1 + left[i]) * (1 + right[i]).toLong() % model * arr[i] % model).toInt()
            answer %= MOD
        }
        return answer
    }

    companion object {
        private const val MOD = 1000000007
    }
}
