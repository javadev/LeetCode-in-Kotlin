package g0001_0100.s0001_two_sum

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Array #Hash_Table
// #Data_Structure_I_Day_2_Array #Level_1_Day_13_Hashmap #Udemy_Arrays
// #2022_07_14_Time_234_ms_(92.75%)_Space_37.5_MB_(93.77%)

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val indexMap: MutableMap<Int, Int> = HashMap()
        for (i in numbers.indices) {
            val requiredNum = target - numbers[i]
            if (indexMap.containsKey(requiredNum)) {
                return intArrayOf(indexMap.getValue(requiredNum), i)
            }
            indexMap[numbers[i]] = i
        }
        return intArrayOf(-1, -1)
    }
}
