package g3001_3100.s3020_find_the_maximum_number_of_elements_in_subset

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumLength() {
        assertThat(Solution().maximumLength(intArrayOf(5, 4, 1, 2, 2)), equalTo(3))
    }

    @Test
    fun maximumLength2() {
        assertThat(Solution().maximumLength(intArrayOf(1, 3, 2, 4)), equalTo(1))
    }
}
