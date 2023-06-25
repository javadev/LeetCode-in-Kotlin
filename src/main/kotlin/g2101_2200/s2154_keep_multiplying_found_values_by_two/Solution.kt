package g2101_2200.s2154_keep_multiplying_found_values_by_two

// #Easy #Array #Hash_Table #Sorting #Simulation
@Suppress("NAME_SHADOWING")
class Solution {
    fun findFinalValue(nums: IntArray, original: Int): Int {
        var original = original
        var i = 0
        while (i < nums.size) {
            if (nums[i] == original) {
                original = original * 2
                i = -1
            }
            i++
        }
        return original
    }
}
