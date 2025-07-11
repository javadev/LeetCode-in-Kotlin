package g0001_0100.s0001_two_sum

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Array #Hash_Table
// #Data_Structure_I_Day_2_Array #Level_1_Day_13_Hashmap #Udemy_Arrays #Top_Interview_150_Hashmap
// #Big_O_Time_O(n)_Space_O(n) #AI_can_be_used_to_solve_the_task
// #2025_07_11_Time_2_ms_(98.77%)_Space_48.00_MB_(52.59%)

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val indexMap = HashMap<Int, Int>()
        for (i in numbers.indices) {
            val requiredNum = target - numbers[i]
            if (indexMap.containsKey(requiredNum)) {
                return intArrayOf(indexMap[requiredNum]!!, i)
            }
            indexMap[numbers[i]] = i
        }
        return intArrayOf(-1, -1)
    }
}
