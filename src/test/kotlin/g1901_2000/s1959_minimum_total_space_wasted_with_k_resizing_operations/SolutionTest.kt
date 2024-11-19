package g1901_2000.s1959_minimum_total_space_wasted_with_k_resizing_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkMove() {
        assertThat(Solution().minSpaceWastedKResizing(intArrayOf(10, 20), 0), equalTo(10))
    }

    @Test
    fun checkMove2() {
        assertThat(
            Solution().minSpaceWastedKResizing(intArrayOf(10, 20, 30), 1),
            equalTo(10),
        )
    }

    @Test
    fun checkMove3() {
        assertThat(
            Solution().minSpaceWastedKResizing(intArrayOf(10, 20, 15, 30, 20), 2),
            equalTo(15),
        )
    }
}
