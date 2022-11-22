package g0301_0400.s0374_guess_number_higher_or_lower

// #Easy #Binary_Search #Interactive #Binary_Search_I_Day_1
// #2022_11_22_Time_134_ms_(94.19%)_Space_32.6_MB_(98.60%)

/*
 * The API guess is defined in the parent class.
 * @param num   your guess
 * @return -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

class Solution : GuessGame() {
    fun guessNumber(n: Int): Int {
        var start = 0
        var end = n
        while (start <= end) {
            val mid = start + (end - start) / 2
            if (guess(mid) == 0) {
                return mid
            } else if (guess(mid) == -1) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        }
        return -1
    }
}
