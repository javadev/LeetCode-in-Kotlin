package g0001_0100.s0057_insert_interval

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun insert() {
        assertThat(
            Solution().insert(arrayOf(intArrayOf(1, 3), intArrayOf(6, 9)), intArrayOf(2, 5)),
            equalTo(arrayOf(intArrayOf(1, 5), intArrayOf(6, 9))),
        )
    }

    @Test
    fun insert2() {
        assertThat(
            Solution()
                .insert(
                    arrayOf(
                        intArrayOf(1, 2),
                        intArrayOf(3, 5),
                        intArrayOf(6, 7),
                        intArrayOf(8, 10),
                        intArrayOf(12, 16),
                    ),
                    intArrayOf(4, 8),
                ),
            equalTo(arrayOf(intArrayOf(1, 2), intArrayOf(3, 10), intArrayOf(12, 16))),
        )
    }
}
