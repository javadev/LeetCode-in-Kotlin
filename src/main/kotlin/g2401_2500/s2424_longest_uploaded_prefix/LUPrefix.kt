package g2401_2500.s2424_longest_uploaded_prefix

// #Medium #Binary_Search #Design #Heap_Priority_Queue #Union_Find #Ordered_Set #Segment_Tree
// #Binary_Indexed_Tree #2023_07_04_Time_897_ms_(100.00%)_Space_145.2_MB_(50.00%)

class LUPrefix(n: Int) {
    private val res: BooleanArray
    private var count = 0

    init {
        res = BooleanArray(n + 1)
    }

    fun upload(video: Int) {
        res[video - 1] = true
    }

    fun longest(): Int {
        while (res[count]) {
            count++
        }
        return count
    }
}
