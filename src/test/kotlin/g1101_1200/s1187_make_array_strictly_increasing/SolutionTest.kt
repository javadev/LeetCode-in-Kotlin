package g1101_1200.s1187_make_array_strictly_increasing

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeArrayIncreasing() {
        assertThat(
            Solution()
                .makeArrayIncreasing(intArrayOf(1, 5, 3, 6, 7), intArrayOf(1, 3, 2, 4)),
            equalTo(1),
        )
    }

    @Test
    fun makeArrayIncreasing2() {
        assertThat(
            Solution().makeArrayIncreasing(intArrayOf(1, 5, 3, 6, 7), intArrayOf(4, 3, 1)),
            equalTo(2),
        )
    }

    @Test
    fun makeArrayIncreasing3() {
        assertThat(
            Solution()
                .makeArrayIncreasing(intArrayOf(1, 5, 3, 6, 7), intArrayOf(1, 6, 3, 3)),
            equalTo(-1),
        )
    }
}
