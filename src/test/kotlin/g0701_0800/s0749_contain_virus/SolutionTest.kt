package g0701_0800.s0749_contain_virus

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun containVirus() {
        val input = arrayOf(
            intArrayOf(0, 1, 0, 0, 0, 0, 0, 1),
            intArrayOf(0, 1, 0, 0, 0, 0, 0, 1),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 1),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0),
        )
        assertThat(Solution().containVirus(input), equalTo(10))
    }

    @Test
    fun containVirus2() {
        val input = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))
        assertThat(Solution().containVirus(input), equalTo(4))
    }

    @Test
    fun containVirus3() {
        val input = arrayOf(
            intArrayOf(1, 1, 1, 0, 0, 0, 0, 0, 0),
            intArrayOf(1, 0, 1, 0, 1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 0, 0, 0, 0, 0, 0),
        )
        assertThat(Solution().containVirus(input), equalTo(13))
    }
}
