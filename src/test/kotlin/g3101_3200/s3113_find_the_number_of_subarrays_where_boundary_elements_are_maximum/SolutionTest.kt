package g3101_3200.s3113_find_the_number_of_subarrays_where_boundary_elements_are_maximum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfSubarrays() {
        assertThat(Solution().numberOfSubarrays(intArrayOf(1, 4, 3, 3, 2)), equalTo(6L))
    }

    @Test
    fun numberOfSubarrays2() {
        assertThat(Solution().numberOfSubarrays(intArrayOf(3, 3, 3)), equalTo(6L))
    }

    @Test
    fun numberOfSubarrays3() {
        assertThat(Solution().numberOfSubarrays(intArrayOf(1)), equalTo(1L))
    }
}
