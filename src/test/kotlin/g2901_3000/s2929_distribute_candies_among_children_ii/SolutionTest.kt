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

    @Test
    fun distributeCandies3() {
        assertThat(Solution().distributeCandies(2, 5), equalTo(6L))
    }

    @Test
    fun distributeCandies4() {
        assertThat(Solution().distributeCandies(4, 4), equalTo(15L))
    }

    @Test
    fun distributeCandies5() {
        assertThat(Solution().distributeCandies(7, 5), equalTo(27L))
    }

    @Test
    fun distributeCandies6() {
        assertThat(Solution().distributeCandies(12, 5), equalTo(10L))
    }

    @Test
    fun distributeCandies7() {
        assertThat(Solution().distributeCandies(20, 5), equalTo(0L))
    }

    @Test
    fun distributeCandies8() {
        assertThat(Solution().distributeCandies(10, 5), equalTo(21L))
    }

    @Test
    fun distributeCandies9() {
        assertThat(Solution().distributeCandies(15, 5), equalTo(1L))
    }
}
