package g2301_2400.s2379_minimum_recolors_to_get_k_consecutive_black_blocks

// #Easy #String #Sliding_Window
class Solution {
    fun minimumRecolors(blocks: String, k: Int): Int {
        val n = blocks.length
        var ans: Int
        var i: Int
        var cur = 0
        i = 0
        while (i < k) {
            if (blocks[i] == 'W') {
                cur++
            }
            i++
        }
        ans = cur
        i = k
        while (i < n) {
            if (blocks[i] == 'W') {
                cur++
            }
            if (blocks[i - k] == 'W') {
                cur--
            }
            ans = Math.min(ans, cur)
            i++
        }
        return ans
    }
}
