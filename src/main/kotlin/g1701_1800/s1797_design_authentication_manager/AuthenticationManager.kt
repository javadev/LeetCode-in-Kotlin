package g1701_1800.s1797_design_authentication_manager

import java.util.ArrayDeque
import java.util.Deque

// #Medium #Hash_Table #Design #Programming_Skills_II_Day_19
class AuthenticationManager(var inc: Int) {
    private var expireMap: MutableMap<String, Int> = HashMap()
    private var deque: Deque<Item> = ArrayDeque()

    fun generate(tokenId: String, currentTime: Int) {
        expireMap[tokenId] = currentTime + inc
        deque.offerLast(Item(tokenId, currentTime + inc))
    }

    fun renew(tokenId: String, currentTime: Int) {
        update(currentTime)
        if (expireMap.containsKey(tokenId)) {
            deque.offerLast(Item(tokenId, currentTime + inc))
            expireMap[tokenId] = currentTime + inc
        }
    }

    fun countUnexpiredTokens(currentTime: Int): Int {
        update(currentTime)
        return expireMap.size
    }

    private fun update(curTime: Int) {
        while (!deque.isEmpty() && deque.peekFirst().time <= curTime) {
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
