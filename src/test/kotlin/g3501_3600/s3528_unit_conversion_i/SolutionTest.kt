package g3501_3600.s3528_unit_conversion_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun baseUnitConversions() {
        assertThat(
            Solution().baseUnitConversions(arrayOf(intArrayOf(0, 1, 2), intArrayOf(1, 2, 3))),
            equalTo(intArrayOf(1, 2, 6)),
        )
    }

    @Test
    fun baseUnitConversions2() {
        assertThat(
            Solution()
                .baseUnitConversions(
                    arrayOf(
                        intArrayOf(0, 1, 2),
                        intArrayOf(0, 2, 3),
                        intArrayOf(1, 3, 4),
                        intArrayOf(1, 4, 5),
                        intArrayOf(2, 5, 2),
                        intArrayOf(4, 6, 3),
                        intArrayOf(5, 7, 4),
                    ),
                ),
            equalTo(intArrayOf(1, 2, 3, 8, 10, 6, 30, 24)),
        )
    }
}
