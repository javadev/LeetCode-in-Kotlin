package g3501_3600.s3508_implement_router

// #Medium #Array #Hash_Table #Binary_Search #Design #Ordered_Set #Queue
// #2025_04_09_Time_202_ms_(100.00%)_Space_172.82_MB_(95.24%)

import java.util.LinkedList
import java.util.Queue
import kotlin.math.max

class Router(private val size: Int) {
    private var cur = 0
    private val q: Queue<IntArray>
    private val map: HashMap<Int, ArrayList<IntArray>>

    init {
        q = LinkedList<IntArray>()
        map = HashMap<Int, ArrayList<IntArray>>()
    }

    fun addPacket(source: Int, destination: Int, timestamp: Int): Boolean {
        if (map.containsKey(destination)) {
            var found = false
            val list: ArrayList<IntArray> = map[destination]!!
            for (i in list.indices.reversed()) {
                if (list[i][1] < timestamp) {
                    break
                } else if (list[i][0] == source) {
                    found = true
                    break
                }
            }
            if (found) {
                return false
            }
        }
        if (map.containsKey(destination)) {
            val list: ArrayList<IntArray> = map[destination]!!
            list.add(intArrayOf(source, timestamp))
            cur++
            q.offer(intArrayOf(source, destination, timestamp))
        } else {
            val temp = ArrayList<IntArray>()
            temp.add(intArrayOf(source, timestamp))
            cur++
            map.put(destination, temp)
            q.offer(intArrayOf(source, destination, timestamp))
        }
        if (cur > size) {
            forwardPacket()
        }
        return true
    }

    fun forwardPacket(): IntArray {
        if (q.isEmpty()) {
            return intArrayOf()
        }
        val temp = q.poll()
        val list: ArrayList<IntArray> = map[temp[1]]!!
        list.removeAt(0)
        if (list.isEmpty()) {
            map.remove(temp[1])
        }
        cur--
        return temp
    }

    fun getCount(destination: Int, startTime: Int, endTime: Int): Int {
        return if (map.containsKey(destination)) {
            val list: ArrayList<IntArray> = map[destination]!!
            var lower = -1
            var higher = -1
            for (i in list.indices) {
                if (list[i][1] >= startTime) {
                    lower = i
                    break
                }
            }
            for (i in list.indices.reversed()) {
                if (list[i][1] <= endTime) {
                    higher = i
                    break
                }
            }
            if (lower == -1 || higher == -1) {
                0
            } else {
                max(0, higher - lower + 1)
            }
        } else {
            0
        }
    }
}

/*
 * Your Router object will be instantiated and called as such:
 * var obj = Router(memoryLimit)
 * var param_1 = obj.addPacket(source,destination,timestamp)
 * var param_2 = obj.forwardPacket()
 * var param_3 = obj.getCount(destination,startTime,endTime)
 */
