package g3701_3800.s3784_minimum_deletion_cost_to_make_all_characters_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat<Long>(
            Solution().minCost("aabaac", intArrayOf(1, 2, 3, 4, 1, 10)),
            equalTo<Long>(11L),
        )
    }

    @Test
    fun minCost2() {
        assertThat<Long>(
            Solution().minCost("abc", intArrayOf(10, 5, 8)),
            equalTo<Long>(13L),
        )
    }

    @Test
    fun minCost3() {
        assertThat<Long>(
            Solution().minCost("zzzzz", intArrayOf(67, 67, 67, 67, 67)),
            equalTo<Long>(0L),
        )
    }
}
