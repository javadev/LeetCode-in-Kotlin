package g0401_0500.s0403_frog_jump

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canCross() {
        assertThat(Solution().canCross(intArrayOf(0, 1, 3, 5, 6, 8, 12, 17)), equalTo(true))
    }

    @Test
    fun canCross2() {
        assertThat(Solution().canCross(intArrayOf(0, 1, 2, 3, 4, 8, 9, 11)), equalTo(false))
    }
}
