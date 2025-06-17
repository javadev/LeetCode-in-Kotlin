package g3501_3600.s3584_maximum_product_of_first_and_last_elements_of_a_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumProduct() {
        assertThat<Long>(
            Solution().maximumProduct(intArrayOf(-1, -9, 2, 3, -2, -3, 1), 1),
            equalTo<Long>(81L),
        )
    }

    @Test
    fun maximumProduct2() {
        assertThat<Long>(
            Solution().maximumProduct(intArrayOf(1, 3, -5, 5, 6, -4), 3),
            equalTo<Long>(20L),
        )
    }

    @Test
    fun maximumProduct3() {
        assertThat<Long>(
            Solution().maximumProduct(intArrayOf(2, -1, 2, -6, 5, 2, -5, 7), 2),
            equalTo<Long>(35L),
        )
    }
}
