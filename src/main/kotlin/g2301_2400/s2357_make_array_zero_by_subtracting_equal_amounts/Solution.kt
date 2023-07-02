package g2301_2400.s2357_make_array_zero_by_subtracting_equal_amounts

// #Easy #Array #Hash_Table #Sorting #Heap_Priority_Queue #Simulation
class Solution {
    fun minimumOperations(nums: IntArray): Int {
        val set: MutableSet<Int> = HashSet()
        for (a in nums) {
            if (a > 0) {
                set.add(a)
            }
        }
        return set.size
    }
}
