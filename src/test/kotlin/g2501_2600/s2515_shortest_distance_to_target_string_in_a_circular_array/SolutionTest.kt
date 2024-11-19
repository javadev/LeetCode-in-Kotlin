package g2501_2600.s2515_shortest_distance_to_target_string_in_a_circular_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun closetTarget() {
        assertThat(
            Solution()
                .closetTarget(arrayOf("hello", "i", "am", "leetcode", "hello"), "hello", 1),
            equalTo(1),
        )
    }

    @Test
    fun closetTarget2() {
        assertThat(
            Solution().closetTarget(arrayOf("a", "b", "leetcode"), "leetcode", 0),
            equalTo(1),
        )
    }

    @Test
    fun closetTarget3() {
        assertThat(
            Solution().closetTarget(arrayOf("i", "eat", "leetcode"), "ate", 0),
            equalTo(-1),
        )
    }
}
