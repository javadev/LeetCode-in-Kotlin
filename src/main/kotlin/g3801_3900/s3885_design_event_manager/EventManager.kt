package g3801_3900.s3885_design_event_manager

import java.util.*

// #Medium #Array #Hash_Table #Design #Heap_Priority_Queue #Ordered_Set #Senior #Weekly_Contest_495
// #2026_08_13_Time_185_ms_(98.91%)_Space_215.60_MB_(98.91%)

class EventManager(events: Array<IntArray>) {
    private val map: HashMap<Int?, Int?>
    private val pq: PriorityQueue<Pair>

    init {
        map = HashMap<Int?, Int?>()
        pq =
            PriorityQueue<Pair>(
                Comparator { a: Pair, b: Pair ->
                    if (a.priority != b.priority) {
                        return@Comparator Integer.compare(b.priority, a.priority)
                    }
                    Integer.compare(a.id, b.id)
                },
            )
        for (event in events) {
            pq.add(Pair(event[0], event[1]))
        }
    }

    fun updatePriority(eventId: Int, newPriority: Int) {
        map.put(eventId, newPriority)
        pq.add(Pair(eventId, newPriority))
    }

    fun pollHighest(): Int {
        if (pq.isEmpty()) {
            return -1
        }
        while (true) {
            if (pq.isEmpty()) {
                return -1
            }
            val p = pq.poll()
            val id = p.id
            val pri = p.priority
            if (map.containsKey(id)) {
                if (map.get(id) == pri) {
                    map.put(id, Int.MAX_VALUE)
                    return id
                }
            } else {
                return id
            }
        }
    }

    class Pair internal constructor(var id: Int, var priority: Int)
} /*
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */
