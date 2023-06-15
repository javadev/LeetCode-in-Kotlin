package g1601_1700.s1695_maximum_erasure_value

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumUniqueSubarray() {
        assertThat(Solution().maximumUniqueSubarray(intArrayOf(4, 2, 4, 5, 6)), equalTo(17))
    }

    @Test
    fun maximumUniqueSubarray2() {
        assertThat(
            Solution().maximumUniqueSubarray(intArrayOf(5, 2, 1, 2, 5, 2, 1, 2, 5)),
            equalTo(8)
        )
    }
}
