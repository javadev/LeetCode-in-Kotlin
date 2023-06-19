package g1801_1900.s1801_number_of_orders_in_the_backlog

// #Medium #Array #Heap_Priority_Queue #Simulation
// #2023_06_19_Time_668_ms_(100.00%)_Space_101.6_MB_(100.00%)

import java.util.PriorityQueue

class Solution {
    private class Order(var price: Int, var qty: Int)

    fun getNumberOfBacklogOrders(orders: Array<IntArray>): Int {
        val sell = PriorityQueue(
            compareBy { a: Order -> a.price }
        )
        val buy = PriorityQueue { a: Order, b: Order -> b.price - a.price }
        for (order in orders) {
            val price = order[0]
            var amount = order[1]
            val type = order[2]
            if (type == 0) {
                while (!sell.isEmpty() && sell.peek().price <= price && amount > 0) {
                    val ord = sell.peek()
                    val toRemove = amount.coerceAtMost(ord.qty)
                    ord.qty -= toRemove
                    amount -= toRemove
                    if (ord.qty == 0) {
                        sell.poll()
                    }
                }
                if (amount > 0) {
                    buy.add(Order(price, amount))
                }
            } else {
                while (!buy.isEmpty() && buy.peek().price >= price && amount > 0) {
                    val ord = buy.peek()
                    val toRemove = amount.coerceAtMost(ord.qty)
                    ord.qty -= toRemove
                    amount -= toRemove
                    if (ord.qty == 0) {
                        buy.poll()
                    }
                }
                if (amount > 0) {
                    sell.add(Order(price, amount))
                }
            }
        }
        var sellCount: Long = 0
        for (ord in sell) {
            sellCount += ord.qty.toLong()
        }
        var buyCount: Long = 0
        for (ord in buy) {
            buyCount += ord.qty.toLong()
        }
        val total = sellCount + buyCount
        return (total % 1000000007L).toInt()
    }
}
