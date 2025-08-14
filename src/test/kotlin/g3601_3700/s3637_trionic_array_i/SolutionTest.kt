package g3601_3700.s3637_trionic_array_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isTrionic() {
        assertThat<Boolean>(
            Solution().isTrionic(intArrayOf(1, 3, 5, 4, 2, 6)),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun isTrionic2() {
        assertThat<Boolean>(
            Solution().isTrionic(intArrayOf(2, 1, 3)),
            equalTo<Boolean>(false),
        )
    }

    @Test
    fun isTrionic3() {
        assertThat<Boolean>(Solution().isTrionic(intArrayOf(3, 7, 1)), equalTo<Boolean>(false))
    }
}
