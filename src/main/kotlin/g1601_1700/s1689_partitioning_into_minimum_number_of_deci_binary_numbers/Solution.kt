package g1601_1700.s1689_partitioning_into_minimum_number_of_deci_binary_numbers

// #Medium #String #Greedy
class Solution {
    fun minPartitions(n: String): Int {
        val tempArray = n.toCharArray()
        var result = 0
        for (i in 0 until n.length) {
            result = Math.max(result, tempArray[i].code - 48)
        }
        return result
    }
}
