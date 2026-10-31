package g3701_3800.s3774_absolute_difference_between_maximum_and_minimum_k_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun absDifference() {
        assertThat<Int>(
            Solution().absDifference(intArrayOf(5, 2, 2, 4), 2),
            equalTo<Int>(5),
        )
    }

    @Test
    fun absDifference2() {
        assertThat<Int>(Solution().absDifference(intArrayOf(100), 1), equalTo<Int>(0))
    }
}
