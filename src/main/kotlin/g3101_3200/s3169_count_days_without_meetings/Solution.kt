package g3101_3200.s3169_count_days_without_meetings

// #Medium #Array #Sorting #2024_06_06_Time_11_ms_(99.96%)_Space_113.7_MB_(5.10%)

class Solution {
    fun countDays(days: Int, meetings: Array<IntArray>): Int {
        var availableDays: MutableList<IntArray> = ArrayList()
        availableDays.add(intArrayOf(1, days))
        // Iterate through each meeting
        for (meeting in meetings) {
            val start = meeting[0]
            val end = meeting[1]
            val newAvailableDays: MutableList<IntArray> = ArrayList()
            // Iterate through available days and split the intervals
            for (interval in availableDays) {
                if (start > interval[1] || end < interval[0]) {
                    // No overlap, keep the interval
                    newAvailableDays.add(interval)
                } else {
                    // Overlap, split the interval
                    if (interval[0] < start) {
                        newAvailableDays.add(intArrayOf(interval[0], start - 1))
                    }
                    if (interval[1] > end) {
                        newAvailableDays.add(intArrayOf(end + 1, interval[1]))
                    }
                }
            }
            availableDays = newAvailableDays
        }
        // Count the remaining available days
        var availableDaysCount = 0
        for (interval in availableDays) {
            availableDaysCount += interval[1] - interval[0] + 1
        }
        return availableDaysCount
    }
}
