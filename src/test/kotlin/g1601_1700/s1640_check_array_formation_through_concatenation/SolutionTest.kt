package g1601_1700.s1640_check_array_formation_through_concatenation

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canFormArray() {
        MatcherAssert.assertThat(
            Solution().canFormArray(intArrayOf(15, 88), arrayOf(intArrayOf(88), intArrayOf(15))),
            CoreMatchers.equalTo(true)
        )
    }

    @Test
    fun canFormArray2() {
        MatcherAssert.assertThat(
            Solution().canFormArray(intArrayOf(49, 18, 16), arrayOf(intArrayOf(16, 18, 49))),
            CoreMatchers.equalTo(false)
        )
    }

    @Test
    fun canFormArray3() {
        MatcherAssert.assertThat(
            Solution()
                .canFormArray(intArrayOf(91, 4, 64, 78), arrayOf(intArrayOf(78), intArrayOf(4, 64), intArrayOf(91))),
            CoreMatchers.equalTo(true)
        )
    }
}
