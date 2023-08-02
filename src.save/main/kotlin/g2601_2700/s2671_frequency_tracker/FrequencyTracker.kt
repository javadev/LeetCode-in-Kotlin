package g2601_2700.s2671_frequency_tracker

// #Medium #Hash_Table #Design #2023_07_26_Time_1109_ms_(80.00%)_Space_134.7_MB_(60.00%)

class FrequencyTracker() {
    private val count = IntArray(100001)
    private val freq = IntArray(100001)

    fun add(number: Int) {
        val curFreq = ++count[number]
        freq[curFreq - 1]--
        freq[curFreq]++
    }

    fun deleteOne(number: Int) {
        if (count[number] > 0) {
            val curFreq = --count[number]
            freq[curFreq + 1]--
            freq[curFreq]++
        }
    }

    fun hasFrequency(frequency: Int) = freq[frequency] > 0
}

/*
 * Your FrequencyTracker object will be instantiated and called as such:
 * var obj = FrequencyTracker()
 * obj.add(number)
 * obj.deleteOne(number)
 * var param_3 = obj.hasFrequency(frequency)
 */
