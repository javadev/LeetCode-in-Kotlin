package g2101_2200.s2138_divide_a_string_into_groups_of_size_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun divideString() {
        assertThat(
            Solution().divideString("abcdefghi", 3, 'x'),
            equalTo(arrayOf("abc", "def", "ghi")),
        )
    }

    @Test
    fun divideString2() {
        assertThat(
            Solution().divideString("abcdefghij", 3, 'x'),
            equalTo(arrayOf("abc", "def", "ghi", "jxx")),
        )
    }
}
