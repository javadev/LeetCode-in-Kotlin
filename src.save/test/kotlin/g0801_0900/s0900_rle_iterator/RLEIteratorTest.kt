package g0801_0900.s0900_rle_iterator

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class RLEIteratorTest {
    @Test
    fun rleIteratorTest() {
        val rleIterator = RLEIterator(intArrayOf(3, 8, 0, 9, 2, 5))
        assertThat(rleIterator.next(2), equalTo(8))
        assertThat(rleIterator.next(1), equalTo(8))
        assertThat(rleIterator.next(1), equalTo(5))
        assertThat(rleIterator.next(2), equalTo(-1))
    }
}
