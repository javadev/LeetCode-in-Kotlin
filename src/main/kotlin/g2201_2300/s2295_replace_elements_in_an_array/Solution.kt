package g2201_2300.s2295_replace_elements_in_an_array

// #Medium #Array #Hash_Table #Simulation #2023_06_28_Time_913_ms_(100.00%)_Space_101.1_MB_(100.00%)

class Solution {
    fun arrayChange(nums: IntArray, operations: Array<IntArray>): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            map[nums[i]] = i
        }
        for (operation in operations) {
            val index = map[operation[0]]!!
            nums[index] = operation[1]
            map[operation[1]] = index
        }
        return nums
    }
}
