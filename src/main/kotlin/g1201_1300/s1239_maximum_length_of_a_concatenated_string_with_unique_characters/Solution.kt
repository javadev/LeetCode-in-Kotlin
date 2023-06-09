package g1201_1300.s1239_maximum_length_of_a_concatenated_string_with_unique_characters

// #Medium #Array #String #Bit_Manipulation #Backtracking
// #2023_06_09_Time_166_ms_(50.00%)_Space_37.5_MB_(50.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun maxLength(arr: List<String>): Int {
        return find(0, 0, arr)
    }

    private fun find(index: Int, visChar: Int, arr: List<String>): Int {
        var visChar = visChar
        if (index == arr.size) {
            return 0
        }
        var ans = 0
        ans = Math.max(ans, find(index + 1, visChar, arr))
        if (checkCurrStringValidOrNot(visChar, arr[index])) {
            visChar = updateState(visChar, arr[index])
            ans = Math.max(ans, arr[index].length + find(index + 1, visChar, arr))
        }
        return ans
    }

    private fun checkCurrStringValidOrNot(vis: Int, s: String): Boolean {
        var vis = vis
        for (c in s.toCharArray()) {
            if (vis and (1 shl c.code - 'a'.code) != 0) {
                return false
            }
            vis = vis or (1 shl c.code - 'a'.code)
        }
        return true
    }

    private fun updateState(vis: Int, s: String): Int {
        var vis = vis
        for (c in s.toCharArray()) {
            vis = vis or (1 shl c.code - 'a'.code)
        }
        return vis
    }
}
