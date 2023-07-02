package g2301_2400.s2359_find_closest_node_to_given_two_nodes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun closestMeetingNode() {
        assertThat(Solution().closestMeetingNode(intArrayOf(2, 2, 3, -1), 0, 1), equalTo(2))
    }

    @Test
    fun closestMeetingNode2() {
        assertThat(Solution().closestMeetingNode(intArrayOf(1, 2, -1), 0, 2), equalTo(2))
    }
}
