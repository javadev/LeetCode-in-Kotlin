package g0501_0600.s0502_ipo

// #Hard #Array #Sorting #Greedy #Heap_Priority_Queue
// #2023_01_06_Time_799_ms_(54.55%)_Space_88.5_MB_(9.09%)

import java.util.PriorityQueue

class Solution {
    inner class Data(var profit: Int, var capital: Int)

    // max heap for profit
    var profitMaxHeap = PriorityQueue<Data> { d1, d2 ->
        -1 * Integer.compare(
            d1.profit,
            d2.profit,
        )
    }

    // min heap for capital
    var capitalMinHeap = PriorityQueue<Data> { d1, d2 -> Integer.compare(d1.capital, d2.capital) }
    fun findMaximizedCapital(k: Int, w: Int, profits: IntArray, capital: IntArray): Int {
        init(profits, capital)
        var maxCapital = w
        var currentCapital = w
        for (i in 0 until k) {
            // first fetch all tasks you can do with current capital and add those in profit max heap
            while (capitalMinHeap.isNotEmpty() && currentCapital >= capitalMinHeap.peek().capital) {
                profitMaxHeap.add(capitalMinHeap.poll())
            }

            // if profit max heap is empty we can do nothing so break
            if (profitMaxHeap.isEmpty()) break

            // add profit to current capital and update maxCapital
            currentCapital += profitMaxHeap.poll().profit
            maxCapital = Math.max(maxCapital, currentCapital)
        }
        return maxCapital
    }

    private fun init(profits: IntArray, capital: IntArray) {
        for (i in profits.indices) {
            capitalMinHeap.add(Data(profits[i], capital[i]))
        }
    }
}
