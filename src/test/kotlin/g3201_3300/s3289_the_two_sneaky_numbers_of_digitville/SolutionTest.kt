package g3201_3300.s3289_the_two_sneaky_numbers_of_digitville

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun getSneakyNumbers() {
        assertThat<IntArray?>(
            Solution().getSneakyNumbers(intArrayOf(0, 1, 1, 0)),
            equalTo<IntArray?>(intArrayOf(0, 1)),
        )
    }

    @Test
    fun getSneakyNumbers2() {
        assertThat<IntArray?>(
            Solution().getSneakyNumbers(intArrayOf(0, 3, 2, 1, 3, 2)),
            equalTo<IntArray?>(intArrayOf(2, 3)),
        )
    }

    @Test
    fun getSneakyNumbers3() {
        assertThat<IntArray?>(
            Solution().getSneakyNumbers(intArrayOf(7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2)),
            equalTo<IntArray?>(intArrayOf(4, 5)),
        )
    }
}
