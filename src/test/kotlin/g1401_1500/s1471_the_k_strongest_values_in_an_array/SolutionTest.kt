package g1401_1500.s1471_the_k_strongest_values_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val strongest: Unit
        get() {
            assertThat(
                Solution().getStrongest(intArrayOf(1, 2, 3, 4, 5), 2),
                equalTo(intArrayOf(5, 1))
            )
        }

    @get:Test
    val strongest2: Unit
        get() {
            assertThat(
                Solution().getStrongest(intArrayOf(1, 1, 3, 5, 5), 2),
                equalTo(intArrayOf(5, 5))
            )
        }

    @get:Test
    val strongest3: Unit
        get() {
            assertThat(
                Solution().getStrongest(intArrayOf(6, 7, 11, 7, 6, 8), 5),
                equalTo(intArrayOf(11, 8, 6, 6, 7))
            )
        }
}
