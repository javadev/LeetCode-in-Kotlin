package g3401_3500.s3405_count_the_number_of_arrays_with_k_matching_adjacent_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countGoodArrays() {
        assertThat<Int>(Solution().countGoodArrays(3, 2, 1), equalTo<Int>(4))
    }

    @Test
    fun countGoodArrays2() {
        assertThat<Int>(Solution().countGoodArrays(4, 2, 2), equalTo<Int>(6))
    }

    @Test
    fun countGoodArrays3() {
        assertThat<Int>(Solution().countGoodArrays(5, 2, 0), equalTo<Int>(2))
    }
}
