package g3201_3300.s3235_check_if_the_rectangle_corner_is_reachable

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canReachCorner() {
        assertThat(
            Solution().canReachCorner(3, 4, arrayOf(intArrayOf(2, 1, 1))),
            equalTo(true)
        )
    }

    @Test
    fun canReachCorner2() {
        assertThat(
            Solution().canReachCorner(3, 3, arrayOf(intArrayOf(1, 1, 2))),
            equalTo(false)
        )
    }

    @Test
    fun canReachCorner3() {
        assertThat(
            Solution().canReachCorner(3, 3, arrayOf(intArrayOf(2, 1, 1), intArrayOf(1, 2, 1))),
            equalTo(false)
        )
    }

    @Test
    fun canReachCorner4() {
        assertThat(
            Solution().canReachCorner(4, 4, arrayOf(intArrayOf(5, 5, 1))),
            equalTo(true)
        )
    }
}
