package g1801_1900.s1871_jump_game_vii

// #Medium #String #Two_Pointers #Prefix_Sum
// #2023_06_22_Time_247_ms_(100.00%)_Space_37.9_MB_(100.00%)

class Solution {
    fun canReach(s: String, minJump: Int, maxJump: Int): Boolean {
        var j = 0
        val n = s.length
        val li = s.toCharArray()
        var i = 0
        while (i < n) {

            // o == ok
            if (i == 0 || li[i] == 'o') {
                j = Math.max(j, i + minJump)
                while (j < Math.min(n, i + maxJump + 1)) {
                    if (li[j] == '0') {
                        li[j] = 'o'
                    }
                    j++
                }
            }
            if (j > n) {
                break
            }
            i++
        }
        return li[n - 1] == 'o'
    }
}
