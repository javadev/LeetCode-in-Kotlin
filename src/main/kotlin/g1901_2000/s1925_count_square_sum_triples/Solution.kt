package g1901_2000.s1925_count_square_sum_triples

// #Easy #Math #Enumeration
class Solution {
    fun countTriples(n: Int): Int {
        var count = 0
        for (i in 1 until n) {
            for (j in 1 until n) {
                val product = i * i + j * j
                val sq = Math.sqrt(product.toDouble())
                if (sq <= n && sq - Math.floor(sq) == 0.0) {
                    count++
                }
            }
        }
        return count
    }
}
