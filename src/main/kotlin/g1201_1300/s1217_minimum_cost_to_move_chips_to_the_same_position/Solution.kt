package g1201_1300.s1217_minimum_cost_to_move_chips_to_the_same_position

// #Easy #Array #Math #Greedy
class Solution {
    fun minCostToMoveChips(position: IntArray): Int {
        var chipsAtOddPosition = 0
        var chipsAtEvenPosition = 0
        for (j in position) {
            if (j % 2 == 0) {
                chipsAtEvenPosition++
            } else {
                chipsAtOddPosition++
            }
        }
        return Math.min(chipsAtEvenPosition, chipsAtOddPosition)
    }
}
