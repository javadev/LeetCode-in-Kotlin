package g2401_2500.s2498_frog_jump_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxJump() {
        assertThat(Solution().maxJump(intArrayOf(0, 2, 5, 6, 7)), equalTo(5))
    }

    @Test
    fun maxJump2() {
        assertThat(Solution().maxJump(intArrayOf(0, 3, 9)), equalTo(9))
    }
}
