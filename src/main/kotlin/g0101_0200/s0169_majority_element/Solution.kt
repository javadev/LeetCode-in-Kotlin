package g0101_0200.s0169_majority_element

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Array #Hash_Table #Sorting #Counting
// #Divide_and_Conquer #Data_Structure_II_Day_1_Array #Udemy_Famous_Algorithm
// #Top_Interview_150_Array/String #Big_O_Time_O(n)_Space_O(1)
// #2022_09_08_Time_460_ms_(51.25%)_Space_52.9_MB_(52.64%)

class Solution {
    fun majorityElement(arr: IntArray): Int {
        var count = 1
        var majority = arr[0]
        // For Potential Majority Element
        for (i in 1 until arr.size) {
            if (arr[i] == majority) {
                count++
            } else {
                if (count > 1) {
                    count--
                } else {
                    majority = arr[i]
                }
            }
        }
        // For Confirmation
        count = 0
        for (j in arr) {
            if (j == majority) {
                count++
            }
        }
        return if (count >= arr.size / 2 + 1) {
            majority
        } else {
            -1
        }
    }
}
