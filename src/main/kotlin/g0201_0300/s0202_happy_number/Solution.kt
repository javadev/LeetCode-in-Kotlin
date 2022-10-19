package g0201_0300.s0202_happy_number

// #Easy #Top_Interview_Questions #Hash_Table #Math #Two_Pointers #Algorithm_II_Day_21_Others
// #Programming_Skills_I_Day_4_Loop #Level_2_Day_1_Implementation/Simulation
// #2022_10_19_Time_261_ms_(45.08%)_Space_33.7_MB_(78.51%)

class Solution {
    private val set = mutableSetOf<Int>()

    tailrec fun isHappy(n: Int): Boolean {
        var num = n
        var squareSum = 0
        while (num > 0) {
            val digit = num % 10
            squareSum += digit * digit
            num /= 10
        }
        if (squareSum == 1) {
            return true
        }
        if (set.contains(squareSum)) {
            return false
        }
        set.add(squareSum)
        return isHappy(squareSum)
    }
}
