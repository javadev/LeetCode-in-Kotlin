package g2501_2600.s2537_count_the_number_of_good_subarrays

// #Medium #Array #Hash_Table #Sliding_Window
// #2023_07_04_Time_553_ms_(100.00%)_Space_58.3_MB_(100.00%)

class Solution {
    fun countGood(nums: IntArray, k: Int): Long {
        if (nums.size < 2) {
            return 0L
        }
        val countMap: MutableMap<Int, Int> = HashMap(nums.size, 0.99f)
        var goodSubArrays = 0L
        var current = 0L
        var left = 0
        var right = -1
        while (left < nums.size) {
            if (current < k) {
                if (++right == nums.size) {
                    break
                }
                val num = nums[right]
                var count = countMap[num]
                if (count == null) {
                    count = 1
                } else {
                    current += count.toLong()
                    if (current >= k) {
                        goodSubArrays += (nums.size - right).toLong()
                    }
                    count = count + 1
                }
                countMap[num] = count
            } else {
                val num = nums[left++]
                val count = countMap[num]!! - 1
                if (count > 0) {
                    countMap[num] = count
                    current -= count.toLong()
                } else {
                    countMap.remove(num)
                }
                if (current >= k) {
                    goodSubArrays += (nums.size - right).toLong()
                }
            }
        }
        return goodSubArrays
    }
}
