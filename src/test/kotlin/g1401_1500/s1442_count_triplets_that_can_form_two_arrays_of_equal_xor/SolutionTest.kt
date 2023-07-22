package g1401_1500.s1442_count_triplets_that_can_form_two_arrays_of_equal_xor

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countTriplets() {
        assertThat(Solution().countTriplets(intArrayOf(2, 3, 1, 6, 7)), equalTo(4))
    }

    @Test
    fun countTriplets2() {
        assertThat(Solution().countTriplets(intArrayOf(1, 1, 1, 1, 1)), equalTo(10))
    }
}
