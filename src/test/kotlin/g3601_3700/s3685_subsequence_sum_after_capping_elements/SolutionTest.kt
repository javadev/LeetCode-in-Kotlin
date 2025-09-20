package g3601_3700.s3685_subsequence_sum_after_capping_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subsequenceSumAfterCapping() {
        assertThat<BooleanArray>(
            Solution().subsequenceSumAfterCapping(intArrayOf(4, 3, 2, 4), 5),
            equalTo<BooleanArray>(booleanArrayOf(false, false, true, true))
        )
    }

    @Test
    fun subsequenceSumAfterCapping2() {
        assertThat<BooleanArray>(
            Solution().subsequenceSumAfterCapping(intArrayOf(1, 2, 3, 4, 5), 3),
            equalTo<BooleanArray>(booleanArrayOf(true, true, true, true, true))
        )
    }
}
