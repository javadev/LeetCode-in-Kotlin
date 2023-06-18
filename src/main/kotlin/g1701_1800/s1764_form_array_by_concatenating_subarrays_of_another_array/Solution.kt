package g1701_1800.s1764_form_array_by_concatenating_subarrays_of_another_array

// #Medium #Array #Greedy #String_Matching #2023_06_18_Time_206_ms_(100.00%)_Space_38.6_MB_(100.00%)

class Solution {
    fun canChoose(groups: Array<IntArray>, nums: IntArray): Boolean {
        var prev = 0
        for (i in groups.indices) {
            val temp = IntArray(groups[i].size)
            if (prev + groups[i].size > nums.size) {
                return false
            }
            var index = 0
            var j: Int
            j = prev
            while (j < prev + groups[i].size) {
                temp[index++] = nums[j]
                j++
            }
            if (temp.contentEquals(groups[i])) {
                prev = j
                continue
            }
            var k: Int = j
            while (k < nums.size) {
                var l: Int
                l = 0
                while (l < temp.size - 1) {
                    temp[l] = temp[l + 1]
                    l++
                }
                temp[l] = nums[k]
                if (temp.contentEquals(groups[i])) {
                    prev = k + 1
                    break
                }
                k++
            }
            if (k == nums.size) {
                return false
            }
        }
        return true
    }
}
