package g1201_1300.s1224_maximum_equal_frequency

// #Hard #Array #Hash_Table #2023_06_09_Time_330_ms_(100.00%)_Space_48.6_MB_(100.00%)

class Solution {
    fun maxEqualFreq(nums: IntArray): Int {
        val count = IntArray(100001)
        val freq = IntArray(100001)
        val n = nums.size
        for (num in nums) {
            count[num]++
            freq[count[num]]++
        }
        for (i in n - 1 downTo 1) {
            if (freq[count[nums[i]]] * count[nums[i]] == i) {
                return i + 1
            }
            freq[count[nums[i]]]--
            count[nums[i]]--
            if (freq[count[nums[i - 1]]] * count[nums[i - 1]] == i) {
                return i + 1
            }
        }
        return 1
    }
}
