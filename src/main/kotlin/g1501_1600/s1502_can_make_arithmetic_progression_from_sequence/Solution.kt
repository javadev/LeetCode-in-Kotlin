package g1501_1600.s1502_can_make_arithmetic_progression_from_sequence

import java.util.*

// #Easy #Array #Sorting #Programming_Skills_I_Day_4_Loop
class Solution {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        Arrays.sort(arr)
        for (i in 0 until arr.size - 2) {
            if (arr[i + 1] - arr[i] != arr[i + 2] - arr[i + 1]) {
                return false
            }
        }
        return true
    }
}
