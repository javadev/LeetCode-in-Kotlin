package g0501_0600.s0506_relative_ranks

// #Easy #Array #Sorting #Heap_Priority_Queue
// #2023_01_06_Time_257_ms_(77.14%)_Space_38.9_MB_(85.71%)

import java.util.PriorityQueue

class Solution {
    // solution 1
    fun findRelativeRanks(score: IntArray): Array<String> {
        fun mapPlace(place: Int): String =
            when {
                place > 2 -> "${place + 1}"
                place == 0 -> "Gold Medal"
                place == 1 -> "Silver Medal"
                place == 2 -> "Bronze Medal"
                else -> throw NoWhenBranchMatchedException()
            }

        val sortedScores = score.clone().apply { sortDescending() }
        val scoreToPlaceMap = hashMapOf<Int, String>().apply {
            for (index in sortedScores.indices) {
                this[sortedScores[index]] = mapPlace(index)
            }
        }
        return score.map { scoreToPlaceMap[it] ?: "" }.toTypedArray()
    }

    // solution 2
    fun findRelativeRanks2(score: IntArray): Array<String> {
        fun mapPlace(score: Int, sortedScores: IntArray): String {
            val place = sortedScores.lastIndex - sortedScores.binarySearch(score)
            return when {
                place > 2 -> "${place + 1}"
                place == 0 -> "Gold Medal"
                place == 1 -> "Silver Medal"
                place == 2 -> "Bronze Medal"
                else -> throw NoWhenBranchMatchedException()
            }
        }

        val sortedScores = score.clone().apply { sort() }
        return score.map { mapPlace(it, sortedScores) }.toTypedArray()
    }

    // solution 3
    fun findRelativeRanks3(score: IntArray): Array<String> {
        fun mapPlace(place: Int): String =
            when {
                place > 2 -> "${place + 1}"
                place == 0 -> "Gold Medal"
                place == 1 -> "Silver Medal"
                place == 2 -> "Bronze Medal"
                else -> throw NoWhenBranchMatchedException()
            }

        tailrec fun process(
            scoreToIndexPq: PriorityQueue<Pair<Int, Int>>,
            place: Int = 0,
            ans: Array<String> = Array(score.size) { "" }
        ): Array<String> = when {
            scoreToIndexPq.isEmpty() -> ans
            else -> {
                val (_, index) = scoreToIndexPq.poll()
                ans[index] = mapPlace(place)
                process(scoreToIndexPq, place + 1, ans)
            }
        }

        val scoreToIndexPq = PriorityQueue<Pair<Int, Int>>(compareByDescending { it.first }).apply {
            for ((index, value) in score.withIndex()) {
                offer(value to index)
            }
        }

        return process(scoreToIndexPq)
    }
}
