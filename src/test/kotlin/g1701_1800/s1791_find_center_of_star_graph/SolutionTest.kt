package g1701_1800.s1791_find_center_of_star_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findCenter() {
        assertThat(Solution().findCenter(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(4, 2))), equalTo(2))
    }

    @Test
    fun findCenter2() {
        assertThat(
            Solution().findCenter(arrayOf(intArrayOf(1, 2), intArrayOf(5, 1), intArrayOf(1, 3), intArrayOf(1, 4))),
            equalTo(1)
        )
    }
}
