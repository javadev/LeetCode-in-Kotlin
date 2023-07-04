package g2501_2600.s2526_find_consecutive_integers_from_a_data_stream

// #Medium #Hash_Table #Design #Counting #Queue #Data_Stream
class DataStream(private val value: Int, private val k: Int) {
    private var count = 0
    fun consec(num: Int): Boolean {
        count = if (num == value) count + 1 else 0
        return count >= k
    }
}
