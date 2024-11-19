package g1801_1900.s1819_number_of_different_subsequences_gcds

// #Hard #Array #Math #Counting #Number_Theory
// #2023_06_20_Time_624_ms_(100.00%)_Space_54.4_MB_(100.00%)

class Solution {
    fun countDifferentSubsequenceGCDs(nums: IntArray): Int {
        var max = 0
        for (num in nums) {
            max = max.coerceAtLeast(num)
        }
        val present = BooleanArray(200001)
        for (num in nums) {
            max = max.coerceAtLeast(num)
            present[num] = true
        }
        var count = 0
        for (i in 1..max) {
            if (present[i]) {
                count++
                continue
            }
            var tempGcd = 0
            var j = i
            while (j <= max) {
                if (present[j]) {
                    tempGcd = gcd(tempGcd, j)
                }
                if (tempGcd == i) {
                    count++
                    break
                }
                j += i
            }
        }
        return count
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) {
            a
        } else {
            gcd(b, a % b)
        }
    }
}
