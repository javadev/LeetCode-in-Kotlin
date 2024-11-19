package g2201_2300.s2267_check_if_there_is_a_valid_parentheses_string_path

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hasValidPath() {
        assertThat(
            Solution()
                .hasValidPath(
                    arrayOf(
                        charArrayOf('(', '(', '('),
                        charArrayOf(')', '(', ')'),
                        charArrayOf('(', '(', ')'),
                        charArrayOf('(', '(', ')'),
                    ),
                ),
            equalTo(true),
        )
    }

    @Test
    fun hasValidPath2() {
        assertThat(
            Solution().hasValidPath(arrayOf(charArrayOf(')', ')'), charArrayOf('(', '('))),
            equalTo(false),
        )
    }
}
