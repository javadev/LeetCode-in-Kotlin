package g3401_3500.s3479_fruits_into_baskets_iii

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

    @Test
    fun numOfUnplacedFruits3() {
        assertThat<Int>(
            Solution().numOfUnplacedFruits(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun numOfUnplacedFruits4() {
        assertThat<Int>(
            Solution().numOfUnplacedFruits(intArrayOf(4, 5, 6), intArrayOf(1, 2, 3)),
            equalTo<Int>(3),
        )
    }

    @Test
    fun numOfUnplacedFruits5() {
        assertThat<Int>(
            Solution().numOfUnplacedFruits(intArrayOf(1, 5, 2, 6), intArrayOf(2, 3)),
            equalTo<Int>(2),
        )
    }
}
