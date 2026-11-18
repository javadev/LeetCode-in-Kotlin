package g4001_4100.s4002_count_valid_sequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countValidSequences() {
        assertThat<Int>(Solution().countValidSequences(5, 3), equalTo<Int>(3))
    }

    @Test
    fun countValidSequences2() {
        assertThat<Int>(Solution().countValidSequences(3, 2), equalTo<Int>(2))
    }

    @Test
    fun countValidSequences3() {
        assertThat<Int>(Solution().countValidSequences(5, 5), equalTo<Int>(0))
    }
}
