package g0401_0500.s0485_max_consecutive_ones

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMaxConsecutiveOnes() {
        assertThat(Solution().findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 1, 1, 1)), equalTo(3))
    }

    @Test
    fun findMaxConsecutiveOnes2() {
        assertThat(Solution().findMaxConsecutiveOnes(intArrayOf(1, 0, 1, 1, 0, 1)), equalTo(2))
    }
}
