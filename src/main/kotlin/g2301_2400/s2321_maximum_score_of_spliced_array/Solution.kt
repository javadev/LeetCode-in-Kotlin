package g2301_2400.s2321_maximum_score_of_spliced_array

// #Hard #Array #Dynamic_Programming #2023_06_30_Time_497_ms_(50.00%)_Space_56.9_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun maximumsSplicedArray(nums1: IntArray, nums2: IntArray): Int {
        var nums1 = nums1
        var nums2 = nums2
        var sum1 = 0
        var sum2 = 0
        val n = nums1.size
        for (num in nums1) {
            sum1 += num
        }
        for (num in nums2) {
            sum2 += num
        }
        if (sum2 > sum1) {
            val temp = sum2
            sum2 = sum1
            sum1 = temp
            val temparr = nums2
            nums2 = nums1
            nums1 = temparr
        }
        // now sum1>=sum2
        // maxEndingHere denotes the maximum sum subarray ending at current index(ie. element at
        // current index has to be included)
        // minEndingHere denotes the minimum sum subarray ending at current index
        var maxEndingHere: Int
        var minEndingHere: Int
        var maxSoFar: Int
        var minSoFar: Int
        var currEle: Int
        minSoFar = nums2[0] - nums1[0]
        maxSoFar = minSoFar
        minEndingHere = maxSoFar
        maxEndingHere = minEndingHere
        for (i in 1 until n) {
            currEle = nums2[i] - nums1[i]
            minEndingHere += currEle
            maxEndingHere += currEle
            if (maxEndingHere < currEle) {
                maxEndingHere = currEle
            }
            if (minEndingHere > currEle) {
                minEndingHere = currEle
            }
            maxSoFar = maxEndingHere.coerceAtLeast(maxSoFar)
            minSoFar = minEndingHere.coerceAtMost(minSoFar)
        }
        // return the maximum of the 2 possibilities dicussed
        // also keep care that maxSoFar>=0 and maxSoFar<=0
        return (sum1 + maxSoFar.coerceAtLeast(0)).coerceAtLeast(sum2 - 0.coerceAtMost(minSoFar))
    }
}
