package g2301_2400.s2347_best_poker_hand

// #Easy #Array #Hash_Table #Counting
class Solution {
    fun bestHand(ranks: IntArray, suits: CharArray): String {
        val map = HashMap<Char, Int>()
        for (suit in suits) {
            if (map.containsKey(suit)) {
                map[suit] = map[suit]!! + 1
                if (map[suit] == 5) {
                    return "Flush"
                }
            } else {
                map[suit] = 1
            }
        }
        var s = ""
        val map2 = HashMap<Int, Int>()
        for (rank in ranks) {
            if (map2.containsKey(rank)) {
                map2[rank] = map2[rank]!! + 1
                if (map2[rank] == 2) {
                    s = "Pair"
                } else if (map2[rank] == 3) {
                    s = "Three of a Kind"
                    return s
                }
            } else {
                map2[rank] = 1
            }
        }
        return if (s.isEmpty()) "High Card" else s
    }
}
