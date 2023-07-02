package g2101_2200.s2102_sequentially_ordinal_rank_tracker

// #Hard #Design #Heap_Priority_Queue #Ordered_Set #Data_Stream
// #2023_06_25_Time_1208_ms_(100.00%)_Space_88.2_MB_(100.00%)

import java.util.TreeSet

class SORTracker {
    class Location(var name: String, var score: Int)

    private var tSet1: TreeSet<Location?>
    private var tSet2: TreeSet<Location?>

    init {
        tSet1 = TreeSet(
            Comparator { a: Location?, b: Location? ->
                return@Comparator if (a!!.score != b!!.score) {
                    b.score - a.score
                } else {
                    a.name.compareTo(b.name)
                }
            }
        )
        tSet2 = TreeSet(
            Comparator { a: Location?, b: Location? ->
                return@Comparator if (a!!.score != b!!.score) {
                    b.score - a.score
                } else {
                    a.name.compareTo(b.name)
                }
            }
        )
    }

    fun add(name: String, score: Int) {
        tSet1.add(Location(name, score))
        tSet2.add(tSet1.pollLast())
    }

    fun get(): String {
        val res = tSet2.pollFirst()
        tSet1.add(res)
        assert(res != null)
        return res!!.name
    }
}
/*
 * Your SORTracker object will be instantiated and called as such:
 * var obj = SORTracker()
 * obj.add(name,score)
 * var param_2 = obj.get()
 */
