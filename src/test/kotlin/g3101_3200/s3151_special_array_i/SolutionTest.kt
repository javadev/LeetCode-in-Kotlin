package g3101_3200.s3151_special_array_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isArraySpecial() {
        assertThat(Solution().isArraySpecial(intArrayOf(1)), equalTo(true))
    }

    @Test
    fun isArraySpecial2() {
        assertThat(Solution().isArraySpecial(intArrayOf(2, 1, 4)), equalTo(true))
    }

    @Test
    fun isArraySpecial3() {
        assertThat(Solution().isArraySpecial(intArrayOf(4, 3, 1, 6)), equalTo(false))
    }

    @Test
    fun isArraySpecial4() {
        assertThat(Solution().isArraySpecial(intArrayOf(2, 10)), equalTo(false))
    }
}
