package g0301_0400.s0315_count_of_smaller_numbers_after_self

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun countSmaller() {
        assertThat(
            Solution().countSmaller(intArrayOf(5, 2, 6, 1)),
            equalTo(Arrays.asList(2, 1, 1, 0))
        )
    }

    @Test
    fun countSmaller2() {
        assertThat(Solution().countSmaller(intArrayOf(-1)), equalTo(Arrays.asList(0)))
    }

    @Test
    fun countSmaller3() {
        assertThat(Solution().countSmaller(intArrayOf(-1, -1)), equalTo(Arrays.asList(0, 0)))
    }
}
