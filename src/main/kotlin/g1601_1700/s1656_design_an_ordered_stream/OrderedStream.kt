package g1601_1700.s1656_design_an_ordered_stream

// #Easy #Array #Hash_Table #Design #Data_Stream
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
