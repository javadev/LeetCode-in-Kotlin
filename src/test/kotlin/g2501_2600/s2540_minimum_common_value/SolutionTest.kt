package g2501_2600.s2540_minimum_common_value

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun common() {
        assertThat(
            Solution().getCommon(intArrayOf(1, 2, 3), intArrayOf(2, 4)),
            equalTo(2),
        )
    }

    @Test
    fun common2() {
        assertThat(
            Solution().getCommon(intArrayOf(1, 2, 3, 6), intArrayOf(2, 3, 4, 5)),
            equalTo(2),
        )
    }

    @Test
    fun common3() {
        val result = Solution().getCommon(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))
        assertThat(result, equalTo(-1))
    }

    @Test
    fun common4() {
        val result = Solution().getCommon(intArrayOf(1, 3, 5, 7), intArrayOf(0, 2, 4, 7))
        assertThat(result, equalTo(7))
    }

    @Test
    fun common5() {
        val result = Solution().getCommon(intArrayOf(2, 3, 4), intArrayOf(2, 5, 6))
        assertThat(result, equalTo(2))
    }

    @Test
    fun common6() {
        val result = Solution().getCommon(intArrayOf(5), intArrayOf(5))
        assertThat(result, equalTo(5))
    }

    @Test
    fun common7() {
        val result = Solution().getCommon(intArrayOf(5), intArrayOf(6))
        assertThat(result, equalTo(-1))
    }

    @Test
    fun common8() {
        val result = Solution().getCommon(intArrayOf(1, 2, 3, 4), intArrayOf(2, 3, 4))
        assertThat(result, equalTo(2))
    }

    @Test
    fun common9() {
        val result = Solution().getCommon(intArrayOf(1, 2), intArrayOf(100, 200))
        assertThat(result, equalTo(-1))
    }

    @Test
    fun common10() {
        val result = Solution().getCommon(intArrayOf(50, 60), intArrayOf(1, 2, 3))
        assertThat(result, equalTo(-1))
    }

    @Test
    fun common11() {
        val result = Solution().getCommon(intArrayOf(1, 2, 5), intArrayOf(3, 4, 6))
        assertThat(result, equalTo(-1))
    }
}
