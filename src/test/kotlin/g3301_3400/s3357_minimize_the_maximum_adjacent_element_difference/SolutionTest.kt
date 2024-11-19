package g3301_3400.s3357_minimize_the_maximum_adjacent_element_difference

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDifference() {
        assertThat<Int>(
            Solution().minDifference(intArrayOf(1, 2, -1, 10, 8)),
            equalTo<Int>(4)
        )
    }

    @Test
    fun minDifference2() {
        assertThat<Int>(Solution().minDifference(intArrayOf(-1, -1, -1)), equalTo<Int>(0))
    }

    @Test
    fun minDifference3() {
        assertThat<Int>(
            Solution().minDifference(intArrayOf(-1, 10, -1, 8)),
            equalTo<Int>(1)
        )
    }

    @Test
    fun minDifference4() {
        assertThat<Int>(
            Solution().minDifference(intArrayOf(14, -1, -1, 46)),
            equalTo<Int>(11)
        )
    }
}
