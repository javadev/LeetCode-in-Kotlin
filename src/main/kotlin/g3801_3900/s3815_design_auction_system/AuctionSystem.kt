package g3801_3900.s3815_design_auction_system

import java.util.PriorityQueue

// #Medium #Hash_Table #Design #Heap_Priority_Queue #Ordered_Set #Staff #Weekly_Contest_485
// #2026_06_09_Time_96_ms_(93.30%)_Space_203.51_MB_(92.27%)

class AuctionSystem {
    private val bidMap: MutableMap<Long?, IntArray?>
    private val itemMap: MutableMap<Int?, PriorityQueue<IntArray>?>

    init {
        bidMap = HashMap<Long?, IntArray?>()
        itemMap = HashMap<Int?, PriorityQueue<IntArray>?>()
    }

    fun addBid(userId: Int, itemId: Int, bidAmount: Int) {
        val bid = intArrayOf(userId, itemId, bidAmount)
        bidMap.put(userId.toLong() shl 32 or itemId.toLong(), bid)
        itemMap.computeIfAbsent(
            itemId,
        ) { item: kotlin.Int? ->
            java.util.PriorityQueue<kotlin.IntArray>(
                java.util.Comparator { a: kotlin.IntArray, b: kotlin.IntArray ->
                    if (a[2] ==
                        b[2]
                    ) {
                        b[0] - a[0]
                    } else {
                        b[2] - a[2]
                    }
                },
            )
        }!!
            .add(bid)
    }

    fun updateBid(userId: Int, itemId: Int, newAmount: Int) {
        addBid(userId, itemId, newAmount)
    }

    fun removeBid(userId: Int, itemId: Int) {
        bidMap.remove(userId.toLong() shl 32 or itemId.toLong())
    }

    fun getHighestBidder(itemId: Int): Int {
        val pq = itemMap.get(itemId)
        if (pq == null || pq.isEmpty()) {
            return -1
        }
        while (!pq.isEmpty()) {
            val top = pq.peek()
            val cur = bidMap.get(top[0].toLong() shl 32 or itemId.toLong())
            if (top.contentEquals(cur)) {
                return top[0]
            }
            pq.poll()
        }
        return -1
    }
}

/*
 * Your AuctionSystem object will be instantiated and called as such:
 * AuctionSystem obj = new AuctionSystem();
 * obj.addBid(userId,itemId,bidAmount);
 * obj.updateBid(userId,itemId,newAmount);
 * obj.removeBid(userId,itemId);
 * int param_4 = obj.getHighestBidder(itemId);
 */
