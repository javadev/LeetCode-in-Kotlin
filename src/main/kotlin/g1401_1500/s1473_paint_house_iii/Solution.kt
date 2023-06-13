package g1401_1500.s1473_paint_house_iii

// #Hard #Array #Dynamic_Programming
class Solution {
    private lateinit var memo: Array<Array<IntArray>>
    private lateinit var houses: IntArray
    private var nColors = 0
    private lateinit var cost: Array<IntArray>

    fun minCost(houses: IntArray, cost: Array<IntArray>, nColors: Int, tGroups: Int): Int {
        this.cost = cost
        this.houses = houses
        memo = Array(houses.size) { Array(nColors + 1) { IntArray(tGroups + 1) } }
        this.nColors = nColors
        val dp = dp(0, 0, tGroups)
        return if (dp == Int.MAX_VALUE) -1 else dp
    }

    private fun dp(ithEl: Int, prevClr: Int, tGroups: Int): Int {
        if (ithEl == houses.size) {
            return if (tGroups == 0) 0 else Int.MAX_VALUE
        }
        if (ithEl < houses.size && tGroups < 0) {
            return Int.MAX_VALUE
        }
        if (memo[ithEl][prevClr][tGroups] == 0) {
            val currC = houses[ithEl]
            var res = Int.MAX_VALUE
            if (currC != 0) {
                val grpLeft = if (currC == prevClr) tGroups else tGroups - 1
                res = dp(ithEl + 1, currC, grpLeft)
            } else {
                for (clr in 1..nColors) {
                    val grpLeft = if (clr == prevClr) tGroups else tGroups - 1
                    val dp = dp(ithEl + 1, clr, grpLeft)
                    res = Math.min(
                        res,
                        if (dp != Int.MAX_VALUE) cost[ithEl][clr - 1] + dp else Int.MAX_VALUE
                    )
                }
            }
            memo[ithEl][prevClr][tGroups] = res
        }
        return memo[ithEl][prevClr][tGroups]
    }
}
