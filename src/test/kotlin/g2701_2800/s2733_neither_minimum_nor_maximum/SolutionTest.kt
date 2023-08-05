package g2701_2800.s2733_neither_minimum_nor_maximum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findNonMinOrMax() {
        assertThat(Solution().findNonMinOrMax(intArrayOf(3, 2, 1, 4)), equalTo(3))
    }

    @Test
    fun findNonMinOrMax2() {
        assertThat(Solution().findNonMinOrMax(intArrayOf(1, 2)), equalTo(-1))
    }

    @Test
    fun findNonMinOrMax3() {
        assertThat(Solution().findNonMinOrMax(intArrayOf(2, 1, 3)), equalTo(2))
    }
}
