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

    @Test
    fun isSelfCrossing7() {
        assertThat(Solution().isSelfCrossing(intArrayOf(3, 3, 3, 2, 1, 1)), equalTo(false))
    }

    @Test
    fun isSelfCrossing8() {
        assertThat(Solution().isSelfCrossing(intArrayOf(2, 3, 4, 5, 6, 7)), equalTo(false))
    }

    @Test
    fun isSelfCrossing9() {
        assertThat(Solution().isSelfCrossing(intArrayOf(2, 2, 3, 2, 2)), equalTo(true))
    }

    @Test
    fun isSelfCrossing10() {
        assertThat(Solution().isSelfCrossing(intArrayOf(1, 1, 2, 1, 2, 1)), equalTo(true))
    }

    @Test
    fun isSelfCrossing11() {
        assertThat(Solution().isSelfCrossing(intArrayOf(10, 20, 30, 40, 50)), equalTo(false))
    }

    @Test
    fun isSelfCrossing12() {
        assertThat(Solution().isSelfCrossing(intArrayOf(3, 3, 4, 2, 2)), equalTo(false))
    }

    @Test
    fun isSelfCrossing13() {
        assertThat(Solution().isSelfCrossing(intArrayOf(2, 1, 2, 1)), equalTo(true))
    }

    @Test
    fun isSelfCrossing14() {
        assertThat(Solution().isSelfCrossing(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)), equalTo(false))
    }

    @Test
    fun isSelfCrossing15() {
        assertThat(Solution().isSelfCrossing(intArrayOf(2, 2, 2, 2, 2, 2)), equalTo(true))
    }

    @Test
    fun isSelfCrossing16() {
        assertThat(Solution().isSelfCrossing(intArrayOf(1, 1, 2, 1, 1)), equalTo(true))
    }

    @Test
    fun isSelfCrossing17() {
        assertThat(Solution().isSelfCrossing(intArrayOf(1, 1, 2, 2, 1, 1)), equalTo(true))
    }

    @Test
    fun isSelfCrossing18() {
        assertThat(Solution().isSelfCrossing(intArrayOf(1, 1, 2, 2, 1, 1)), equalTo(true))
    }
}
