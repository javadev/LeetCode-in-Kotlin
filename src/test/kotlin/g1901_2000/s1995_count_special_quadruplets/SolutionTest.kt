package g1901_2000.s1995_count_special_quadruplets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countQuadruplets() {
        assertThat(Solution().countQuadruplets(intArrayOf(1, 2, 3, 6)), equalTo(1))
    }

    @Test
    fun countQuadruplets2() {
        assertThat(Solution().countQuadruplets(intArrayOf(3, 3, 6, 4, 5)), equalTo(0))
    }

    @Test
    fun countQuadruplets3() {
        assertThat(Solution().countQuadruplets(intArrayOf(1, 1, 1, 3, 5)), equalTo(4))
    }
}
