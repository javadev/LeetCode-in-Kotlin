package g4001_4100.s4024_nearest_available_drone

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nearestDrone() {
        assertThat<Int>(
            Solution().nearestDrone(arrayOf<IntArray>(intArrayOf(1, 2, 3), intArrayOf(2, 2, 2)), intArrayOf(0, 0)),
            equalTo<Int>(0),
        )
    }

    @Test
    fun nearestDrone2() {
        assertThat<Int>(
            Solution().nearestDrone(arrayOf<IntArray>(intArrayOf(1, 0, 1), intArrayOf(-1, 0, 1)), intArrayOf(0, 0)),
            equalTo<Int>(0),
        )
    }

    @Test
    fun nearestDrone3() {
        assertThat<Int>(
            Solution().nearestDrone(arrayOf<IntArray>(intArrayOf(3, 0, 2), intArrayOf(0, 4, 3)), intArrayOf(0, 0)),
            equalTo<Int>(-1),
        )
    }
}
