package g1701_1800.s1764_form_array_by_concatenating_subarrays_of_another_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canChoose() {
        assertThat(
            Solution()
                .canChoose(
                    arrayOf(intArrayOf(1, -1, -1), intArrayOf(3, -2, 0)),
                    intArrayOf(1, -1, 0, 1, -1, -1, 3, -2, 0),
                ),
            equalTo(true),
        )
    }

    @Test
    fun canChoose2() {
        assertThat(
            Solution()
                .canChoose(
                    arrayOf(intArrayOf(10, -2), intArrayOf(1, 2, 3, 4)),
                    intArrayOf(1, 2, 3, 4, 10, -2),
                ),
            equalTo(false),
        )
    }

    @Test
    fun canChoose3() {
        assertThat(
            Solution()
                .canChoose(arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 4)), intArrayOf(7, 7, 1, 2, 3, 4, 7, 7)),
            equalTo(false),
        )
    }
}
