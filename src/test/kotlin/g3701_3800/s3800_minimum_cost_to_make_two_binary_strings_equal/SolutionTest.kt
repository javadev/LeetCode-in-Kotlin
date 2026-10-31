package g3701_3800.s3800_minimum_cost_to_make_two_binary_strings_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumCost() {
        assertThat<Long>(
            Solution().minimumCost("01000", "10111", 10, 2, 2),
            equalTo<Long>(16L),
        )
    }

    @Test
    fun minimumCost2() {
        assertThat<Long>(
            Solution().minimumCost("001", "110", 2, 100, 100),
            equalTo<Long>(6L),
        )
    }

    @Test
    fun minimumCost3() {
        assertThat<Long>(
            Solution().minimumCost("1010", "1010", 5, 5, 5),
            equalTo<Long>(0L),
        )
    }
}
