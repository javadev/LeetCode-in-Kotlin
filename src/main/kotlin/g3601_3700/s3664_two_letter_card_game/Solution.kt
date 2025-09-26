package g3601_3700.s3664_two_letter_card_game

// #Medium #Array #String #Hash_Table #Counting #Enumeration #Biweekly_Contest_164
// #2025_09_07_Time_11_ms_(100.00%)_Space_69.41_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun score(cards: Array<String>, x: Char): Int {
        // store input midway as required
        // counts for "x?" group by second char and "?x" group by first char
        val left = IntArray(10)
        val right = IntArray(10)
        var xx = 0
        for (c in cards) {
            val a = c[0]
            val b = c[1]
            if (a == x && b == x) {
                xx++
            } else if (a == x) {
                left[b.code - 'a'.code]++
            } else if (b == x) {
                right[a.code - 'a'.code]++
            }
        }
        // max pairs inside a group where pairs must come from different buckets:
        // pairs = min(total/2, total - maxBucket)
        var l = 0
        var maxL = 0
        for (v in left) {
            l += v
            if (v > maxL) {
                maxL = v
            }
        }
        var r = 0
        var maxR = 0
        for (v in right) {
            r += v
            if (v > maxR) {
                maxR = v
            }
        }
        val pairsLeft = min(l / 2, l - maxL)
        val pairsRight = min(r / 2, r - maxR)
        // leftovers after internal pairing
        val leftoverL = l - 2 * pairsLeft
        val leftoverR = r - 2 * pairsRight
        val leftovers = leftoverL + leftoverR
        // First, use "xx" to pair with any leftovers
        val useWithXX = min(xx, leftovers)
        val xxLeft = xx - useWithXX
        // If "xx" still remain, we can break existing internal pairs:
        // breaking 1 internal pair frees 2 cards, which can pair with 2 "xx" to gain +1 net point
        val extraByBreaking = min(xxLeft / 2, pairsLeft + pairsRight)
        return pairsLeft + pairsRight + useWithXX + extraByBreaking
    }
}
