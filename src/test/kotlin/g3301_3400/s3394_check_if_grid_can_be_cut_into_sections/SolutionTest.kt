package g3301_3400.s3394_check_if_grid_can_be_cut_into_sections

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkValidCuts() {
        assertThat<Boolean>(
            Solution()
                .checkValidCuts(
                    5,
                    arrayOf<IntArray>(
                        intArrayOf(1, 0, 5, 2),
                        intArrayOf(0, 2, 2, 4),
                        intArrayOf(3, 2, 5, 3),
                        intArrayOf(0, 4, 4, 5),
                    ),
                ),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun checkValidCuts2() {
        assertThat<Boolean>(
            Solution()
                .checkValidCuts(
                    4,
                    arrayOf<IntArray>(
                        intArrayOf(0, 0, 1, 1),
                        intArrayOf(2, 0, 3, 4),
                        intArrayOf(0, 2, 2, 3),
                        intArrayOf(3, 0, 4, 3),
                    ),
                ),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun checkValidCuts3() {
        assertThat<Boolean>(
            Solution()
                .checkValidCuts(
                    4,
                    arrayOf<IntArray>(
                        intArrayOf(0, 2, 2, 4),
                        intArrayOf(1, 0, 3, 2),
                        intArrayOf(2, 2, 3, 4),
                        intArrayOf(3, 0, 4, 2),
                        intArrayOf(3, 2, 4, 4),
                    ),
                ),
            equalTo<Boolean>(false),
        )
    }
}
