package g1101_1200.s1187_make_array_strictly_increasing

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeArrayIncreasing() {
        MatcherAssert.assertThat(
            Solution()
                .makeArrayIncreasing(intArrayOf(1, 5, 3, 6, 7), intArrayOf(1, 3, 2, 4)),
            CoreMatchers.equalTo(1)
        )
    }

    @Test
    fun makeArrayIncreasing2() {
        MatcherAssert.assertThat(
            Solution().makeArrayIncreasing(intArrayOf(1, 5, 3, 6, 7), intArrayOf(4, 3, 1)),
            CoreMatchers.equalTo(2)
        )
    }

    @Test
    fun makeArrayIncreasing3() {
        MatcherAssert.assertThat(
            Solution()
                .makeArrayIncreasing(intArrayOf(1, 5, 3, 6, 7), intArrayOf(1, 6, 3, 3)),
            CoreMatchers.equalTo(-1)
        )
    }
}
