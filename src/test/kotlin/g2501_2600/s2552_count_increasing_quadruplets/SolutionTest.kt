package g2501_2600.s2552_count_increasing_quadruplets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countQuadruplets() {
        assertThat(Solution().countQuadruplets(intArrayOf(1, 3, 2, 4, 5)), equalTo(2))
    }

    @Test
    fun countQuadruplets2() {
        assertThat(Solution().countQuadruplets(intArrayOf(1, 2, 3, 4)), equalTo(0))
    }
}
