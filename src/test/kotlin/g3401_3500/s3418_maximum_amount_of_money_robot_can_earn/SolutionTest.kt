package g3401_3500.s3418_maximum_amount_of_money_robot_can_earn

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumAmount() {
        assertThat<Int>(
            Solution().maximumAmount(
                arrayOf<IntArray>(
                    intArrayOf(0, 1, -1),
                    intArrayOf(1, -2, 3),
                    intArrayOf(2, -3, 4),
                ),
            ),
            equalTo<Int>(8),
        )
    }

    @Test
    fun maximumAmount2() {
        assertThat<Int>(
            Solution().maximumAmount(arrayOf<IntArray>(intArrayOf(10, 10, 10), intArrayOf(10, 10, 10))),
            equalTo<Int>(40),
        )
    }
}
