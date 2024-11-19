package g0901_1000.s0927_three_equal_parts

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun threeEqualParts() {
        assertThat(
            Solution().threeEqualParts(intArrayOf(1, 0, 1, 0, 1)),
            equalTo(intArrayOf(0, 3)),
        )
    }

    @Test
    fun threeEqualParts2() {
        assertThat(
            Solution().threeEqualParts(intArrayOf(1, 1, 0, 1, 1)),
            equalTo(intArrayOf(-1, -1)),
        )
    }

    @Test
    fun threeEqualParts3() {
        assertThat(
            Solution().threeEqualParts(intArrayOf(1, 1, 0, 0, 1)),
            equalTo(intArrayOf(0, 2)),
        )
    }
}
