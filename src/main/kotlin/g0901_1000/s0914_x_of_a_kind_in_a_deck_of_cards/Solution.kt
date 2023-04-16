package g0901_1000.s0914_x_of_a_kind_in_a_deck_of_cards

// #Easy #Array #Hash_Table #Math #Counting #Number_Theory
// #2023_04_16_Time_238_ms_(70.00%)_Space_37.6_MB_(60.00%)

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
