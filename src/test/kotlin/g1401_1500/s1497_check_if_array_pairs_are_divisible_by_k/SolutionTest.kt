package g1401_1500.s1497_check_if_array_pairs_are_divisible_by_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canArrange() {
        assertThat(
            Solution().canArrange(intArrayOf(1, 2, 3, 4, 5, 10, 6, 7, 8, 9), 5),
            equalTo(true)
        )
    }

    @Test
    fun canArrange2() {
        assertThat(Solution().canArrange(intArrayOf(1, 2, 3, 4, 5, 6), 7), equalTo(true))
    }

    @Test
    fun canArrange3() {
        assertThat(Solution().canArrange(intArrayOf(1, 2, 3, 4, 5, 6), 10), equalTo(false))
    }
}
