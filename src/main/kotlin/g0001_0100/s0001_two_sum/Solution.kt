package g0001_0100.s0001_two_sum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val res = IntArray(2)
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            val value = target - nums[i]
            if (!map.containsKey(value)) {
                map[nums[i]] = i
                continue
            }
            if (map[value] != i) {
                res[1] = i
                res[0] = map[value]!!
                break
            }
        }
        return res
    }
}
