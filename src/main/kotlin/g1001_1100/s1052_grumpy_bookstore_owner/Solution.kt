package g1001_1100.s1052_grumpy_bookstore_owner

// #Medium #Array #Sliding_Window #2023_05_29_Time_268_ms_(80.00%)_Space_64.6_MB_(60.00%)

class Solution {
    fun maxSatisfied(customers: IntArray, grumpy: IntArray, minutes: Int): Int {
        // storing numbers of customers who faced grumpy owner till ith minute.
        val grumpySum = IntArray(grumpy.size)
        var ans = 0
        if (grumpy[0] == 1) {
            grumpySum[0] = customers[0]
        } else {
            ans += customers[0]
        }
        for (i in 1 until grumpy.size) {
            if (grumpy[i] == 1) {
                grumpySum[i] = grumpySum[i - 1] + customers[i]
            } else {
                grumpySum[i] = grumpySum[i - 1]
                ans += customers[i]
            }
        }
        // calculating max number of customers who faced grumpy owner in a window of size 'minutes'.
        var max = 0
        for (i in 0..customers.size - minutes) {
            max = if (i == 0) {
                max.coerceAtLeast(grumpySum[i + minutes - 1])
            } else {
                max.coerceAtLeast(grumpySum[i + minutes - 1] - grumpySum[i - 1])
            }
        }
        // making the owner non-grumpy in that max window and adding the number of customers who do
        // not face the grumpy customers.
        ans += max
        return ans
    }
}
