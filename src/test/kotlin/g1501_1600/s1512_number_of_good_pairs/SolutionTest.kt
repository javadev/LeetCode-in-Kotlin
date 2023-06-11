package g1501_1600.s1512_number_of_good_pairs

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numIdenticalPairs() {
        MatcherAssert.assertThat(Solution().numIdenticalPairs(intArrayOf(1, 2, 3, 1, 1, 3)), CoreMatchers.equalTo(4))
    }

    @Test
    fun numIdenticalPairs2() {
        MatcherAssert.assertThat(Solution().numIdenticalPairs(intArrayOf(1, 1, 1, 1)), CoreMatchers.equalTo(6))
    }

    @Test
    fun numIdenticalPairs3() {
        MatcherAssert.assertThat(Solution().numIdenticalPairs(intArrayOf(1, 2, 3)), CoreMatchers.equalTo(0))
    }
}
