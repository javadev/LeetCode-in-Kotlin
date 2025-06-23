package g3501_3600.s3589_count_prime_gap_balanced_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun primeSubarray() {
        assertThat<Int>(Solution().primeSubarray(intArrayOf(1, 2, 3), 1), equalTo<Int>(2))
    }

    @Test
    fun primeSubarray2() {
        assertThat<Int>(
            Solution().primeSubarray(intArrayOf(2, 3, 5, 7), 3),
            equalTo<Int>(4),
        )
    }
}
