package g1301_1400.s1313_decompress_run_length_encoded_list

// #Easy #Array #2023_06_05_Time_196_ms_(100.00%)_Space_37.5_MB_(88.24%)

class Solution {
    fun decompressRLElist(nums: IntArray): IntArray {
        var len = 0
        run {
            var i = 0
            while (i < nums.size) {
                len += nums[i]
                i += 2
            }
        }
        val ans = IntArray(len)
        var index = 0
        var i = 0
        while (i < nums.size) {
            var j = nums[i]
            while (j > 0) {
                ans[index] = nums[i + 1]
                index++
                j--
            }
            i += 2
        }
        return ans
    }
}
