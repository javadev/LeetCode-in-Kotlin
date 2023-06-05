package g1301_1400.s1335_minimum_difficulty_of_a_job_schedule

// #Hard #Array #Dynamic_Programming
class Solution {
    fun minDifficulty(jobDifficulty: IntArray, d: Int): Int {
        val totalJobs = jobDifficulty.size
        if (totalJobs < d) {
            return -1
        }
        val maxJobsOneDay = totalJobs - d + 1
        val map = IntArray(totalJobs)
        var maxDiff = Int.MIN_VALUE
        for (k in totalJobs - 1 downTo totalJobs - 1 - maxJobsOneDay + 1) {
            maxDiff = Math.max(maxDiff, jobDifficulty[k])
            map[k] = maxDiff
        }
        for (day in d - 1 downTo 1) {
            val maxEndIndex = totalJobs - 1 - (d - day)
            val maxStartIndex = maxEndIndex - maxJobsOneDay + 1
            for (startIndex in maxStartIndex..maxEndIndex) {
                map[startIndex] = Int.MAX_VALUE
                var maxDiffOfTheDay = Int.MIN_VALUE
                for (endIndex in startIndex..maxEndIndex) {
                    maxDiffOfTheDay = Math.max(maxDiffOfTheDay, jobDifficulty[endIndex])
                    val totalDiff = maxDiffOfTheDay + map[endIndex + 1]
                    map[startIndex] = Math.min(map[startIndex], totalDiff)
                }
            }
        }
        return map[0]
    }
}
