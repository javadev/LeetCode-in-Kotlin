package g2801_2900.s2826_sorting_three_groups

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumOperations() {
        assertThat(Solution().minimumOperations(mutableListOf(2, 1, 3, 2, 1)), equalTo(3))
    }

    @Test
    fun minimumOperations2() {
        assertThat(Solution().minimumOperations(mutableListOf(1, 3, 2, 1, 3, 3)), equalTo(2))
    }

    @Test
    fun minimumOperations3() {
        assertThat(Solution().minimumOperations(mutableListOf(2, 2, 2, 2, 3, 3)), equalTo(0))
    }
}
