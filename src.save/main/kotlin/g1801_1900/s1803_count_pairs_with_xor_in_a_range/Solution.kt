package g1801_1900.s1803_count_pairs_with_xor_in_a_range

// #Hard #Array #Bit_Manipulation #Trie #2023_06_19_Time_427_ms_(100.00%)_Space_40.6_MB_(100.00%)

class Solution {
    fun countPairs(nums: IntArray, low: Int, high: Int): Int {
        val root = Trie()
        var pairsCount = 0
        for (num in nums) {
            val pairsCountHigh = countPairsWhoseXorLessThanX(num, root, high + 1)
            val pairsCountLow = countPairsWhoseXorLessThanX(num, root, low)
            pairsCount += pairsCountHigh - pairsCountLow
            root.insertNumber(num)
        }
        return pairsCount
    }

    private fun countPairsWhoseXorLessThanX(num: Int, root: Trie, x: Int): Int {
        var pairs = 0
        var curr: Trie? = root
        var i = 14
        while (i >= 0 && curr != null) {
            val numIthBit = num shr i and 1
            val xIthBit = x shr i and 1
            if (xIthBit == 1) {
                if (curr.child[numIthBit] != null) {
                    pairs += curr.child[numIthBit]!!.count
                }
                curr = curr.child[1 - numIthBit]
            } else {
                curr = curr.child[numIthBit]
            }
            i--
        }
        return pairs
    }

    private class Trie {
        var child: Array<Trie?> = arrayOfNulls(2)
        var count: Int = 0

        fun insertNumber(num: Int) {
            var curr = this
            for (i in 14 downTo 0) {
                val ithBit = num shr i and 1
                if (curr.child[ithBit] == null) {
                    curr.child[ithBit] = Trie()
                }
                curr.child[ithBit]!!.count++
                curr = curr.child[ithBit]!!
            }
        }
    }
}
