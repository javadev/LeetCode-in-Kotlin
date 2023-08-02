package g0801_0900.s0875_koko_eating_bananas

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minEatingSpeed() {
        assertThat(Solution().minEatingSpeed(intArrayOf(3, 6, 7, 11), 8), equalTo(4))
    }

    @Test
    fun minEatingSpeed2() {
        assertThat(Solution().minEatingSpeed(intArrayOf(30, 11, 23, 4, 20), 5), equalTo(30))
    }

    @Test
    fun minEatingSpeed3() {
        assertThat(Solution().minEatingSpeed(intArrayOf(30, 11, 23, 4, 20), 6), equalTo(23))
    }
}
