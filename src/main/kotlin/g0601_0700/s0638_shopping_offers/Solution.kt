package g0601_0700.s0638_shopping_offers

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask #Memoization
// #2023_02_10_Time_195_ms_(100.00%)_Space_35.1_MB_(100.00%)

class Solution() {
    fun shoppingOffers(
        price: List<Int>,
        special: List<List<Int>>,
        needs: List<Int>
    ): Int {
        val map: MutableMap<List<Int>, Int> = HashMap()
        shoppingOffersUtil(price, special, needs, map)
        return map[needs]!!
    }

    private fun shoppingOffersUtil(
        price: List<Int>,
        special: List<List<Int>>,
        needs: List<Int>,
        map: MutableMap<List<Int>, Int>
    ): Int {
        if (map.containsKey(needs)) {
            return map[needs]!!
        }
        var ans = computePrice(price, needs)
        for (i in special.indices) {
            if (verify(special[i], needs)) {
                ans = Math.min(
                    special[i][needs.size] +
                        shoppingOffersUtil(
                            price,
                            special,
                            updatedNeeds(needs, special[i]),
                            map
                        ),
                    ans
                )
            }
        }
        map[needs] = ans
        return (map[needs])!!
    }

    private fun updatedNeeds(needs: List<Int>, special: List<Int>): List<Int> {
        val updatedNeeds: MutableList<Int> = ArrayList(needs)
        for (i in needs.indices) {
            updatedNeeds[i] = updatedNeeds[i] - special[i]
        }
        return updatedNeeds
    }

    private fun verify(special: List<Int>, needs: List<Int>): Boolean {
        for (i in needs.indices) {
            if (special[i] > needs[i]) {
                return false
            }
        }
        return true
    }

    private fun computePrice(price: List<Int>, needs: List<Int>): Int {
        var ans = 0
        for (i in needs.indices) {
            ans += (needs[i] * price[i])
        }
        return ans
    }
}
