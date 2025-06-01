package g3501_3600.s3568_minimum_moves_to_clean_the_classroom

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMoves() {
        assertThat<Int>(
            Solution().minMoves(arrayOf<String>("S.", "XL"), 2),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minMoves2() {
        assertThat<Int>(
            Solution().minMoves(arrayOf<String>("LS", "RL"), 4),
            equalTo<Int>(3),
        )
    }

    @Test
    fun minMoves3() {
        assertThat<Int>(
            Solution().minMoves(arrayOf<String>("L.S", "RXL"), 3),
            equalTo<Int>(-1),
        )
    }
}
