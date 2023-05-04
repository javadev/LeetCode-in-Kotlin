package g0901_1000.s0961_n_repeated_element_in_size_2n_array

// #Easy #Array #Hash_Table #2023_05_04_Time_264_ms_(75.00%)_Space_58.1_MB_(12.50%)

class Solution {
    fun repeatedNTimes(nums: IntArray): Int {
        val hs: HashSet<Int> = HashSet()
        for (x in nums) {
            if (!hs.contains(x)) {
                hs.add(x)
            } else {
                return x
            }
        }
        return 1
    }
}
