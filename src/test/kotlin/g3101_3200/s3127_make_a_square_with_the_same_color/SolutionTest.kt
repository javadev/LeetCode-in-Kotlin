package g3101_3200.s3127_make_a_square_with_the_same_color

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canMakeSquare() {
        assertThat(
            Solution()
                .canMakeSquare(
                    arrayOf(charArrayOf('B', 'W', 'B'), charArrayOf('B', 'W', 'W'), charArrayOf('B', 'W', 'B'))
                ),
            equalTo(true)
        )
    }

    @Test
    fun canMakeSquare2() {
        assertThat(
            Solution()
                .canMakeSquare(
                    arrayOf(charArrayOf('B', 'W', 'B'), charArrayOf('W', 'B', 'W'), charArrayOf('B', 'W', 'B'))
                ),
            equalTo(false)
        )
    }

    @Test
    fun canMakeSquare3() {
        assertThat(
            Solution()
                .canMakeSquare(
                    arrayOf(charArrayOf('B', 'W', 'B'), charArrayOf('B', 'W', 'W'), charArrayOf('B', 'W', 'W'))
                ),
            equalTo(true)
        )
    }
}
