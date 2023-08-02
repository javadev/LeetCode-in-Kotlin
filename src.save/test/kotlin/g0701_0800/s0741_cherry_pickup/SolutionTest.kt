package g0701_0800.s0741_cherry_pickup

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun cherryPickup() {
        assertThat(
            Solution().cherryPickup(arrayOf(intArrayOf(0, 1, -1), intArrayOf(1, 0, -1), intArrayOf(1, 1, 1))),
            equalTo(5)
        )
    }

    @Test
    fun cherryPickup2() {
        assertThat(
            Solution().cherryPickup(arrayOf(intArrayOf(1, 1, -1), intArrayOf(1, -1, 1), intArrayOf(-1, 1, 1))),
            equalTo(0)
        )
    }
}
