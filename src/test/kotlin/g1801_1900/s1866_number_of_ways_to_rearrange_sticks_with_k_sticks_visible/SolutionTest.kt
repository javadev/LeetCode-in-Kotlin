package g1801_1900.s1866_number_of_ways_to_rearrange_sticks_with_k_sticks_visible

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rearrangeSticks() {
        assertThat(Solution().rearrangeSticks(3, 2), equalTo(3))
    }

    @Test
    fun rearrangeSticks2() {
        assertThat(Solution().rearrangeSticks(5, 5), equalTo(1))
    }

    @Test
    fun rearrangeSticks3() {
        assertThat(Solution().rearrangeSticks(20, 11), equalTo(647427950))
    }
}
