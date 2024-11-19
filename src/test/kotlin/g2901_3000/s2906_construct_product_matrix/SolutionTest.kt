package g2901_3000.s2906_construct_product_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun constructProductMatrix() {
        assertThat(
            Solution().constructProductMatrix(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))),
            equalTo(arrayOf(intArrayOf(24, 12), intArrayOf(8, 6))),
        )
    }

    @Test
    fun constructProductMatrix2() {
        assertThat(
            Solution().constructProductMatrix(arrayOf(intArrayOf(12345), intArrayOf(2), intArrayOf(1))),
            equalTo(arrayOf(intArrayOf(2), intArrayOf(0), intArrayOf(0))),
        )
    }
}
