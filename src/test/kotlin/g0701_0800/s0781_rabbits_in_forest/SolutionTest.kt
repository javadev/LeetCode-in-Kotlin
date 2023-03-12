package g0701_0800.s0781_rabbits_in_forest

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numRabbits() {
        assertThat(Solution().numRabbits(intArrayOf(1, 1, 2)), equalTo(5))
    }

    @Test
    fun numRabbits2() {
        assertThat(Solution().numRabbits(intArrayOf(10, 10, 10)), equalTo(11))
    }

    @Test
    fun numRabbits3() {
        assertThat(Solution().numRabbits(intArrayOf(1, 0, 1, 0, 0)), equalTo(5))
    }
}
