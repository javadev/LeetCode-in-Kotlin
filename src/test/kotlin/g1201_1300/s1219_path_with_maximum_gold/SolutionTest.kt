package g1201_1300.s1219_path_with_maximum_gold

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumGold() {
        assertThat(
            Solution().getMaximumGold(arrayOf(intArrayOf(0, 6, 0), intArrayOf(5, 8, 7), intArrayOf(0, 9, 0))),
            equalTo(24),
        )
    }

    @Test
    fun maximumGold2() {
        assertThat(
            Solution()
                .getMaximumGold(
                    arrayOf(
                        intArrayOf(1, 0, 7),
                        intArrayOf(2, 0, 6),
                        intArrayOf(3, 4, 5),
                        intArrayOf(0, 3, 0),
                        intArrayOf(9, 0, 20),
                    ),
                ),
            equalTo(28),
        )
    }
}
