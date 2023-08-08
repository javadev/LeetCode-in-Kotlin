package g2701_2800.s2745_construct_the_longest_new_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestString() {
        assertThat(Solution().longestString(2, 5, 1), equalTo(12))
    }

    @Test
    fun longestString2() {
        assertThat(Solution().longestString(3, 2, 2), equalTo(14))
    }
}
