package g3101_3200.s3177_find_the_maximum_length_of_a_good_subsequence_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumLength() {
        assertThat(Solution().maximumLength(intArrayOf(1, 2, 1, 1, 3), 2), equalTo(4))
    }

    @Test
    fun maximumLength2() {
        assertThat(Solution().maximumLength(intArrayOf(1, 2, 3, 4, 5, 1), 0), equalTo(2))
    }
}
