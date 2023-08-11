package g1601_1700.s1640_check_array_formation_through_concatenation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canFormArray() {
        assertThat(
            Solution().canFormArray(intArrayOf(15, 88), arrayOf(intArrayOf(88), intArrayOf(15))),
            equalTo(true)
        )
    }

    @Test
    fun canFormArray2() {
        assertThat(
            Solution().canFormArray(intArrayOf(49, 18, 16), arrayOf(intArrayOf(16, 18, 49))),
            equalTo(false)
        )
    }

    @Test
    fun canFormArray3() {
        assertThat(
            Solution()
                .canFormArray(intArrayOf(91, 4, 64, 78), arrayOf(intArrayOf(78), intArrayOf(4, 64), intArrayOf(91))),
            equalTo(true)
        )
    }
}
