package g3201_3300.s3202_find_the_maximum_length_of_valid_subsequence_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumLength() {
        assertThat(Solution().maximumLength(intArrayOf(1, 2, 3, 4, 5), 2), equalTo(5))
    }

    @Test
    fun maximumLength2() {
        assertThat(Solution().maximumLength(intArrayOf(1, 4, 2, 3, 1, 4), 3), equalTo(4))
    }
}
