package g2101_2200.s2102_sequentially_ordinal_rank_tracker

import java.util.TreeSet

// #Hard #Design #Heap_Priority_Queue #Ordered_Set #Data_Stream
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
