package g3401_3500.s3457_eat_pizzas

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxWeight() {
        MatcherAssert.assertThat<Long>(
            Solution().maxWeight(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)),
            CoreMatchers.equalTo<Long>(14L),
        )
    }

    @Test
    fun maxWeight2() {
        MatcherAssert.assertThat<Long>(
            Solution().maxWeight(intArrayOf(2, 1, 1, 1, 1, 1, 1, 1)),
            CoreMatchers.equalTo<Long>(3L),
        )
    }
}
