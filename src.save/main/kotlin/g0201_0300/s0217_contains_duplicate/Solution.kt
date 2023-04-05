package g0201_0300.s0217_contains_duplicate

// #Easy #Top_Interview_Questions #Array #Hash_Table #Sorting #Data_Structure_I_Day_1_Array
// #Programming_Skills_I_Day_11_Containers_and_Libraries #Udemy_Arrays
// #2022_10_25_Time_719_ms_(73.49%)_Space_71.6_MB_(55.82%)

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set: MutableSet<Int> = HashSet()
        for (n in nums) {
            if (set.contains(n)) {
                return true
            }
            set.add(n)
        }
        return false
    }
}
