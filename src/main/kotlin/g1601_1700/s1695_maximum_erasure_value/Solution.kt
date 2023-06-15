package g1601_1700.s1695_maximum_erasure_value

// #Medium #Array #Hash_Table #Sliding_Window
class Solution {
    fun maximumUniqueSubarray(nums: IntArray): Int {
        var ans = 0
        var sum = 0
        val seen = BooleanArray(10001)
        var j = 0
        for (num in nums) {
            while (seen[num]) {
                seen[nums[j]] = false
                sum -= nums[j++]
            }
            seen[num] = true
            sum += num
            ans = Math.max(sum, ans)
        }
        return ans
    }
}
