package g0901_1000.s0927_three_equal_parts

// #Hard #Array #Math #2023_04_24_Time_303_ms_(100.00%)_Space_41.5_MB_(100.00%)

class Solution {
    fun threeEqualParts(arr: IntArray): IntArray {
        var ones = 0
        for (num in arr) {
            ones += num
        }
        if (ones == 0) {
            return intArrayOf(0, 2)
        } else if (ones % 3 != 0) {
            return intArrayOf(-1, -1)
        }
        ones /= 3
        var index1 = -1
        var index2 = -1
        var index3 = -1
        var totalOnes = 0
        for (i in arr.indices) {
            if (arr[i] == 0) {
                continue
            }
            totalOnes += arr[i]
            when (totalOnes) {
                1 -> index1 = i
                ones + 1 -> index2 = i
                2 * ones + 1 -> index3 = i
            }
        }
        while (index3 < arr.size) {
            if (arr[index1] == arr[index3] && arr[index2] == arr[index3]) {
                ++index1
                ++index2
                ++index3
            } else {
                return intArrayOf(-1, -1)
            }
        }
        return intArrayOf(index1 - 1, index2)
    }
}
