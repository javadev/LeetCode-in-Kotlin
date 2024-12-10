package g3301_3400.s3379_transformed_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun constructTransformedArray() {
        assertThat<IntArray>(
            Solution().constructTransformedArray(intArrayOf(3, -2, 1, 1)),
            equalTo<IntArray>(intArrayOf(1, 1, 1, 3)),
        )
    }

    @Test
    fun constructTransformedArray2() {
        assertThat<IntArray>(
            Solution().constructTransformedArray(intArrayOf(-1, 4, -1)),
            equalTo<IntArray>(intArrayOf(-1, -1, 4)),
        )
    }
}
