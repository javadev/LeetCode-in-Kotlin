package g2901_3000.s2928_distribute_candies_among_children_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distributeCandies() {
        assertThat(Solution().distributeCandies(5, 2), equalTo(3))
    }

    @Test
    fun distributeCandies2() {
        assertThat(Solution().distributeCandies(3, 3), equalTo(10))
    }
}
