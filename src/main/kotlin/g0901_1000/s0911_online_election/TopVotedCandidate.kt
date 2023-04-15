package g0901_1000.s0911_online_election

// #Medium #Array #Hash_Table #Binary_Search #Design #Binary_Search_II_Day_20
// #2023_04_15_Time_766_ms_(83.33%)_Space_66.7_MB_(100.00%)

class TopVotedCandidate(persons: IntArray, private val times: IntArray) {
    private val winnersAtTimeT: IntArray = IntArray(times.size)

    init {
        val counterArray = IntArray(persons.size)
        var maxVote = 0
        var maxVotedPerson = 0
        for (i in persons.indices) {
            val person = persons[i]
            val voteCount = counterArray[person]
            if (voteCount + 1 >= maxVote) {
                maxVote = voteCount + 1
                maxVotedPerson = person
            }
            winnersAtTimeT[i] = maxVotedPerson
            counterArray[persons[i]] = voteCount + 1
        }
    }

    fun q(t: Int): Int {
        var lo = 0
        var hi = times.size - 1
        if (t >= times[hi]) {
            lo = hi
        } else {
            while (lo < hi - 1) {
                val mid = lo + (hi - lo) / 2
                if (times[mid] == t) {
                    lo = mid
                    break
                } else if (times[mid] > t) {
                    hi = mid
                } else {
                    lo = mid
                }
            }
        }
        return winnersAtTimeT[lo]
    }
}


/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * var obj = TopVotedCandidate(persons, times)
 * var param_1 = obj.q(t)
 */