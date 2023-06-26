package g2201_2300.s2240_number_of_ways_to_buy_pens_and_pencils

// #Medium #Math #Enumeration
class Solution {
    fun waysToBuyPensPencils(totalMoney: Int, costPen: Int, costPencil: Int): Long {
        var ways: Long = 0
        var cntPen = 0
        while (cntPen * costPen <= totalMoney) {
            val remMoney = totalMoney - cntPen * costPen
            ways += (remMoney / costPencil + 1).toLong()
            cntPen++
        }
        return ways
    }
}
