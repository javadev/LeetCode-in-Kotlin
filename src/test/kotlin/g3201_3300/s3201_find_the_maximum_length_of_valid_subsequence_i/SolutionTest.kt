package g3201_3300.s3201_find_the_maximum_length_of_valid_subsequence_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumLength() {
        assertThat(Solution().maximumLength(intArrayOf(1, 2, 3, 4)), equalTo(4))
    }

    @Test
    fun maximumLength2() {
        assertThat(Solution().maximumLength(intArrayOf(1, 2, 1, 1, 2, 1, 2)), equalTo(6))
    }
}
