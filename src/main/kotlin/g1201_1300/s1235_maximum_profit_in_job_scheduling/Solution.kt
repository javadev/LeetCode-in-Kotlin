package g1201_1300.s1235_maximum_profit_in_job_scheduling

import java.util.Arrays

// #Hard #Array #Dynamic_Programming #Sorting #Binary_Search
class Solution {
    fun jobScheduling(startTime: IntArray, endTime: IntArray, profit: IntArray): Int {
        val n = startTime.size
        val time = Array(n) { IntArray(3) }
        for (i in 0 until n) {
            time[i][0] = startTime[i]
            time[i][1] = endTime[i]
            time[i][2] = profit[i]
        }
        Arrays.sort(time, Comparator.comparingInt { a: IntArray -> a[1] })
        val maxP = Array(n) { IntArray(2) }
        var lastPos = -1
        var currProfit: Int
        for (i in 0 until n) {
            currProfit = time[i][2]
            for (j in lastPos downTo 0) {
                if (maxP[j][1] <= time[i][0]) {
                    currProfit += maxP[j][0]
                    break
                }
            }
            if (lastPos == -1 || currProfit > maxP[lastPos][0]) {
                lastPos++
                maxP[lastPos][0] = currProfit
                maxP[lastPos][1] = time[i][1]
            }
        }
        return maxP[lastPos][0]
    }
}
