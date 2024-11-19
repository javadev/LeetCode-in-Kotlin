package g1401_1500.s1466_reorder_routes_to_make_all_paths_lead_to_the_city_zero

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minReorder() {
        assertThat(
            Solution().minReorder(
                6,
                arrayOf(intArrayOf(0, 1), intArrayOf(1, 3), intArrayOf(2, 3), intArrayOf(4, 0), intArrayOf(4, 5)),
            ),
            equalTo(3),
        )
    }

    @Test
    fun minReorder2() {
        assertThat(
            Solution().minReorder(5, arrayOf(intArrayOf(1, 0), intArrayOf(1, 2), intArrayOf(3, 2), intArrayOf(3, 4))),
            equalTo(2),
        )
    }

    @Test
    fun minReorder3() {
        assertThat(
            Solution().minReorder(6, arrayOf(intArrayOf(1, 0), intArrayOf(2, 0))),
            equalTo(0),
        )
    }
}
