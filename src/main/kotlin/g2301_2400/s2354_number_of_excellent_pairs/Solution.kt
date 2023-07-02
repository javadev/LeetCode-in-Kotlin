package g2301_2400.s2354_number_of_excellent_pairs

// #Hard #Array #Hash_Table #Binary_Search #Bit_Manipulation
class Solution {
    fun countExcellentPairs(nums: IntArray, k: Int): Long {
        val cnt = LongArray(30)
        var res = 0L
        val set: MutableSet<Int> = HashSet()
        for (a in nums) {
            set.add(a)
        }
        for (a in set) {
            cnt[Integer.bitCount(a)]++
        }
        for (i in 1..29) {
            for (j in 1..29) {
                if (i + j >= k) {
                    res += cnt[i] * cnt[j]
                }
            }
        }
        return res
    }
}
