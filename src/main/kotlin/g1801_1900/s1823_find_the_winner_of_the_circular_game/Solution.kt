package g1801_1900.s1823_find_the_winner_of_the_circular_game

// #Medium #Array #Math #Simulation #Recursion #Queue #Data_Structure_II_Day_14_Stack_Queue
// #2023_06_20_Time_119_ms_(87.50%)_Space_32.6_MB_(100.00%)

class Solution {
    fun findTheWinner(n: Int, k: Int): Int {
        val list: MutableList<Int> = ArrayList(n)
        for (i in 0 until n) {
            list.add(i + 1)
        }
        var startIndex = 0
        while (list.size != 1) {
            val removeIndex = (startIndex + k - 1) % list.size
            list.removeAt(removeIndex)
            startIndex = removeIndex
        }
        return list[0]
    }
}
