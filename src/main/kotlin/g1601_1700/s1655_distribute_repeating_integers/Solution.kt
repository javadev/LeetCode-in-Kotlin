package g1601_1700.s1655_distribute_repeating_integers

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
class Solution {
    fun canDistribute(nums: IntArray, quantity: IntArray): Boolean {
        val counter = count(nums)
        quantity.sort()
        return dfs(counter, quantity, quantity.size - 1)
    }

    private fun dfs(counter: IntArray, quantity: IntArray, quantityId: Int): Boolean {
        if (quantityId < 0) {
            return true
        }
        for (i in counter.indices) {
            if (i > 0 && counter[i] == counter[i - 1]) {
                continue
            }
            if (counter[i] >= quantity[quantityId]) {
                counter[i] -= quantity[quantityId]
                if (dfs(counter, quantity, quantityId - 1)) {
                    return true
                }
                counter[i] += quantity[quantityId]
            }
        }
        return false
    }

    private fun count(nums: IntArray): IntArray {
        val counter = IntArray(1001)
        for (n in nums) {
            counter[n]++
        }
        counter.sort()
        return counter.copyOfRange(counter.size - 50, counter.size)
    }
}
