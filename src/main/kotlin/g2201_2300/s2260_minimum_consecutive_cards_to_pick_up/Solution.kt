package g2201_2300.s2260_minimum_consecutive_cards_to_pick_up

// #Medium #Array #Hash_Table #Sliding_Window
class Solution {
    fun minimumCardPickup(cards: IntArray): Int {
        var mindiff = Int.MAX_VALUE
        val map: MutableMap<Int, Int> = HashMap()
        val n = cards.size
        for (i in 0 until n) {
            if (map.containsKey(cards[i])) {
                val j = map[cards[i]]!!
                mindiff = Math.min(mindiff, i - j + 1)
            }
            map[cards[i]] = i
        }
        return if (mindiff == Int.MAX_VALUE) {
            -1
        } else mindiff
    }
}
