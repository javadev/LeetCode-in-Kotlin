package g1501_1600.s1577_number_of_ways_where_square_of_number_is_equal_to_product_of_two_numbers

// #Medium #Array #Hash_Table #Math #Two_Pointers
// #2023_06_14_Time_209_ms_(100.00%)_Space_37.7_MB_(100.00%)

class Solution {
    fun numTriplets(nums1: IntArray, nums2: IntArray): Int {
        nums1.sort()
        nums2.sort()
        return count(nums1, nums2) + count(nums2, nums1)
    }

    fun count(a: IntArray, b: IntArray): Int {
        val m = b.size
        var count = 0
        for (value in a) {
            val x = value.toLong() * value
            var j = 0
            var k = m - 1
            while (j < k) {
                val prod = b[j].toLong() * b[k]
                if (prod < x) {
                    j++
                } else if (prod > x) {
                    k--
                } else if (b[j] != b[k]) {
                    var jNew = j
                    var kNew = k
                    while (b[j] == b[jNew]) {
                        jNew++
                    }
                    while (b[k] == b[kNew]) {
                        kNew--
                    }
                    count += (jNew - j) * (k - kNew)
                    j = jNew
                    k = kNew
                } else {
                    val q = k - j + 1
                    count += q * (q - 1) / 2
                    break
                }
            }
        }
        return count
    }
}
