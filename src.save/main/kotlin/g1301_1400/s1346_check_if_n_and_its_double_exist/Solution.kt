package g1301_1400.s1346_check_if_n_and_its_double_exist

// #Easy #Array #Hash_Table #Sorting #Binary_Search #Two_Pointers #Binary_Search_I_Day_9
// #2023_06_06_Time_175_ms_(70.83%)_Space_36.2_MB_(63.89%)

class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        for (i in arr.indices) {
            for (j in arr.indices) {
                if (i != j && (arr[i] * 2 == arr[j] || arr[i] == arr[j] * 2)) {
                    return true
                }
            }
        }
        return false
    }
}
