package g3001_3100.s3012_minimize_length_of_array_using_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumArrayLength() {
        assertThat(Solution().minimumArrayLength(intArrayOf(1, 4, 3, 1)), equalTo(1))
    }

    @Test
    fun minimumArrayLength2() {
        assertThat(Solution().minimumArrayLength(intArrayOf(5, 5, 5, 10, 5)), equalTo(2))
    }

    @Test
    fun minimumArrayLength3() {
        assertThat(Solution().minimumArrayLength(intArrayOf(2, 3, 4)), equalTo(1))
    }
}
