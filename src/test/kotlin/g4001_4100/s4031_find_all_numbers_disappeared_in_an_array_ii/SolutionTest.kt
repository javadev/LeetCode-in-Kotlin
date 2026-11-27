package g4001_4100.s4031_find_all_numbers_disappeared_in_an_array_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findDisappearedNumbers() {
        assertThat<MutableList<MutableList<Int>>>(
            Solution().findDisappearedNumbers(intArrayOf(2, 3, 7, 2), 1, 8),
            equalTo<MutableList<MutableList<Int>>>(
                mutableListOf<MutableList<Int>>(
                    mutableListOf<Int>(1, 1),
                    mutableListOf<Int>(4, 6),
                    mutableListOf<Int>(8, 8),
                ),
            ),
        )
    }

    @Test
    fun findDisappearedNumbers2() {
        assertThat<MutableList<MutableList<Int>>>(
            Solution().findDisappearedNumbers(intArrayOf(1, 2, 3), 1, 3),
            equalTo<MutableList<out Any>>(mutableListOf<Any>()),
        )
    }

    @Test
    fun findDisappearedNumbers3() {
        assertThat<MutableList<MutableList<Int>>>(
            Solution().findDisappearedNumbers(intArrayOf(), 4, 6),
            equalTo<MutableList<MutableList<Int>>>(
                mutableListOf<MutableList<Int>>(
                    mutableListOf<Int>(
                        4,
                        6,
                    ),
                ),
            ),
        )
    }
}
