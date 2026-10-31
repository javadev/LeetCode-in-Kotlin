package g3701_3800.s3752_lexicographically_smallest_negated_permutation_that_sums_to_target

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lexSmallestNegatedPerm() {
        assertThat<IntArray>(
            Solution().lexSmallestNegatedPerm(3, 0L),
            equalTo<IntArray>(intArrayOf(-3, 1, 2)),
        )
    }

    @Test
    fun lexSmallestNegatedPerm2() {
        assertThat<IntArray>(
            Solution().lexSmallestNegatedPerm(3, 10000000000L),
            equalTo<IntArray>(intArrayOf()),
        )
    }
}
