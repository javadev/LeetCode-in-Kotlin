package g3001_3100.s3070_count_submatrices_with_top_left_element_and_sum_less_than_k

// #Medium #Array #Matrix #Prefix_Sum #2024_04_16_Time_773_ms_(85.71%)_Space_134.2_MB_(71.43%)

class Solution {
    fun countSubmatrices(grid: Array<IntArray>, k: Int): Int {
        val n = grid[0].size
        val sums = IntArray(n)
        var ans = 0
        for (ints in grid) {
            var sum = 0
            for (col in 0 until n) {
                sum += ints[col]
                sums[col] += sum
                if (sums[col] <= k) {
                    ans++
                } else {
                    break
                }
            }
        }
        return ans
    }
}
