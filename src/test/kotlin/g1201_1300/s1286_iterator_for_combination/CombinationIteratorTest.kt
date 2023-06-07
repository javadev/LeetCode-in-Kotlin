package g1201_1300.s1286_iterator_for_combination

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class CombinationIteratorTest {
    @Test
    fun combinationIterator() {
        val itr = CombinationIterator("abc", 2)
        assertThat(itr.next(), equalTo("ab"))
        assertThat(itr.hasNext(), equalTo(true))
        assertThat(itr.next(), equalTo("ac"))
        assertThat(itr.hasNext(), equalTo(true))
        assertThat(itr.next(), equalTo("bc"))
        assertThat(itr.hasNext(), equalTo(false))
    }
}
