package g2701_2800.s2746_decremental_string_concatenation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimizeConcatenatedLength() {
        assertThat(Solution().minimizeConcatenatedLength(arrayOf("aa", "ab", "bc")), equalTo(4))
    }

    @Test
    fun minimizeConcatenatedLength2() {
        assertThat(Solution().minimizeConcatenatedLength(arrayOf("ab", "b")), equalTo(2))
    }

    @Test
    fun minimizeConcatenatedLength3() {
        assertThat(Solution().minimizeConcatenatedLength(arrayOf("aaa", "c", "aba")), equalTo(6))
    }
}
