package g2201_2300.s2285_maximum_total_importance_of_roads

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumImportance() {
        assertThat(
            Solution()
                .maximumImportance(
                    5,
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(1, 2),
                        intArrayOf(2, 3),
                        intArrayOf(0, 2),
                        intArrayOf(1, 3),
                        intArrayOf(2, 4)
                    )
                ),
            equalTo(43L)
        )
    }

    @Test
    fun maximumImportance2() {
        assertThat(
            Solution().maximumImportance(5, arrayOf(intArrayOf(0, 3), intArrayOf(2, 4), intArrayOf(1, 3))),
            equalTo(20L)
        )
    }
}
