package g0201_0300.s0299_bulls_and_cows

// #Medium #String #Hash_Table #Counting #Level_1_Day_13_Hashmap
// #2022_11_06_Time_254_ms_(84.82%)_Space_35.3_MB_(100.00%)

class Solution {
    fun getHint(secret: String, guess: String): String {
        val ans = IntArray(10)
        var bulls = 0
        var cows = 0
        for (i in 0 until secret.length) {
            val s = Character.getNumericValue(secret[i])
            val g = Character.getNumericValue(guess[i])
            if (s == g) {
                bulls++
            } else {
                // digit s was already seen in guess, is being seen again in secret
                if (ans[s] < 0) {
                    cows++
                }
                // digit was already seen in secret, now being seen again in guess
                if (ans[g] > 0) {
                    cows++
                }
                ans[s]++
                ans[g]--
            }
        }
        return bulls.toString() + "A" + cows + "B"
    }
}
