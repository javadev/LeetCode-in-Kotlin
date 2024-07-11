package g3201_3300.s3209_number_of_subarrays_with_and_value_of_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubarrays() {
        assertThat(Solution().countSubarrays(intArrayOf(1, 1, 2), 1), equalTo(3L))
    }

    @Test
    fun countSubarrays2() {
        assertThat(Solution().countSubarrays(intArrayOf(1, 2, 3), 2), equalTo(2L))
    }
}
