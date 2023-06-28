package g2201_2300.s2295_replace_elements_in_an_array

// #Medium #Array #Hash_Table #Simulation
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
