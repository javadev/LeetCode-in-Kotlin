package g3201_3300.s3232_find_if_digit_game_can_be_won

// #Easy #Array #Math #2024_08_03_Time_194_ms_(36.00%)_Space_40_MB_(5.33%)

class Solution {
    fun canAliceWin(nums: IntArray): Boolean {
        var sdSum = 0
        var ddSum = 0
        for (num in nums) {
            if (num / 10 == 0) {
                sdSum += num
            } else {
                ddSum += num
            }
        }
        return sdSum != ddSum
    }
}
