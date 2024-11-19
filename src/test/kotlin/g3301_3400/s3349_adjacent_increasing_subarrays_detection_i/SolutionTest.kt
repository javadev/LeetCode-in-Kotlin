package g3301_3400.s3349_adjacent_increasing_subarrays_detection_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hasIncreasingSubarrays() {
        assertThat<Boolean>(
            Solution().hasIncreasingSubarrays(listOf<Int>(2, 5, 7, 8, 9, 2, 3, 4, 3, 1), 3),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun hasIncreasingSubarrays2() {
        assertThat<Boolean>(
            Solution().hasIncreasingSubarrays(listOf<Int>(1, 2, 3, 4, 4, 4, 4, 5, 6, 7), 5),
            equalTo<Boolean>(false),
        )
    }
}
