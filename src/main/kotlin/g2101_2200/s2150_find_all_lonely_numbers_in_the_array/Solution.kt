package g2101_2200.s2150_find_all_lonely_numbers_in_the_array

// #Medium #Array #Hash_Table #Counting
class Solution {
    fun findLonely(nums: IntArray): List<Int> {
        val ans: MutableList<Int> = ArrayList()
        val m = HashMap<Int, Int>()
        for (i in nums) {
            m[i] = m.getOrDefault(i, 0) + 1
        }
        for (i in nums) {
            if (m[i] == 1 && !m.containsKey(i - 1) && !m.containsKey(i + 1)) {
                ans.add(i)
            }
        }
        return ans
    }
}
