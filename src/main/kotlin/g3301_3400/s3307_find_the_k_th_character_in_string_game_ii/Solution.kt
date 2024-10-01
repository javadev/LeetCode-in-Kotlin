package g3301_3400.s3307_find_the_k_th_character_in_string_game_ii

// #Hard #Math #Bit_Manipulation #Recursion #2024_10_01_Time_189_ms_(50.00%)_Space_36.7_MB_(83.33%)

class Solution {
    fun kthCharacter(k: Long, operations: IntArray): Char {
        if (k == 1L) {
            return 'a'
        }
        var len: Long = 1
        var newK: Long = -1
        var operation = -1
        for (ope in operations) {
            len *= 2
            if (len >= k) {
                operation = ope
                newK = k - len / 2
                break
            }
        }
        val ch = kthCharacter(newK, operations)
        if (operation == 0) {
            return ch
        }
        return if (ch == 'z') 'a' else (ch.code + 1).toChar()
    }
}
