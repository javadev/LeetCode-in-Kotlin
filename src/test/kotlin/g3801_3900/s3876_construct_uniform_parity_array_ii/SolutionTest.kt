package g3801_3900.s3876_construct_uniform_parity_array_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun uniformArray() {
        assertThat<Boolean>(
            Solution().uniformArray(intArrayOf(1, 4, 7)),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun uniformArray2() {
        assertThat<Boolean>(
            Solution().uniformArray(intArrayOf(2, 3)),
            equalTo<Boolean>(false),
        )
    }

    @Test
    fun uniformArray3() {
        assertThat<Boolean>(
            Solution().uniformArray(intArrayOf(4, 6)),
            equalTo<Boolean>(true),
        )
    }
}
