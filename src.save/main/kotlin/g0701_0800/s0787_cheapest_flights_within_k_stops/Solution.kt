package g0701_0800.s0787_cheapest_flights_within_k_stops

// #Medium #Dynamic_Programming #Depth_First_Search #Breadth_First_Search #Heap_Priority_Queue
// #Graph #Shortest_Path #2023_03_13_Time_185_ms_(99.20%)_Space_36.6_MB_(89.64%)

class Solution {
    fun findCheapestPrice(n: Int, flights: Array<IntArray>, src: Int, dst: Int, k: Int): Int {
        // k + 2 becase there are total of k(intermediate stops) + 1(src) + 1(dst)
        // dp[i][j] = cost to reach j using atmost i edges from src
        val dp = Array(k + 2) { IntArray(n) }
        for (row in dp) {
            row.fill(Int.MAX_VALUE)
        }
        // cost to reach src is always 0
        for (i in 0..k + 1) {
            dp[i][src] = 0
        }
        // k+1 because k stops + dst
        for (i in 1..k + 1) {
            for (flight in flights) {
                val srcAirport = flight[0]
                val destAirport = flight[1]
                val cost = flight[2]
                // if cost to reach srcAirport in i - 1 steps is already found out then
                // the cost to reach destAirport will be min(cost to reach destAirport computed
                // already from some other srcAirport OR cost to reach srcAirport in i - 1 steps +
                // the cost to reach destAirport from srcAirport)
                if (dp[i - 1][srcAirport] != Int.MAX_VALUE) {
                    dp[i][destAirport] = dp[i][destAirport].coerceAtMost(dp[i - 1][srcAirport] + cost)
                }
            }
        }
        // checking for dp[k + 1][dst] because there are 'k + 2' airports in a path and distance
        // covered between 'k + 2' airports is 'k + 1'
        return if (dp[k + 1][dst] == Int.MAX_VALUE) -1 else dp[k + 1][dst]
    }
}
