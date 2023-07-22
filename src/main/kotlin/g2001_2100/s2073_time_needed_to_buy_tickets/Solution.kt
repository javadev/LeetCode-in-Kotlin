package g2001_2100.s2073_time_needed_to_buy_tickets

// #Easy #Array #Simulation #Queue #2023_06_26_Time_145_ms_(100.00%)_Space_33.9_MB_(100.00%)

class Solution {
    fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
        var res = 0
        for (i in tickets.indices) {
            res += if (i <= k) {
                tickets[k].coerceAtMost(tickets[i])
            } else {
                (tickets[k] - 1).coerceAtMost(tickets[i])
            }
        }
        return res
    }
}
