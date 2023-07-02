package g2301_2400.s2367_number_of_arithmetic_triplets

// #Easy #Array #Hash_Table #Two_Pointers #Enumeration
class Solution {
    fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
        val set: MutableSet<Int> = HashSet()
        for (x in nums) {
            set.add(x)
        }
        var ans = 0
        for (x in nums) {
            if (set.contains(x - diff) && set.contains(x + diff)) {
                ans++
            }
        }
        return ans
    }
}
