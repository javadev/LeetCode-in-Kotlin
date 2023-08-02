package g1301_1400.s1306_jump_game_iii

// #Medium #Array #Depth_First_Search #Breadth_First_Search
// #Graph_Theory_I_Day_11_Breadth_First_Search #Udemy_Arrays
// #2023_06_05_Time_291_ms_(100.00%)_Space_58.3_MB_(88.46%)

class Solution {
    private lateinit var dp: BooleanArray
    private var found = false

    fun canReach(arr: IntArray, start: Int): Boolean {
        if (arr[start] == 0) {
            return true
        }
        dp = BooleanArray(arr.size)
        dp[start] = true
        recurse(arr, start)
        return found
    }

    private fun recurse(arr: IntArray, index: Int) {
        if (found) {
            return
        }
        if (index - arr[index] >= 0 && !dp[index - arr[index]]) {
            if (arr[index - arr[index]] == 0) {
                found = true
                return
            }
            dp[index - arr[index]] = true
            recurse(arr, index - arr[index])
        }
        if (index + arr[index] < arr.size && !dp[index + arr[index]]) {
            if (arr[index + arr[index]] == 0) {
                found = true
                return
            }
            dp[index + arr[index]] = true
            recurse(arr, index + arr[index])
        }
    }
}
