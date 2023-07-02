package g2201_2300.s2226_maximum_candies_allocated_to_k_children

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumCandies() {
        assertThat(Solution().maximumCandies(intArrayOf(5, 8, 6), 3), equalTo(5))
    }

    @Test
    fun maximumCandies2() {
        assertThat(Solution().maximumCandies(intArrayOf(2, 5), 11), equalTo(0))
    }

    @Test
    fun maximumCandies3() {
        assertThat(Solution().maximumCandies(intArrayOf(1, 2, 3, 4, 10), 5), equalTo(3))
    }
}
