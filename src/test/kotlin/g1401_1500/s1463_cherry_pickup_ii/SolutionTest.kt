package g1401_1500.s1463_cherry_pickup_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun cherryPickup() {
        assertThat(
            Solution()
                .cherryPickup(
                    arrayOf(
                        intArrayOf(3, 1, 1),
                        intArrayOf(2, 5, 1),
                        intArrayOf(1, 5, 5),
                        intArrayOf(2, 1, 1),
                    ),
                ),
            equalTo(24),
        )
    }

    @Test
    fun cherryPickup2() {
        assertThat(
            Solution()
                .cherryPickup(
                    arrayOf(
                        intArrayOf(1, 0, 0, 0, 0, 0, 1),
                        intArrayOf(2, 0, 0, 0, 0, 3, 0),
                        intArrayOf(2, 0, 9, 0, 0, 0, 0),
                        intArrayOf(0, 3, 0, 5, 4, 0, 0),
                        intArrayOf(1, 0, 2, 3, 0, 0, 6),
                    ),
                ),
            equalTo(28),
        )
    }
}
