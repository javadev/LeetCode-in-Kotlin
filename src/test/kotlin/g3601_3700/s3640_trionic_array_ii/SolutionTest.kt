package g3601_3700.s3640_trionic_array_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSumTrionic() {
        assertThat<Long>(
            Solution().maxSumTrionic(intArrayOf(0, -2, -1, -3, 0, 2, -1)),
            equalTo<Long>(-4L),
        )
    }

    @Test
    fun maxSumTrionic2() {
        assertThat<Long>(
            Solution().maxSumTrionic(intArrayOf(1, 4, 2, 7)),
            equalTo<Long>(14L),
        )
    }
}
