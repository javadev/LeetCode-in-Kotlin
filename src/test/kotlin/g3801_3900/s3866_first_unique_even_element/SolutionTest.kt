package g3801_3900.s3866_first_unique_even_element

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun firstUniqueEven() {
        assertThat<Int>(
            Solution().firstUniqueEven(intArrayOf(3, 4, 2, 5, 4, 6)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun firstUniqueEven2() {
        assertThat<Int>(Solution().firstUniqueEven(intArrayOf(4, 4)), equalTo<Int>(-1))
    }

    @Test
    fun firstUniqueEven3() {
        assertThat<Int>(
            Solution().firstUniqueEven(intArrayOf(2, 3, 2, 4)),
            equalTo<Int>(4),
        )
    }
}
