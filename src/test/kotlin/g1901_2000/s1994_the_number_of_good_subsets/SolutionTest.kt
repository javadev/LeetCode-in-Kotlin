package g1901_2000.s1994_the_number_of_good_subsets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfGoodSubsets() {
        assertThat(Solution().numberOfGoodSubsets(intArrayOf(1, 2, 3, 4)), equalTo(6))
    }

    @Test
    fun numberOfGoodSubsets2() {
        assertThat(Solution().numberOfGoodSubsets(intArrayOf(4, 2, 3, 15)), equalTo(5))
    }
}
