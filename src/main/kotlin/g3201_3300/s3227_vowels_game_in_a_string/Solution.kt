package g3201_3300.s3227_vowels_game_in_a_string

// #Medium #String #Math #Game_Theory #Brainteaser
// #2024_07_23_Time_234_ms_(90.32%)_Space_38.9_MB_(83.87%)

class Solution {
    fun doesAliceWin(s: String): Boolean {
        for (element in s) {
            if (element == 'a' || element == 'e' || element == 'i' || element == 'o' || element == 'u') {
                return true
            }
        }
        return false
    }
}
