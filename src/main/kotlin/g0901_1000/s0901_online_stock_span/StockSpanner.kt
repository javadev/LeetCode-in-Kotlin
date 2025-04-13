package g0901_1000.s0901_online_stock_span

// #Medium #Stack #Design #Monotonic_Stack #Data_Stream #LeetCode_75_Monotonic_Stack
// #2023_04_13_Time_641_ms_(75.00%)_Space_66.5_MB_(10.71%)

import java.util.Deque
import java.util.LinkedList

class StockSpanner {
    private val map: MutableMap<Int, Int>
    private val stocks: Deque<Int>
    private var index: Int

    init {
        stocks = LinkedList()
        index = -1
        map = HashMap()
        stocks.push(-1)
    }

    fun next(price: Int): Int {
        if (index != -1) {
            stocks.push(index)
        }
        map[++index] = price
        if (stocks.size == 1) {
            return index - stocks.peek()
        }
        while (stocks.size > 1 && map.getValue(stocks.peek()) <= price) {
            stocks.pop()
        }
        return index - stocks.peek()
    }
}
/*
 * Your StockSpanner object will be instantiated and called as such:
 * var obj = StockSpanner()
 * var param_1 = obj.next(price)
 */
