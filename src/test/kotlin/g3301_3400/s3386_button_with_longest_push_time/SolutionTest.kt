package g3301_3400.s3386_button_with_longest_push_time

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun buttonWithLongestTime() {
        assertThat<Int>(
            Solution().buttonWithLongestTime(
                arrayOf<IntArray>(
                    intArrayOf(1, 2),
                    intArrayOf(2, 5),
                    intArrayOf(3, 9),
                    intArrayOf(1, 15),
                ),
            ),
            equalTo<Int>(1),
        )
    }

    @Test
    fun buttonWithLongestTime2() {
        assertThat<Int>(
            Solution().buttonWithLongestTime(arrayOf<IntArray>(intArrayOf(10, 5), intArrayOf(1, 7))),
            equalTo<Int>(10),
        )
    }
}
