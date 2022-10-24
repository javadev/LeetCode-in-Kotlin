package g0201_0300.s0213_house_robber_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rob() {
        assertThat(Solution().rob(intArrayOf(2, 3, 2)), equalTo(3))
    }

    @Test
    fun rob2() {
        assertThat(Solution().rob(intArrayOf(1, 2, 3, 1)), equalTo(4))
    }

    @Test
    fun rob3() {
        assertThat(Solution().rob(intArrayOf(1, 2, 3)), equalTo(3))
    }

    @Test
    fun rob4() {
        assertThat(Solution().rob(intArrayOf()), equalTo(0))
        assertThat(Solution().rob(intArrayOf(1)), equalTo(1))
        assertThat(Solution().rob(intArrayOf(1, 2)), equalTo(2))
    }
}
