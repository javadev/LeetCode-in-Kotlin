package g2901_3000.s2929_distribute_candies_among_children_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distributeCandies() {
        assertThat(Solution().distributeCandies(5, 2), equalTo(3L))
    }

    @Test
    fun distributeCandies2() {
        assertThat(Solution().distributeCandies(3, 3), equalTo(10L))
    }
}
