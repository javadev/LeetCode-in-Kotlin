package g2101_2200.s2200_find_all_k_distant_indices_in_an_array

// #Easy #Array
class Solution {
    fun findKDistantIndices(nums: IntArray, key: Int, k: Int): List<Int> {
        val ans: MutableList<Int> = ArrayList()
        var start = 0
        val n = nums.size
        for (i in 0 until n) {
            if (nums[i] == key) {
                start = Math.max(i - k, start)
                val end = Math.min(i + k, n - 1)
                while (start <= end) {
                    ans.add(start++)
                }
            }
        }
        return ans
    }
}
