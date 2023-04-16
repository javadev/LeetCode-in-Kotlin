package g0901_1000.s0914_x_of_a_kind_in_a_deck_of_cards

class Solution {
    fun hasGroupsSizeX(deck: IntArray): Boolean {
        val map: HashMap<Int, Int> = HashMap()
        for (j in deck) {
            if (map.containsKey(j)) {
                map[j] = map[j]!! + 1
            } else {
                map[j] = 1
            }
        }
        var x = map[deck[0]]!!

        for (entry in map.entries.iterator()) {
            x = gcd(x, entry.value)
        }
        return x >= 2
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) {
            a
        } else gcd(b, a % b)
    }
}
