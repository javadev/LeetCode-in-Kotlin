package g2501_2600.s2526_find_consecutive_integers_from_a_data_stream

// #Medium #Hash_Table #Design #Counting #Queue #Data_Stream
// #2023_07_04_Time_867_ms_(100.00%)_Space_130.9_MB_(100.00%)

class DataStream(private val value: Int, private val k: Int) {
    private var count = 0
    fun consec(num: Int): Boolean {
        count = if (num == value) count + 1 else 0
        return count >= k
    }
}
/*
 * Your DataStream object will be instantiated and called as such:
 * var obj = DataStream(value, k)
 * var param_1 = obj.consec(num)
 */
