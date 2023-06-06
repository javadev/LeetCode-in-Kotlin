package g1301_1400.s1385_find_the_distance_value_between_two_arrays

// #Easy #Array #Sorting #Binary_Search #Two_Pointers #Binary_Search_I_Day_3
class Solution {
    fun findTheDistanceValue(arr1: IntArray, arr2: IntArray, d: Int): Int {
        var count = 0
        for (k in arr1) {
            var j = 0
            while (j < arr2.size) {
                if (Math.abs(k - arr2[j]) <= d) {
                    break
                }
                j++
            }
            if (j == arr2.size) {
                count++
            }
        }
        return count
    }
}
