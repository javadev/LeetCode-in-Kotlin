package g2901_3000.s2937_make_three_strings_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMinimumOperations() {
        assertThat(Solution().findMinimumOperations("abc", "abb", "ab"), equalTo(2))
    }

    @Test
    fun findMinimumOperations2() {
        assertThat(Solution().findMinimumOperations("dac", "bac", "cac"), equalTo(-1))
    }
}
