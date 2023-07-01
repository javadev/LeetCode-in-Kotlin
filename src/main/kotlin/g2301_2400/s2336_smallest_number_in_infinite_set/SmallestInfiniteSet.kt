package g2301_2400.s2336_smallest_number_in_infinite_set

// #Medium #Hash_Table #Design #Heap_Priority_Queue
// #2023_07_01_Time_308_ms_(95.45%)_Space_45.1_MB_(79.55%)

class SmallestInfiniteSet {
    private val set = IntArray(1001)
    private var ptr = 1

    init {
        for (i in 1..1000) {
            set[i] = 1
        }
    }

    fun popSmallest(): Int {
        var `val` = -1
        if (ptr in 1..1000) {
            set[ptr] = 0
            `val` = ptr++
            while (ptr <= 1000 && set[ptr] == 0) {
                ptr++
            }
        }
        return `val`
    }

    fun addBack(num: Int) {
        if (set[num] == 0) {
            set[num] = 1
            if (num < ptr) {
                ptr = num
            }
        }
    }
}
