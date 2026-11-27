package g4001_4100.s4036_lexicographically_largest_string_after_pair_transformations

// #Medium #Array #String #Greedy #Bit_Manipulation #Staff #Biweekly_Contest_190
// #2026_11_25_Time_46_ms_(99.50%)_Space_130.17_MB_(98.51%)

class Solution {
    fun largestString(nums: IntArray): Array<String> {
        val n = nums.size
        val ans = Array<String>(n) { "" }
        for (i in 0..<n) {
            val num = nums[i]
            var mask = num and 33554431
            val zCount = num ushr 25
            val arr = CharArray(Integer.bitCount(mask) + zCount)
            for (j in 0..<zCount) {
                arr[j] = 'z'
            }
            var index = arr.size - 1
            var c = 'a'
            while (mask > 0) {
                if ((mask and 1) == 1) {
                    arr[index--] = c
                }
                c++
                mask = mask ushr 1
            }
            ans[i] = String(arr)
        }
        return ans
    }
}
