package g1501_1600.s1512_number_of_good_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numIdenticalPairs() {
        assertThat(Solution().numIdenticalPairs(intArrayOf(1, 2, 3, 1, 1, 3)), equalTo(4))
    }

    @Test
    fun numIdenticalPairs2() {
        assertThat(Solution().numIdenticalPairs(intArrayOf(1, 1, 1, 1)), equalTo(6))
    }

    @Test
    fun numIdenticalPairs3() {
        assertThat(Solution().numIdenticalPairs(intArrayOf(1, 2, 3)), equalTo(0))
    }
}
