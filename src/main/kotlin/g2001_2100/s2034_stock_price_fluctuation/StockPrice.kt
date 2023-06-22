package g2001_2100.s2034_stock_price_fluctuation

import java.util.PriorityQueue

// #Medium #Hash_Table #Design #Heap_Priority_Queue #Ordered_Set #Data_Stream
class StockPrice {
    private class Record(var time: Int, var price: Int)

    private val map: MutableMap<Int, Int>
    private val maxHeap: PriorityQueue<Record>
    private val minHeap: PriorityQueue<Record>
    private var latestTimestamp = 0

    init {
        map = HashMap()
        maxHeap = PriorityQueue { r1: Record, r2: Record -> Integer.compare(r2.price, r1.price) }
        minHeap = PriorityQueue { r1: Record, r2: Record -> Integer.compare(r1.price, r2.price) }
    }

    fun update(timestamp: Int, price: Int) {
        latestTimestamp = Math.max(timestamp, latestTimestamp)
        maxHeap.offer(Record(timestamp, price))
        minHeap.offer(Record(timestamp, price))
        map[timestamp] = price
    }

    fun current(): Int {
        return map[latestTimestamp]!!
    }

    fun maximum(): Int {
        while (true) {
            val rec = maxHeap.peek()
            if (map[rec.time] == rec.price) {
                return rec.price
            }
            maxHeap.poll()
        }
    }

    fun minimum(): Int {
        while (true) {
            val rec = minHeap.peek()
            if (map[rec.time] == rec.price) {
                return rec.price
            }
            minHeap.poll()
        }
    }
}
