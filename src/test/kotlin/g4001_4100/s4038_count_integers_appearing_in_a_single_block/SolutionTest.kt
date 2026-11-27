package g4001_4100.s4038_count_integers_appearing_in_a_single_block

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSpecialIntegers() {
        assertThat<Int>(
            Solution().countSpecialIntegers(intArrayOf(1, 1, 2, 3, 2, 4)),
            equalTo<Int>(3),
        )
    }

    @Test
    fun countSpecialIntegers2() {
        assertThat<Int>(
            Solution().countSpecialIntegers(intArrayOf(7, 7, 7)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun countSpecialIntegers3() {
        assertThat<Int>(Solution().countSpecialIntegers(intArrayOf()), equalTo<Int>(0))
    }
}
