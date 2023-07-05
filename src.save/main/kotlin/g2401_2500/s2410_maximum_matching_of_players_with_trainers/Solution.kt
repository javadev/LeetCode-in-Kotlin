package g2401_2500.s2410_maximum_matching_of_players_with_trainers

// #Medium #Array #Sorting #Greedy #Two_Pointers
// #2023_07_03_Time_565_ms_(83.33%)_Space_60_MB_(66.67%)

class Solution {
    fun matchPlayersAndTrainers(players: IntArray, trainers: IntArray): Int {
        players.sort()
        trainers.sort()
        var j = 0
        var count = 0
        var i = 0
        while (i < players.size) {
            while (trainers[j] < players[i]) {
                j++
                if (j >= trainers.size) {
                    break
                }
            }
            if (j >= trainers.size) {
                break
            }
            if (trainers[j] >= players[i]) {
                count++
            }
            i++
            j++
            if (j >= trainers.size || i >= players.size) {
                break
            }
        }
        return count
    }
}
