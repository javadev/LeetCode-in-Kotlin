package g0201_0300.s0202_happy_number

// #Easy #Top_Interview_Questions #Hash_Table #Math #Two_Pointers #Algorithm_II_Day_21_Others
// #Programming_Skills_I_Day_4_Loop #Level_2_Day_1_Implementation/Simulation
// #2022_06_28_Time_1_ms_(98.59%)_Space_41_MB_(64.25%)
class Solution {
    fun isHappy(n: Int): Boolean {
        val happy: Boolean
        var a = n
        var rem: Int
        var sum = 0
        if (a == 1 || a == 7) {
            happy = true
        } else if (a > 1 && a < 10) {
            happy = false
        } else {
            while (a != 0) {
                rem = a % 10
                sum = sum + rem * rem
                a = a / 10
            }
            happy = if (sum != 1) {
                isHappy(sum)
            } else {
                true
            }
        }
        return happy
    }
}
