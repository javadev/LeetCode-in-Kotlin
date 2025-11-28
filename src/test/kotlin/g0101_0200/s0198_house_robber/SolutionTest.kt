package g0101_0200.s0198_house_robber

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rob() {
        assertThat(Solution().rob(intArrayOf(1, 2, 3, 1)), equalTo(4))
    }

    @Test
    fun rob2() {
        assertThat(Solution().rob(intArrayOf(2, 7, 9, 3, 1)), equalTo(12))
    }

    @Test
    fun rob3() {
        assertThat(Solution().rob(intArrayOf()), equalTo(0))
    }

    @Test
    fun rob4() {
        assertThat(Solution().rob(intArrayOf(1)), equalTo(1))
    }

    @Test
    fun rob5() {
        assertThat(Solution().rob(intArrayOf(1, 2)), equalTo(2))
    }

    @Test
    fun rob6() {
        assertThat(Solution().rob(intArrayOf(5)), equalTo(5))
    }

    @Test
    fun rob7() {
        assertThat(Solution().rob(intArrayOf(5, 10)), equalTo(10))
    }

    @Test
    fun rob8() {
        assertThat(Solution().rob(intArrayOf(2, 1, 1, 2)), equalTo(4))
    }

    @Test
    fun rob9() {
        assertThat(Solution().rob(intArrayOf(3, 3, 3, 3, 3)), equalTo(9))
    }

    @Test
    fun rob10() {
        assertThat(Solution().rob(intArrayOf(100, 1, 100, 1, 100)), equalTo(300))
    }

    @Test
    fun rob11() {
        assertThat(Solution().rob(intArrayOf()), equalTo(0))
    }
}
