package g2201_2300.s2218_maximum_value_of_k_coins_from_piles

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxValueOfCoins() {
        assertThat(
            Solution()
                .maxValueOfCoins(
                    listOf(mutableListOf(1, 100, 3), mutableListOf(7, 8, 9)), 2
                ),
            equalTo(101)
        )
    }

    @Test
    fun maxValueOfCoins2() {
        assertThat(
            Solution()
                .maxValueOfCoins(
                    listOf(
                        listOf(100),
                        listOf(100),
                        listOf(100),
                        listOf(100),
                        listOf(100),
                        listOf(100),
                        mutableListOf(1, 1, 1, 1, 1, 1, 700)
                    ),
                    7
                ),
            equalTo(706)
        )
    }
}
