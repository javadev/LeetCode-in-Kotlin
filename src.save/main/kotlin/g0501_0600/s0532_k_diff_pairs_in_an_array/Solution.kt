package g0501_0600.s0532_k_diff_pairs_in_an_array

// #Medium #Array #Hash_Table #Sorting #Binary_Search #Two_Pointers #Udemy_Arrays
// #2023_01_15_Time_230_ms_(84.62%)_Space_37.3_MB_(92.31%)

class Solution {
    fun findPairs(nums: IntArray, k: Int): Int {
        var res = 0
        val set: HashSet<Int> = HashSet()
        val twice: HashSet<Int> = HashSet()
        for (n in nums) {
            if (set.contains(n)) {
                if (k == 0 && !twice.contains(n)) {
                    res++
                    twice.add(n)
                } else {
                    continue
                }
            } else {
                if (set.contains(n - k)) {
                    res++
                }
                if (set.contains(n + k)) {
                    res++
                }
            }
            set.add(n)
        }
        return res
    }
}
