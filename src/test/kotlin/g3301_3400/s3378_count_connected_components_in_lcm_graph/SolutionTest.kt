package g3301_3400.s3378_count_connected_components_in_lcm_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countComponents() {
        assertThat<Int>(
            Solution().countComponents(intArrayOf(2, 4, 8, 3, 9), 5),
            equalTo<Int>(4),
        )
    }

    @Test
    fun countComponents2() {
        assertThat<Int>(
            Solution().countComponents(intArrayOf(2, 4, 8, 3, 9, 12), 10),
            equalTo<Int>(2),
        )
    }
}
