package g1601_1700.s1691_maximum_height_by_stacking_cuboids

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxHeight() {
        assertThat(
            Solution().maxHeight(arrayOf(intArrayOf(50, 45, 20), intArrayOf(95, 37, 53), intArrayOf(45, 23, 12))),
            equalTo(190)
        )
    }

    @Test
    fun maxHeight2() {
        assertThat(Solution().maxHeight(arrayOf(intArrayOf(38, 25, 45), intArrayOf(76, 35, 3))), equalTo(76))
    }

    @Test
    fun maxHeight3() {
        assertThat(
            Solution()
                .maxHeight(
                    arrayOf(
                        intArrayOf(7, 11, 17), intArrayOf(7, 17, 11),
                        intArrayOf(11, 7, 17), intArrayOf(11, 17, 7),
                        intArrayOf(17, 7, 11), intArrayOf(17, 11, 7)
                    )
                ),
            equalTo(102)
        )
    }
}
