package g1501_1600.s1502_can_make_arithmetic_progression_from_sequence

// #Easy #Array #Sorting #Programming_Skills_I_Day_4_Loop
// #2023_06_12_Time_156_ms_(94.82%)_Space_37_MB_(64.94%)

class Solution {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        arr.sort()
        for (i in 0 until arr.size - 2) {
            if (arr[i + 1] - arr[i] != arr[i + 2] - arr[i + 1]) {
                return false
            }
        }
        return true
    }
}
