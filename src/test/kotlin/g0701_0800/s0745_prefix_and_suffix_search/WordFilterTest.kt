package g0701_0800.s0745_prefix_and_suffix_search

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class WordFilterTest {
    @Test
    fun wordFilterTest() {
        val wordFilter = WordFilter(arrayOf("apple"))
        assertThat(wordFilter.f("a", "e"), equalTo(0))
    }
}
