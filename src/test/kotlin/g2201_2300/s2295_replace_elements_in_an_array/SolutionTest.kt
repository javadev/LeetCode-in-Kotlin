package g2201_2300.s2295_replace_elements_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun arrayChange() {
        assertThat(
            Solution()
                .arrayChange(intArrayOf(1, 2, 4, 6), arrayOf(intArrayOf(1, 3), intArrayOf(4, 7), intArrayOf(6, 1))),
            equalTo(intArrayOf(3, 2, 7, 1))
        )
    }

    @Test
    fun arrayChange2() {
        assertThat(
            Solution().arrayChange(intArrayOf(1, 2), arrayOf(intArrayOf(1, 3), intArrayOf(2, 1), intArrayOf(3, 2))),
            equalTo(intArrayOf(2, 1))
        )
    }
}
