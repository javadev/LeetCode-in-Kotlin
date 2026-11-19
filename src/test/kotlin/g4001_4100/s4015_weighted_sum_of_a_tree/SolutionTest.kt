package g4001_4100.s4015_weighted_sum_of_a_tree

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun weightedSum() {
        assertThat<Long>(
            Solution()
                .weightedSum(intArrayOf(-1, 0, 0, 0, 2, 2), intArrayOf(5, 2, 3, 1, 4, 6)),
            equalTo<Long>(37L),
        )
    }

    @Test
    fun weightedSum2() {
        assertThat<Long>(
            Solution().weightedSum(intArrayOf(-1, 0, 1, 2), intArrayOf(1, 2, 3, 4)),
            equalTo<Long>(20L),
        )
    }
}
