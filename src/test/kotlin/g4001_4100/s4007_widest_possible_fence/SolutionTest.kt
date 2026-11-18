package g4001_4100.s4007_widest_possible_fence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumWidth() {
        assertThat<Int>(
            Solution().maximumWidth(intArrayOf(1, 3, 2, 5, 7, 5, 4, 2, 1)),
            equalTo<Int>(4),
        )
    }

    @Test
    fun maximumWidth2() {
        assertThat<Int>(Solution().maximumWidth(intArrayOf(2, 3, 7)), equalTo<Int>(1))
    }
}
