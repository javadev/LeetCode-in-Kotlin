package g3601_3700.s3671_sum_of_beautiful_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun totalBeauty() {
        assertThat<Int>(Solution().totalBeauty(intArrayOf(1, 2, 3)), equalTo<Int>(10))
    }

    @Test
    fun totalBeauty2() {
        assertThat<Int>(Solution().totalBeauty(intArrayOf(4, 6)), equalTo<Int>(12))
    }
}
