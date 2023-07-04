package g2401_2500.s2483_minimum_penalty_for_a_shop

// #Medium #String #Prefix_Sum
class Solution {
    fun bestClosingTime(customers: String): Int {
        val yes = IntArray(customers.length + 1)
        val no = IntArray(customers.length + 1)
        var count = 0
        for (i in customers.length - 1 downTo 0) {
            if (customers[i] == 'Y') {
                count++
            }
            yes[i] = count
        }
        count = 0
        for (i in 0 until customers.length) {
            if (customers[i] == 'N') {
                count++
            }
            no[i + 1] = count
        }
        var min = Int.MAX_VALUE
        var res = 0
        for (i in yes.indices) {
            val sum = yes[i] + no[i]
            if (min > sum) {
                min = sum
                res = i
            }
        }
        return res
    }
}
