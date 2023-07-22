package g1501_1600.s1535_find_the_winner_of_an_array_game

// #Medium #Array #Simulation #2023_06_12_Time_460_ms_(100.00%)_Space_55_MB_(100.00%)

class Solution {
    fun getWinner(arr: IntArray, k: Int): Int {
        var winner = arr[0]
        var winTimes = 0
        for (i in 1 until arr.size) {
            if (arr[i] > winner) {
                winner = arr[i]
                winTimes = 1
            } else {
                winTimes++
            }
            if (winTimes >= k) {
                return winner
            }
        }
        return winner
    }
}
