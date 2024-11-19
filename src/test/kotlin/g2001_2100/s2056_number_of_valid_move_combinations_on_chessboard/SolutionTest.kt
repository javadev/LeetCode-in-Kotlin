package g2001_2100.s2056_number_of_valid_move_combinations_on_chessboard

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countCombinations() {
        assertThat(
            Solution().countCombinations(arrayOf("rook"), arrayOf(intArrayOf(1, 1))),
            equalTo(15),
        )
    }

    @Test
    fun countCombinations2() {
        assertThat(
            Solution().countCombinations(arrayOf("queen"), arrayOf(intArrayOf(1, 1))),
            equalTo(22),
        )
    }

    @Test
    fun countCombinations3() {
        assertThat(
            Solution().countCombinations(arrayOf("bishop"), arrayOf(intArrayOf(4, 3))),
            equalTo(12),
        )
    }
}
