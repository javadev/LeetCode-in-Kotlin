package g3701_3800.s3719_longest_balanced_subarray_i

// #Medium #Array #Hash_Table #Prefix_Sum #Divide_and_Conquer #Segment_Tree #Weekly_Contest_472
// #2025_10_21_Time_10_ms_(100.00%)_Space_45.40_MB_(48.93%)

class Solution {
    fun longestBalanced(nums: IntArray): Int {
        val n = nums.size
        var maxVal = 0
        for (v in nums) {
            if (v > maxVal) {
                maxVal = v
            }
        }
        val evenMark = IntArray(maxVal + 1)
        val oddMark = IntArray(maxVal + 1)
        var stampEven = 0
        var stampOdd = 0
        var ans = 0
        for (i in 0..<n) {
            if (n - i <= ans) {
                break
            }
            stampEven++
            stampOdd++
            var distinctEven = 0
            var distinctOdd = 0
            for (j in i..<n) {
                val v = nums[j]
                if ((v and 1) == 0) {
                    if (evenMark[v] != stampEven) {
                        evenMark[v] = stampEven
                        distinctEven++
                    }
                } else {
                    if (oddMark[v] != stampOdd) {
                        oddMark[v] = stampOdd
                        distinctOdd++
                    }
                }
                if (distinctEven == distinctOdd) {
                    val len = j - i + 1
                    if (len > ans) {
                        ans = len
                    }
                }
            }
        }
        return ans
    }
}
