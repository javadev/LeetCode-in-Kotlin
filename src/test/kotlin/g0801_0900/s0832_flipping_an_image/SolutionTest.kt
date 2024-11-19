package g0801_0900.s0832_flipping_an_image

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun flipAndInvertImage() {
        assertThat(
            Solution().flipAndInvertImage(arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 0, 1), intArrayOf(0, 0, 0))),
            equalTo(arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 1, 1))),
        )
    }

    @Test
    fun flipAndInvertImage2() {
        assertThat(
            Solution()
                .flipAndInvertImage(
                    arrayOf(
                        intArrayOf(1, 1, 0, 0),
                        intArrayOf(1, 0, 0, 1),
                        intArrayOf(0, 1, 1, 1),
                        intArrayOf(1, 0, 1, 0),
                    ),
                ),
            equalTo(
                arrayOf(
                    intArrayOf(1, 1, 0, 0),
                    intArrayOf(0, 1, 1, 0),
                    intArrayOf(0, 0, 0, 1),
                    intArrayOf(1, 0, 1, 0),
                ),
            ),
        )
    }
}
