package g0201_0300.s0284_peeking_iterator

// #Medium #Array #Design #Iterator #2022_07_06_Time_6_ms_(72.91%)_Space_43.3_MB_(14.85%)
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
@Suppress("kotlin:S1186")
class PeekingIterator(private val it: Iterator<Int>) : MutableIterator<Int?> {
    private var current: Int?

    init {
        // initialize any member here.
        current = it.next()
    }

    // Returns the next element in the iteration without advancing the iterator.
    fun peek(): Int? {
        if (current == null) {
            current = it.next()
        }
        return current
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    override fun next(): Int? {
        val temp = current
        current = if (it.hasNext()) it.next() else null
        return temp
    }

    override fun remove() {
    }

    override fun hasNext(): Boolean {
        return current != null
    }
}
