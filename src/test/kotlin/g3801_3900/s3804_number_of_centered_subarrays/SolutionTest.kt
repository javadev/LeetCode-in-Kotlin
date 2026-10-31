package g3801_3900.s3804_number_of_centered_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun centeredSubarrays() {
        assertThat<Int>(
            Solution().centeredSubarrays(intArrayOf(-1, 1, 0)),
            equalTo<Int>(5),
        )
    }

    @Test
    fun centeredSubarrays2() {
        assertThat<Int>(Solution().centeredSubarrays(intArrayOf(2, -3)), equalTo<Int>(2))
    }
}
