package g0901_1000.s0974_subarray_sums_divisible_by_k

// #Medium #Array #Hash_Table #Prefix_Sum #2023_05_06_Time_334_ms_(66.67%)_Space_65_MB_(9.52%)

class Solution {
    fun subarraysDivByK(nums: IntArray, k: Int): Int {
        val map = IntArray(k)
        var ans = 0
        var sum = 0
        map[0] = 1
        for (num in nums) {
            sum += num
            var temp = sum % k
            if (temp < 0) {
                temp += k
            }
            ans += map[temp]++
        }
        return ans
    }
}
