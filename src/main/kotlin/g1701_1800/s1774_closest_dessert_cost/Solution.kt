package g1701_1800.s1774_closest_dessert_cost

// #Medium #Array #Dynamic_Programming #Backtracking
// #2023_06_18_Time_147_ms_(100.00%)_Space_33.5_MB_(100.00%)

class Solution {
    private var finalValue = Int.MAX_VALUE

    fun closestCost(baseCosts: IntArray, toppingCosts: IntArray, target: Int): Int {
        for (baseCost in baseCosts) {
            closestCost(baseCost, toppingCosts, target, 0)
        }
        return finalValue
    }

    private fun closestCost(curCost: Int, toppingCosts: IntArray, target: Int, index: Int) {
        if (index >= toppingCosts.size || curCost >= target) {
            if (Math.abs(target - curCost) < Math.abs(target - finalValue)) {
                finalValue = curCost
            } else if (Math.abs(target - curCost) == Math.abs(target - finalValue) &&
                target < finalValue
            ) {
                finalValue = curCost
            }
            return
        }
        closestCost(curCost, toppingCosts, target, index + 1)
        closestCost(curCost + toppingCosts[index], toppingCosts, target, index + 1)
        closestCost(curCost + toppingCosts[index] * 2, toppingCosts, target, index + 1)
    }
}
