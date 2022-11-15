package g0301_0400.s0335_self_crossing

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isSelfCrossing() {
        assertThat(Solution().isSelfCrossing(intArrayOf(2, 1, 1, 2)), equalTo(true))
    }

    @Test
    fun isSelfCrossing2() {
        assertThat(Solution().isSelfCrossing(intArrayOf(1, 2, 3, 4)), equalTo(false))
    }

    @Test
    fun isSelfCrossing3() {
        assertThat(Solution().isSelfCrossing(intArrayOf(1, 1, 1, 1)), equalTo(true))
    }

    @Test
    fun isSelfCrossing4() {
        assertThat(Solution().isSelfCrossing(intArrayOf(1, 1, 2, 1, 1)), equalTo(true))
    }

    @Test
    fun isSelfCrossing5() {
        assertThat(Solution().isSelfCrossing(intArrayOf(4, 2, 1, 4)), equalTo(true))
    }

    @Test
    fun isSelfCrossing6() {
        assertThat(Solution().isSelfCrossing(intArrayOf(1, 1, 1)), equalTo(false))
    }
}
