package g3201_3300.s3285_find_indices_of_stable_mountains

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun stableMountains() {
        assertThat<List<Int>>(
            Solution().stableMountains(intArrayOf(1, 2, 3, 4, 5), 2),
            equalTo<List<Int>>(listOf<Int>(3, 4)),
        )
    }

    @Test
    fun stableMountains2() {
        assertThat<List<Int>>(
            Solution().stableMountains(intArrayOf(10, 1, 10, 1, 10), 3),
            equalTo<List<Int>>(listOf<Int>(1, 3)),
        )
    }

    @Test
    fun stableMountains3() {
        assertThat<List<Int>>(
            Solution().stableMountains(intArrayOf(10, 1, 10, 1, 10), 10),
            equalTo<List<Int>>(listOf<Int>()),
        )
    }
}
