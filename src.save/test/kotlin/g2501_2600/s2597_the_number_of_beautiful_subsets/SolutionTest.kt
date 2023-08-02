package g2501_2600.s2597_the_number_of_beautiful_subsets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun beautifulSubsets() {
        assertThat(Solution().beautifulSubsets(intArrayOf(2, 4, 6), 2), equalTo(4))
    }

    @Test
    fun beautifulSubsets2() {
        assertThat(Solution().beautifulSubsets(intArrayOf(1), 1), equalTo(1))
    }
}
