package g1401_1500.s1458_max_dot_product_of_two_subsequences

// #Hard #Array #Dynamic_Programming
class Solution {
    fun maxDotProduct(nums1: IntArray, nums2: IntArray): Int {
        val marks = Array(nums1.size) { IntArray(nums2.size) }
        for (i in nums1.indices) {
            for (j in nums2.indices) {
                var max = nums1[i] * nums2[j]
                if (i > 0 && j > 0) {
                    max = Math.max(max, max + marks[i - 1][j - 1])
                }
                if (i > 0) {
                    max = Math.max(max, marks[i - 1][j])
                }
                if (j > 0) {
                    max = Math.max(max, marks[i][j - 1])
                }
                marks[i][j] = max
            }
        }
        return marks[nums1.size - 1][nums2.size - 1]
    }
}
