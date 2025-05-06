package g3501_3600.s3539_find_sum_of_array_product_of_magical_sequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun magicalSum() {
        assertThat<Int>(
            Solution().magicalSum(5, 5, intArrayOf(1, 10, 100, 10000, 1000000)),
            equalTo<Int>(991600007),
        )
    }

    @Test
    fun magicalSum2() {
        assertThat<Int>(
            Solution().magicalSum(2, 2, intArrayOf(5, 4, 3, 2, 1)),
            equalTo<Int>(170),
        )
    }

    @Test
    fun magicalSum3() {
        assertThat<Int>(Solution().magicalSum(1, 1, intArrayOf(28)), equalTo<Int>(28))
    }
}
