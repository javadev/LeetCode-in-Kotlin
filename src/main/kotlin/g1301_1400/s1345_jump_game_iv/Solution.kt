package g1301_1400.s1345_jump_game_iv

// #Hard #Array #Hash_Table #Breadth_First_Search
// #2023_06_06_Time_599_ms_(100.00%)_Space_53.1_MB_(100.00%)

import java.util.Deque
import java.util.LinkedList

class Solution {
    fun minJumps(arr: IntArray): Int {
        if (arr.size == 1) {
            return 0
        }
        val len = arr.size
        val myHash = HashMap<Int, MutableList<Int>>()
        var i = 0
        while (i < arr.size) {
            val curList = myHash.getOrDefault(arr[i], ArrayList())
            curList.add(i)
            val tempNum = arr[i]
            val tempIndex = i
            while (i < arr.size && arr[i] == tempNum) {
                i++
            }
            if (i != tempIndex + 1) {
                curList.add(i - 1)
            }
            myHash[tempNum] = curList
        }
        val myQueue: Deque<Int> = LinkedList()
        var step = 0
        myQueue.offerLast(0)
        val visited = BooleanArray(arr.size)
        visited[0] = true
        while (myQueue.isNotEmpty()) {
            val curCount = myQueue.size
            var j = 0
            while (j < curCount) {
                val curIndex = myQueue.pollFirst()
                if (curIndex == len - 1) {
                    return step
                }
                if (curIndex + 1 < len && !visited[curIndex + 1]) {
                    myQueue.offerLast(curIndex + 1)
                    visited[curIndex + 1] = true
                }
                if (curIndex - 1 >= 0 && !visited[curIndex - 1]) {
                    myQueue.offerLast(curIndex - 1)
                    visited[curIndex - 1] = true
                }
                val tempList: List<Int> = myHash.getOrDefault(arr[curIndex], ArrayList())
                for (integer in tempList) {
                    if (!visited[integer]) {
                        myQueue.offerLast(integer)
                        visited[integer] = true
                    }
                }
                myHash.remove(arr[curIndex])
                j++
            }
            step++
        }
        return step
    }
}
