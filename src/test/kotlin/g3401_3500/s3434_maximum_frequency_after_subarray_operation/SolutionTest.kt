package g3401_3500.s3434_maximum_frequency_after_subarray_operation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxFrequency() {
        assertThat<Int>(
            Solution().maxFrequency(intArrayOf(1, 2, 3, 4, 5, 6), 1),
            equalTo<Int>(2),
        )
    }

    @Test
    fun maxFrequency2() {
        assertThat<Int>(
            Solution().maxFrequency(intArrayOf(10, 2, 3, 4, 5, 5, 4, 3, 2, 2), 10),
            equalTo<Int>(4),
        )
    }
}
