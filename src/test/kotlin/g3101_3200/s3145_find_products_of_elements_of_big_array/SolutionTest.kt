package g3101_3200.s3145_find_products_of_elements_of_big_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findProductsOfElements() {
        assertThat(
            Solution().findProductsOfElements(arrayOf(longArrayOf(1, 3, 7))),
            equalTo(intArrayOf(4)),
        )
    }

    @Test
    fun findProductsOfElements2() {
        assertThat(
            Solution().findProductsOfElements(arrayOf(longArrayOf(2, 5, 3), longArrayOf(7, 7, 4))),
            equalTo(intArrayOf(2, 2)),
        )
    }
}
