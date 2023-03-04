package g0701_0800.s0744_find_smallest_letter_greater_than_target

// #Easy #Array #Binary_Search #Binary_Search_I_Day_4
// #2023_03_04_Time_162_ms_(100.00%)_Space_36.3_MB_(77.08%)

class Solution {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        var start = 0
        var end = letters.size - 1
        // If target is greater than last element return first element of the array.
        if (letters[letters.size - 1] <= target) {
            return letters[start]
        }
        while (start < end) {
            val mid = start + (end - start) / 2
            if (letters[mid] <= target) {
                start = mid + 1
            } else {
                end = mid
            }
        }
        return letters[start]
    }
}
