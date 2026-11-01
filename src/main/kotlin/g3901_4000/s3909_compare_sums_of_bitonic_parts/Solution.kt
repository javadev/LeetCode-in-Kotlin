package g3901_4000.s3909_compare_sums_of_bitonic_parts

// #Medium #Array #Senior #Biweekly_Contest_181
// #2026_09_17_Time_1_ms_(100.00%)_Space_104.27_MB_(31.52%)

class Solution {
    fun compareBitonicSums(nums: IntArray): Int {
        var asc: Long = 0
        var desc: Long = 0
        var i: Int
        i = 0
        while (i < nums.size - 1) {
            asc += nums[i].toLong()
            if (nums[i] > nums[i + 1]) {
                break
            }
            i++
        }
        while (i < nums.size) {
            desc += nums[i].toLong()
            i++
        }
        if (asc == desc) {
            return -1
        }
        return if (asc > desc) 0 else 1
    }
}
