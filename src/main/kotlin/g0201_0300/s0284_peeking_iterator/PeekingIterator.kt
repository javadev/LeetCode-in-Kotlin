package g0201_0300.s0284_peeking_iterator

// #Medium #Array #Design #Iterator #2022_11_04_Time_286_ms_(62.50%)_Space_37.2_MB_(37.50%)

class PeekingIterator(private val iterator: Iterator<Int>) : Iterator<Int> {
    var peekedValue: Int? = null

    fun peek(): Int =
        if (peekedValue == null) {
            peekedValue = iterator.next()
            peekedValue!!
        } else {
            peekedValue!!
        }

    override fun next(): Int =
        if (peekedValue == null) {
            iterator.next()
        } else {
            val ret = peekedValue!!
            peekedValue = null
            ret
        }

    override fun hasNext(): Boolean = peekedValue != null || iterator.hasNext()
}

/**
 * Your PeekingIterator object will be instantiated and called as such:
 * var obj = PeekingIterator(arr)
 * var param_1 = obj.next()
 * var param_2 = obj.peek()
 * var param_3 = obj.hasNext()
 */
