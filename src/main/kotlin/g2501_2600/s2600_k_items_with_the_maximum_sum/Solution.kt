package g2501_2600.s2600_k_items_with_the_maximum_sum

// #Easy #Math #Greedy #2023_07_13_Time_145_ms_(100.00%)_Space_33.5_MB_(75.00%)

@Suppress("UNUSED_PARAMETER")
class Solution {
    fun kItemsWithMaximumSum(numOnes: Int, numZeros: Int, numNegOnes: Int, k: Int): Int {
        if (k <= numOnes) {
            return k
        }

        if (k <= numOnes + numZeros) {
            return numOnes
        }

        val remainingSum = k - (numOnes + numZeros)

        return numOnes - remainingSum
    }
}
