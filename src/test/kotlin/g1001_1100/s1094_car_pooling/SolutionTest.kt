package g1001_1100.s1094_car_pooling

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun carPooling() {
        assertThat(
            Solution().carPooling(arrayOf(intArrayOf(2, 1, 5), intArrayOf(3, 3, 7)), 4), equalTo(false)
        )
    }

    @Test
    fun carPooling2() {
        assertThat(Solution().carPooling(arrayOf(intArrayOf(2, 1, 5), intArrayOf(3, 3, 7)), 5), equalTo(true))
    }
}
