package g1501_1600.s1537_get_the_maximum_score

// #Hard #Array #Dynamic_Programming #Greedy #Two_Pointers
class Solution {
    fun maxSum(nums1: IntArray, nums2: IntArray): Int {
        val mod = 1000000007
        var result: Long = 0
        var start1 = 0
        var start2 = 0
        var sum1: Long = 0
        var sum2: Long = 0
        while (start1 < nums1.size && start2 < nums2.size) {
            if (nums1[start1] < nums2[start2]) {
                sum1 += nums1[start1].toLong()
                start1++
            } else if (nums1[start1] > nums2[start2]) {
                sum2 += nums2[start2].toLong()
                start2++
            } else {
                result += Math.max(sum1, sum2) + nums1[start1]
                start1++
                start2++
                sum1 = 0
                sum2 = 0
            }
        }
        while (start1 < nums1.size) {
            sum1 += nums1[start1].toLong()
            start1++
        }
        while (start2 < nums2.size) {
            sum2 += nums2[start2].toLong()
            start2++
        }
        return ((Math.max(sum1, sum2) + result) % mod).toInt()
    }
}
