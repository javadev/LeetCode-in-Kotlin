package g3601_3700.s3688_bitwise_or_of_even_numbers_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun evenNumberBitwiseORs() {
        assertThat<Int>(
            Solution().evenNumberBitwiseORs(intArrayOf(1, 2, 3, 4, 5, 6)),
            equalTo<Int>(6),
        )
    }

    @Test
    fun evenNumberBitwiseORs2() {
        assertThat<Int>(
            Solution().evenNumberBitwiseORs(intArrayOf(7, 9, 11)),
            equalTo<Int>(0),
        )
    }
}
