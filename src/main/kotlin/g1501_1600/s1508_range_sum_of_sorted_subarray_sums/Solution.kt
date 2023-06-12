package g1501_1600.s1508_range_sum_of_sorted_subarray_sums

// #Medium #Array #Sorting #Binary_Search #Two_Pointers #Binary_Search_II_Day_14
class Solution {
    fun rangeSum(nums: IntArray, n: Int, left: Int, right: Int): Int {
        val len = n * (n + 1) / 2
        val arr = IntArray(len)
        var idx = 0
        var prev = 0
        for (i in 0 until n) {
            for (j in i until n) {
                arr[idx] = prev + nums[j]
                prev = arr[idx]
                idx++
            }
            prev = 0
        }
        arr.sort()
        var result = 0
        val mod = 1000000007
        for (i in left - 1 until right) {
            result = (result + arr[i]) % mod
        }
        return result
    }
}
