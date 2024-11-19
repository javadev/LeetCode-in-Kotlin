package g1001_1100.s1053_previous_permutation_with_one_swap

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun prevPermOpt1() {
        assertThat(Solution().prevPermOpt1(intArrayOf(3, 2, 1)), equalTo(intArrayOf(3, 1, 2)))
    }

    @Test
    fun prevPermOpt2() {
        assertThat(Solution().prevPermOpt1(intArrayOf(1, 1, 5)), equalTo(intArrayOf(1, 1, 5)))
    }

    @Test
    fun prevPermOpt3() {
        assertThat(
            Solution().prevPermOpt1(intArrayOf(1, 9, 4, 6, 7)),
            equalTo(intArrayOf(1, 7, 4, 6, 9)),
        )
    }
}
