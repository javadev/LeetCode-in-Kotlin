package g4001_4100.s4031_find_all_numbers_disappeared_in_an_array_ii

// #Medium #Array #Sorting #Binary_Search #Senior #Weekly_Contest_516
// #2026_11_25_Time_14_ms_(98.35%)_Space_166.69_MB_(53.84%)

class Solution {
    fun findDisappearedNumbers(nums: IntArray, lower: Int, upper: Int): MutableList<MutableList<Int>> {
        val res: MutableList<MutableList<Int>> = ArrayList<MutableList<Int>>()
        val avail = BooleanArray(upper + 1)
        for (num in nums) {
            if (num >= lower && num <= upper) {
                avail[num] = true
            }
        }
        var i = lower
        while (i <= upper) {
            if (avail[i]) {
                i++
                continue
            }
            val start = i
            while (i <= upper && !avail[i]) {
                i++
            }
            val end = i - 1
            res.add(mutableListOf(start, end))
        }
        return res
    }
}
