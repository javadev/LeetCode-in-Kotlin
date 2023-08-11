package g0901_1000.s0950_reveal_cards_in_increasing_order

// #Medium #Array #Sorting #Simulation #Queue #2023_05_01_Time_176_ms_(100.00%)_Space_39_MB_(33.33%)

class Solution {
    fun deckRevealedIncreasing(deck: IntArray): IntArray {
        deck.sort()
        val n = deck.size
        val result = IntArray(n * 2)
        var idx = result.size - 1
        var lastIdx = result.size - 1
        var i = n - 1
        while (idx >= 0 && i >= 0) {
            if (i != n - 1) {
                result[idx--] = result[lastIdx--]
            }
            result[idx--] = deck[i--]
        }
        return result.copyOfRange(idx + 1, lastIdx + 1)
    }
}
