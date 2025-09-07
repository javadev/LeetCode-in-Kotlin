package g3601_3700.s3668_restore_finishing_order

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun recoverOrder() {
        assertThat<IntArray>(
            Solution().recoverOrder(intArrayOf(3, 1, 2, 5, 4), intArrayOf(1, 3, 4)),
            equalTo<IntArray>(intArrayOf(3, 1, 4)),
        )
    }

    @Test
    fun recoverOrder2() {
        assertThat<IntArray>(
            Solution().recoverOrder(intArrayOf(1, 4, 5, 3, 2), intArrayOf(2, 5)),
            equalTo<IntArray>(intArrayOf(5, 2)),
        )
    }
}
