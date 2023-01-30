package g0501_0600.s0575_distribute_candies

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distributeCandies() {
        assertThat(Solution().distributeCandies(intArrayOf(1, 1, 2, 2, 3, 3)), equalTo(3))
    }

    @Test
    fun distributeCandies2() {
        assertThat(Solution().distributeCandies(intArrayOf(1, 1, 2, 3)), equalTo(2))
    }

    @Test
    fun distributeCandies3() {
        assertThat(Solution().distributeCandies(intArrayOf(6, 6, 6, 6)), equalTo(1))
    }
}
