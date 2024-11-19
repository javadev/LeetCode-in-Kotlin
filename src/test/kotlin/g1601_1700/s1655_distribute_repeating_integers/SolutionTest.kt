package g1601_1700.s1655_distribute_repeating_integers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canDistribute() {
        assertThat(
            Solution().canDistribute(intArrayOf(1, 2, 3, 4), intArrayOf(2)),
            equalTo(false),
        )
    }

    @Test
    fun canDistribute2() {
        assertThat(
            Solution().canDistribute(intArrayOf(1, 2, 3, 3), intArrayOf(2)),
            equalTo(true),
        )
    }

    @Test
    fun canDistribute3() {
        assertThat(
            Solution().canDistribute(intArrayOf(1, 1, 2, 2), intArrayOf(2, 2)),
            equalTo(true),
        )
    }
}
