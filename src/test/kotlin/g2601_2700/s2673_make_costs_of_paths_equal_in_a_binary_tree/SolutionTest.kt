package g2601_2700.s2673_make_costs_of_paths_equal_in_a_binary_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minIncrements() {
        assertThat(
            Solution().minIncrements(7, intArrayOf(1, 5, 2, 2, 3, 3, 1)),
            equalTo(6),
        )
    }

    @Test
    fun minIncrements2() {
        assertThat(
            Solution().minIncrements(3, intArrayOf(5, 3, 3)),
            equalTo(0),
        )
    }
}
