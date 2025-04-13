package g3501_3600.s3514_number_of_unique_xor_triplets_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun uniqueXorTriplets() {
        assertThat<Int>(Solution().uniqueXorTriplets(intArrayOf(1, 3)), equalTo<Int>(2))
    }

    @Test
    fun uniqueXorTriplets2() {
        assertThat<Int>(
            Solution().uniqueXorTriplets(intArrayOf(6, 7, 8, 9)),
            equalTo<Int>(4),
        )
    }
}
