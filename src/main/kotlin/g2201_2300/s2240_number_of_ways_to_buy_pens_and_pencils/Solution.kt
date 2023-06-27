package g2201_2300.s2240_number_of_ways_to_buy_pens_and_pencils

// #Medium #Math #Enumeration #2023_06_27_Time_143_ms_(100.00%)_Space_32.6_MB_(100.00%)

class Solution {
    fun waysToBuyPensPencils(total: Int, cost1: Int, cost2: Int): Long {
        var ways: Long = 0
        var cntPen = 0
        while (cntPen * cost1 <= total) {
            val remMoney = total - cntPen * cost1
            ways += (remMoney / cost2 + 1).toLong()
            cntPen++
        }
        return ways
    }
}
