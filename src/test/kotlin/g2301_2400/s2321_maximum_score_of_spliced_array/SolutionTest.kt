package g2301_2400.s2321_maximum_score_of_spliced_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumsSplicedArray() {
        assertThat(
            Solution().maximumsSplicedArray(intArrayOf(60, 60, 60), intArrayOf(10, 90, 10)),
            equalTo(210)
        )
    }

    @Test
    fun maximumsSplicedArray2() {
        assertThat(
            Solution()
                .maximumsSplicedArray(intArrayOf(20, 40, 20, 70, 30), intArrayOf(50, 20, 50, 40, 20)),
            equalTo(220)
        )
    }

    @Test
    fun maximumsSplicedArray3() {
        assertThat(
            Solution().maximumsSplicedArray(intArrayOf(7, 11, 13), intArrayOf(1, 1, 1)),
            equalTo(31)
        )
    }

    @Test
    fun maximumsSplicedArray4() {
        assertThat(
            Solution().maximumsSplicedArray(intArrayOf(1, 1, 1), intArrayOf(7, 11, 13)),
            equalTo(31)
        )
    }
}
