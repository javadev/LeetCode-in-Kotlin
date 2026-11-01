package g3801_3900.s3854_minimum_operations_to_make_array_parity_alternating

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeParityAlternating() {
        assertThat<IntArray>(
            Solution().makeParityAlternating(intArrayOf(-2, -3, 1, 4)),
            equalTo<IntArray>(intArrayOf(2, 6)),
        )
    }

    @Test
    fun makeParityAlternating2() {
        assertThat<IntArray>(
            Solution().makeParityAlternating(intArrayOf(0, 2, -2)),
            equalTo<IntArray>(intArrayOf(1, 3)),
        )
    }

    @Test
    fun makeParityAlternating3() {
        assertThat<IntArray>(
            Solution().makeParityAlternating(intArrayOf(7)),
            equalTo<IntArray>(intArrayOf(0, 0)),
        )
    }
}
