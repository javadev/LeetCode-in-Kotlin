package g0401_0500.s0442_find_all_duplicates_in_an_array

// #Medium #Array #Hash_Table #Udemy_Arrays #2022_12_23_Time_480_ms_(73.81%)_Space_45.6_MB_(100.00%)

class Solution {
    fun findDuplicates(nums: IntArray): List<Int> {
        val setToCheck: MutableSet<Int> = mutableSetOf()
        val duplicates: MutableList<Int> = mutableListOf()

        nums.forEach { element ->
            if (!setToCheck.add(element)) {
                duplicates.add(element)
            }
        }

        return duplicates
    }
}
