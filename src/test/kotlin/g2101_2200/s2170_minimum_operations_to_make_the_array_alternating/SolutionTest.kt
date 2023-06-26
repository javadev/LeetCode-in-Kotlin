package g2101_2200.s2170_minimum_operations_to_make_the_array_alternating

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumOperations() {
        assertThat(Solution().minimumOperations(intArrayOf(3, 1, 3, 2, 4, 3)), equalTo(3))
    }

    @Test
    fun minimumOperations2() {
        assertThat(Solution().minimumOperations(intArrayOf(1, 2, 2, 2, 2)), equalTo(2))
    }
}
