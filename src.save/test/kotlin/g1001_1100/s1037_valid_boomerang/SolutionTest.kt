package g1001_1100.s1037_valid_boomerang

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isBoomerang() {
        assertThat(Solution().isBoomerang(arrayOf(intArrayOf(1, 1), intArrayOf(2, 3), intArrayOf(3, 2))), equalTo(true))
    }

    @Test
    fun isBoomerang2() {
        assertThat(
            Solution().isBoomerang(arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(3, 3))), equalTo(false)
        )
    }
}
