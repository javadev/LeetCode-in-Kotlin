package g1601_1700.s1656_design_an_ordered_stream

// #Easy #Array #Hash_Table #Design #Data_Stream
// #2023_06_15_Time_487_ms_(91.67%)_Space_59.8_MB_(83.33%)

class OrderedStream(n: Int) {
    private val str: Array<String?>
    private var ptr = 0

    init {
        str = arrayOfNulls(n)
    }

    fun insert(idKey: Int, value: String?): List<String?> {
        str[idKey - 1] = value
        val list: MutableList<String?> = ArrayList()
        while (ptr < str.size && str[ptr] != null) {
            list.add(str[ptr])
            ptr++
        }
        return list
    }
}
/*
 * Your OrderedStream object will be instantiated and called as such:
 * var obj = OrderedStream(n)
 * var param_1 = obj.insert(idKey,value)
 */
