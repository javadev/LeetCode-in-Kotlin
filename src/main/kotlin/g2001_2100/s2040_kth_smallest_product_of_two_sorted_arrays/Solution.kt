package g2001_2100.s2040_kth_smallest_product_of_two_sorted_arrays

// #Hard #Array #Binary_Search #2023_06_23_Time_1001_ms_(100.00%)_Space_51.9_MB_(100.00%)

class Solution {
    fun kthSmallestProduct(nums1: IntArray, nums2: IntArray, k: Long): Long {
        val n = nums2.size
        var lo = -inf - 1
        var hi = inf + 1
        while (lo < hi) {
            val mid = lo + (hi - lo shr 1)
            var cnt: Long = 0
            for (i in nums1) {
                var l = 0
                var r = n - 1
                var p = 0
                if (0 <= i) {
                    while (l <= r) {
                        val c = l + (r - l shr 1)
                        val mul = i * nums2[c].toLong()
                        if (mul <= mid) {
                            p = c + 1
                            l = c + 1
                        } else {
                            r = c - 1
                        }
                    }
                } else {
                    while (l <= r) {
                        val c = l + (r - l shr 1)
                        val mul = i * nums2[c].toLong()
                        if (mul <= mid) {
                            p = n - c
                            r = c - 1
                        } else {
                            l = c + 1
                        }
                    }
                }
                cnt += p.toLong()
            }
            if (cnt >= k) {
                hi = mid
            } else {
                lo = mid + 1L
            }
        }
        return lo
    }

    companion object {
        var inf = 1e10.toLong()
    }
}
