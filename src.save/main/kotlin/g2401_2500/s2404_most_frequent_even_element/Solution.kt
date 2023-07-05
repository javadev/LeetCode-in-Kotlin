package g2401_2500.s2404_most_frequent_even_element

// #Easy #Array #Hash_Table #Counting #2023_07_03_Time_349_ms_(90.91%)_Space_38.2_MB_(81.82%)

class Solution {
    fun mostFrequentEven(nums: IntArray): Int {
        val hm = HashMap<Int, Int>()
        var max = 0
        var small = Int.MAX_VALUE

        if (nums.size == 1) {
            return if (nums[0] % 2 == 0) nums[0]
            else -1
        }

        for (i in nums.indices) {
            if (nums[i] % 2 == 0) {
                hm[nums[i]] = hm.getOrDefault(nums[i], 0) + 1
                if (hm[nums[i]]!! > max) {
                    max = hm[nums[i]]!!
                }
            }
        }

        for ((key, value) in hm) {
            if (value == max && key < small) {
                small = key
            }
        }

        return if (small == Int.MAX_VALUE) -1 else small
    }
}
