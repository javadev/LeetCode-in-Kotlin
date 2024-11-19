package g2001_2100.s2032_two_out_of_three

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun twoOutOfThree() {
        assertThat(
            Solution()
                .twoOutOfThree(intArrayOf(1, 1, 3, 2), intArrayOf(2, 3), intArrayOf(3)),
            equalTo(mutableListOf(2, 3)),
        )
    }

    @Test
    fun twoOutOfThree2() {
        assertThat(
            Solution().twoOutOfThree(intArrayOf(3, 1), intArrayOf(2, 3), intArrayOf(1, 2)),
            equalTo(mutableListOf(1, 2, 3)),
        )
    }

    @Test
    fun twoOutOfThree3() {
        assertThat(
            Solution()
                .twoOutOfThree(intArrayOf(1, 2, 2), intArrayOf(4, 3, 3), intArrayOf(5)),
            equalTo(emptyList<Any>()),
        )
    }
}
