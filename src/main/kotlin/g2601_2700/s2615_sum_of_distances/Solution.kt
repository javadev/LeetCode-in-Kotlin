package g2601_2700.s2615_sum_of_distances

// #Medium #Array #Hash_Table #Prefix_Sum #2023_07_14_Time_902_ms_(100.00%)_Space_77.9_MB_(100.00%)

class Solution {
    fun distance(nums: IntArray): LongArray {
        val map = HashMap<Int, LongArray>()
        for (i in nums.indices) {
            var temp = map[nums[i]]
            if (temp == null) {
                temp = LongArray(4)
                map[nums[i]] = temp
            }
            temp[0] += i.toLong()
            temp[2] += 1L
        }
        val ans = LongArray(nums.size)
        for (i in nums.indices) {
            val temp = map[nums[i]]
            ans[i] += i * temp!![3] - temp[1]
            temp[1] += i.toLong()
            temp[3] += 1L
            ans[i] += temp[0] - temp[1] - i * (temp[2] - temp[3])
        }
        return ans
    }
}
