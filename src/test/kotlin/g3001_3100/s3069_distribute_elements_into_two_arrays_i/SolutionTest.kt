package g3001_3100.s3069_distribute_elements_into_two_arrays_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun resultArray() {
        assertThat(Solution().resultArray(intArrayOf(2, 1, 3)), equalTo(intArrayOf(2, 3, 1)))
    }

    @Test
    fun resultArray2() {
        assertThat(
            Solution().resultArray(intArrayOf(5, 4, 3, 8)),
            equalTo(intArrayOf(5, 3, 4, 8)),
        )
    }
}
