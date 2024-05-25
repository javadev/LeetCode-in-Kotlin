package g3101_3200.s3152_special_array_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isArraySpecial() {
        assertThat(
            Solution().isArraySpecial(intArrayOf(3, 4, 1, 2, 6), arrayOf(intArrayOf(0, 4))),
            equalTo(booleanArrayOf(false))
        )
    }

    @Test
    fun isArraySpecial2() {
        assertThat(
            Solution().isArraySpecial(intArrayOf(4, 3, 1, 6), arrayOf(intArrayOf(0, 2), intArrayOf(2, 3))),
            equalTo(booleanArrayOf(false, true))
        )
    }
}
