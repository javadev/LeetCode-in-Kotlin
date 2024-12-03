package g3301_3400.s3371_identify_the_largest_outlier_in_an_array

// #Medium #Array #Hash_Table #Counting #Enumeration
// #2024_12_03_Time_5_ms_(100.00%)_Space_60.6_MB_(33.40%)

class Solution {
    fun getLargestOutlier(nums: IntArray): Int {
        val cnt = IntArray(2001)
        var sum = 0
        for (i in nums) {
            sum += i
            cnt[i + 1000]++
        }
        for (i in cnt.indices.reversed()) {
            val j = i - 1000
            if (cnt[i] == 0) {
                continue
            }
            sum -= j
            val csum = (sum shr 1) + 1000
            cnt[i]--
            if (sum % 2 == 0 && csum >= 0 && csum < cnt.size && cnt[csum] > 0) {
                return j
            }
            sum += j
            cnt[i]++
        }
        return 0
    }
}
