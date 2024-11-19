package g1301_1400.s1389_create_target_array_in_the_given_order

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun createTargetArray() {
        assertThat(
            Solution()
                .createTargetArray(intArrayOf(0, 1, 2, 3, 4), intArrayOf(0, 1, 2, 2, 1)),
            equalTo(intArrayOf(0, 4, 1, 3, 2)),
        )
    }

    @Test
    fun createTargetArray2() {
        assertThat(
            Solution()
                .createTargetArray(intArrayOf(1, 2, 3, 4, 0), intArrayOf(0, 1, 2, 3, 0)),
            equalTo(intArrayOf(0, 1, 2, 3, 4)),
        )
    }
}
