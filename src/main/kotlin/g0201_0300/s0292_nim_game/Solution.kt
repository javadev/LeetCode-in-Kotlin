package g0201_0300.s0292_nim_game

// #Easy #Math #Game_Theory #Brainteaser #2022_11_06_Time_129_ms_(94.29%)_Space_32.8_MB_(85.71%)

class Solution {
    fun canWinNim(n: Int): Boolean {
        if (n % 4 == 0) {
            return false
        }
        return true
    }
}
