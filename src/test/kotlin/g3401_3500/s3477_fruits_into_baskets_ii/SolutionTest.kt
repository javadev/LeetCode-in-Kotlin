package g3401_3500.s3477_fruits_into_baskets_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numOfUnplacedFruits() {
        assertThat<Int>(
            Solution().numOfUnplacedFruits(intArrayOf(4, 2, 5), intArrayOf(3, 5, 4)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun numOfUnplacedFruits2() {
        assertThat<Int>(
            Solution().numOfUnplacedFruits(intArrayOf(3, 6, 1), intArrayOf(6, 4, 7)),
            equalTo<Int>(0),
        )
    }
}
