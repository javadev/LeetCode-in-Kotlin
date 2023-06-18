package g1701_1800.s1797_design_authentication_manager

// #Medium #Hash_Table #Design #Programming_Skills_II_Day_19
// #2023_06_18_Time_334_ms_(100.00%)_Space_46.2_MB_(100.00%)

import java.util.ArrayDeque
import java.util.Deque

class AuthenticationManager(var timeToLive: Int) {
    private var expireMap: MutableMap<String, Int> = HashMap()
    private var deque: Deque<Item> = ArrayDeque()

    fun generate(tokenId: String, currentTime: Int) {
        expireMap[tokenId] = currentTime + timeToLive
        deque.offerLast(Item(tokenId, currentTime + timeToLive))
    }

    fun renew(tokenId: String, currentTime: Int) {
        update(currentTime)
        if (expireMap.containsKey(tokenId)) {
            deque.offerLast(Item(tokenId, currentTime + timeToLive))
            expireMap[tokenId] = currentTime + timeToLive
        }
    }

    fun countUnexpiredTokens(currentTime: Int): Int {
        update(currentTime)
        return expireMap.size
    }

    private fun update(curTime: Int) {
        while (deque.isNotEmpty() && deque.peekFirst().time <= curTime) {
            val id = deque.peekFirst().id
            val time = deque.peekFirst().time
            if (expireMap.containsKey(id) && expireMap[id] == time) {
                expireMap.remove(deque.pollFirst().id)
            } else {
                deque.pollFirst()
            }
        }
    }

    private class Item(var id: String, var time: Int)
}
/*
 * Your AuthenticationManager object will be instantiated and called as such:
 * var obj = AuthenticationManager(timeToLive)
 * obj.generate(tokenId,currentTime)
 * obj.renew(tokenId,currentTime)
 * var param_3 = obj.countUnexpiredTokens(currentTime)
 */
