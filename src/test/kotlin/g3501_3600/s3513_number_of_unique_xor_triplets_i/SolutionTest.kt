package g3501_3600.s3513_number_of_unique_xor_triplets_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun uniqueXorTriplets() {
        assertThat<Int>(Solution().uniqueXorTriplets(intArrayOf(1, 2)), equalTo<Int>(2))
    }

    @Test
    fun uniqueXorTriplets2() {
        assertThat<Int>(Solution().uniqueXorTriplets(intArrayOf(3, 1, 2)), equalTo<Int>(4))
    }
}
