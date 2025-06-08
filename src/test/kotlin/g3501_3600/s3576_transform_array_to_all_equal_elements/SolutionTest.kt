package g3501_3600.s3576_transform_array_to_all_equal_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canMakeEqual() {
        assertThat<Boolean>(
            Solution().canMakeEqual(intArrayOf(1, -1, 1, -1, 1), 3),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun canMakeEqual2() {
        assertThat<Boolean>(
            Solution().canMakeEqual(intArrayOf(-1, -1, -1, 1, 1, 1), 5),
            equalTo<Boolean>(false),
        )
    }
}
