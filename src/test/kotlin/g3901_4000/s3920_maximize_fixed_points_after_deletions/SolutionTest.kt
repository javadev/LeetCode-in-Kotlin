package g3901_4000.s3920_maximize_fixed_points_after_deletions

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxFixedPoints() {
        assertThat<Int>(Solution().maxFixedPoints(intArrayOf(0, 2, 1)), equalTo<Int>(2))
    }

    @Test
    fun maxFixedPoints2() {
        assertThat<Int>(Solution().maxFixedPoints(intArrayOf(3, 1, 2)), equalTo<Int>(2))
    }

    @Test
    fun maxFixedPoints3() {
        assertThat<Int>(Solution().maxFixedPoints(intArrayOf(1, 0, 1, 2)), equalTo<Int>(3))
    }

    @Test
    fun maxFixedPoints4() {
        assertThat<Int>(Solution().maxFixedPoints(intArrayOf()), equalTo<Int>(0))
    }

    @Test
    fun maxFixedPoints5() {
        assertThat<Int>(Solution().maxFixedPoints(intArrayOf(1)), equalTo<Int>(0))
    }

    @Test
    fun maxFixedPoints6() {
        assertThat<Int>(Solution().maxFixedPoints(intArrayOf(0)), equalTo<Int>(1))
    }

    @Test
    fun maxFixedPoints7() {
        assertThat<Int>(Solution().maxFixedPoints(intArrayOf(5, 5, 5)), equalTo<Int>(0))
    }

    @Test
    fun maxFixedPoints8() {
        assertThat<Int>(Solution().maxFixedPoints(intArrayOf(0, 0, 0, 0)), equalTo<Int>(1))
    }

    @Test
    fun maxFixedPoints9() {
        assertThat<Int>(
            Solution().maxFixedPoints(intArrayOf(0, 1, 2, 3, 4)),
            equalTo<Int>(5),
        )
    }

    @Test
    fun maxFixedPoints10() {
        assertThat<Int>(
            Solution().maxFixedPoints(intArrayOf(0, 0, 1, 2, 3)),
            equalTo<Int>(4),
        )
    }

    @Test
    fun maxFixedPoints11() {
        assertThat<Int>(Solution().maxFixedPoints(intArrayOf(0, 2, 2, 3)), equalTo<Int>(3))
    }

    @Test
    fun maxFixedPoints12() {
        assertThat<Int>(Solution().maxFixedPoints(intArrayOf(0, 3, 1, 2)), equalTo<Int>(3))
    }

    @Test
    fun maxFixedPoints13() {
        assertThat<Int>(Solution().maxFixedPoints(intArrayOf(0, 3, 2, 1)), equalTo<Int>(2))
    }

    @Test
    fun maxFixedPoints14() {
        assertThat<Int>(
            Solution().maxFixedPoints(intArrayOf(0, 1, 0, 1, 2)),
            equalTo<Int>(3),
        )
    }

    @Test
    fun maxFixedPoints15() {
        assertThat<Int>(
            Solution().maxFixedPoints(intArrayOf(0, 2, 1, 0, 3)),
            equalTo<Int>(3),
        )
    }

    @Test
    fun maxFixedPoints16() {
        assertThat<Int>(
            Solution().maxFixedPoints(intArrayOf(0, 4, 1, 2, 3)),
            equalTo<Int>(4),
        )
    }

    @Test
    fun maxFixedPoints17() {
        assertThat<Int>(
            Solution().maxFixedPoints(intArrayOf(0, 5, 4, 3, 2, 1)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun maxFixedPoints18() {
        assertThat<Int>(
            Solution().maxFixedPoints(intArrayOf(0, 2, 3, 1, 4)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun maxFixedPoints19() {
        assertThat<Int>(
            Solution().maxFixedPoints(intArrayOf(0, 1, 3, 2, 4)),
            equalTo<Int>(3),
        )
    }

    @Test
    fun maxFixedPoints20() {
        assertThat<Int>(
            Solution().maxFixedPoints(intArrayOf(0, 2, 1, 4, 3, 5)),
            equalTo<Int>(3),
        )
    }
}
