package g2301_2400.s2364_count_number_of_bad_pairs

// #Medium #Array #Hash_Table #2023_07_02_Time_590_ms_(100.00%)_Space_54.8_MB_(100.00%)

class Solution {
    fun countBadPairs(nums: IntArray): Long {
        val seen = HashMap<Int, Int>()
        var count: Long = 0
        for (i in nums.indices) {
            val diff = i - nums[i]
            count += if (seen.containsKey(diff)) {
                (i - seen[diff]!!).toLong()
            } else {
                i.toLong()
            }
            seen[diff] = seen.getOrDefault(diff, 0) + 1
        }
        return count
    }
}
