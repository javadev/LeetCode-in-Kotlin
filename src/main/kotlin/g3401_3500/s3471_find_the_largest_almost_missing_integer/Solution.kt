package g3401_3500.s3471_find_the_largest_almost_missing_integer

// #Easy #Array #Hash_Table #2025_03_06_Time_6_ms_(86.49%)_Space_46.27_MB_(5.41%)

class Solution {
    fun largestInteger(nums: IntArray, k: Int): Int {
        val freq = IntArray(51)
        for (i in 0..nums.size - k) {
            val set: MutableSet<Int> = HashSet<Int>()
            for (j in i..<i + k) {
                set.add(nums[j])
            }
            for (key in set) {
                freq[key]++
            }
        }
        for (i in 50 downTo 0) {
            if (freq[i] == 1) {
                return i
            }
        }
        return -1
    }
}
