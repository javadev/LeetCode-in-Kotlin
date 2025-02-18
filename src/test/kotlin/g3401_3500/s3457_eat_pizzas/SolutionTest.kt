package g3401_3500.s3457_eat_pizzas

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxWeight() {
        assertThat<Long>(
            Solution().maxWeight(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)),
            equalTo<Long>(14L),
        )
    }

    @Test
    fun maxWeight2() {
        assertThat<Long>(
            Solution().maxWeight(intArrayOf(2, 1, 1, 1, 1, 1, 1, 1)),
            equalTo<Long>(3L),
        )
    }
}
