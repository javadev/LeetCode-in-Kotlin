package g3001_3100.s3077_maximum_strength_of_k_disjoint_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumStrength() {
        assertThat(Solution().maximumStrength(intArrayOf(1, 2, 3, -1, 2), 3), equalTo(22L))
    }

    @Test
    fun maximumStrength2() {
        assertThat(
            Solution().maximumStrength(intArrayOf(12, -2, -2, -2, -2), 5),
            equalTo(64L)
        )
    }

    @Test
    fun maximumStrength3() {
        assertThat(Solution().maximumStrength(intArrayOf(-1, -2, -3), 1), equalTo(-1L))
    }
}
