package g3501_3600.s3583_count_special_triplets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun specialTriplets() {
        assertThat<Int>(Solution().specialTriplets(intArrayOf(6, 3, 6)), equalTo<Int>(1))
    }

    @Test
    fun specialTriplets2() {
        assertThat<Int>(
            Solution().specialTriplets(intArrayOf(0, 1, 0, 0)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun specialTriplets3() {
        assertThat<Int>(
            Solution().specialTriplets(intArrayOf(8, 4, 2, 8, 4)),
            equalTo<Int>(2),
        )
    }
}
