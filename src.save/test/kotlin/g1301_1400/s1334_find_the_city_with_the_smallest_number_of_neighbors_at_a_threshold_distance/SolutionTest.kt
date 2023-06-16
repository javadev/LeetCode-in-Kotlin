package g1301_1400.s1334_find_the_city_with_the_smallest_number_of_neighbors_at_a_threshold_distance

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findTheCity() {
        val edges = arrayOf(intArrayOf(0, 1, 3), intArrayOf(1, 2, 1), intArrayOf(1, 3, 4), intArrayOf(2, 3, 1))
        assertThat(Solution().findTheCity(4, edges, 4), equalTo(3))
    }

    @Test
    fun findTheCity2() {
        val edges = arrayOf(
            intArrayOf(0, 1, 2), intArrayOf(0, 4, 8), intArrayOf(1, 2, 3), intArrayOf(1, 4, 2),
            intArrayOf(2, 3, 1), intArrayOf(3, 4, 1)
        )
        assertThat(Solution().findTheCity(5, edges, 2), equalTo(0))
    }
}
