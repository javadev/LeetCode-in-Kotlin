package g3901_4000.s3988_create_grid_with_exactly_k_paths_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun createGrid() {
        assertThat<Array<String>>(
            Solution().createGrid(2, 3, 2),
            equalTo<Array<String>>(arrayOf<String>("..#", "...")),
        )
    }

    @Test
    fun createGrid2() {
        assertThat<Array<String>>(
            Solution().createGrid(3, 3, 4),
            equalTo<Array<String>>(arrayOf<String>("..#", "...", "#..")),
        )
    }

    @Test
    fun createGrid3() {
        assertThat<Array<String>>(
            Solution().createGrid(1, 4, 2),
            equalTo<Array<String>>(arrayOf<String>()),
        )
    }

    @Test
    fun createGrid4() {
        assertThat<Array<String>>(
            Solution().createGrid(2, 3, 1),
            equalTo<Array<String>>(arrayOf<String>(".##", "...")),
        )
    }

    @Test
    fun createGrid5() {
        // Single cell, k = 1
        assertThat<Array<String>>(
            Solution().createGrid(1, 1, 1),
            equalTo<Array<String>>(arrayOf<String>(".")),
        )
    }

    @Test
    fun createGrid6() {
        // Single row, k = 1 -> only horizontal connection
        assertThat<Array<String>>(
            Solution().createGrid(1, 5, 1),
            equalTo<Array<String>>(arrayOf<String>(".....")),
        )
    }

    @Test
    fun createGrid7() {
        // Single column, k = 1 -> only vertical connection
        assertThat<Array<String>>(
            Solution().createGrid(4, 1, 1),
            equalTo<Array<String>>(arrayOf<String>(".", ".", ".", ".")),
        )
    }

    @Test
    fun createGrid8() {
        // k = 3, m >= 3 && n >= 2 -> dimensions {2, 1}, whole grid open
        assertThat<Array<String>>(
            Solution().createGrid(3, 2, 3),
            equalTo<Array<String>>(arrayOf<String>("..", "..", "..")),
        )
    }

    @Test
    fun createGrid9() {
        // k = 3, m < 3 but n >= 3 -> dimensions {1, 2}, whole grid open
        assertThat<Array<String>>(
            Solution().createGrid(2, 3, 3),
            equalTo<Array<String>>(arrayOf<String>("...", "...")),
        )
    }

    @Test
    fun createGrid10() {
        // k = 3 on larger grid -> dimensions {2, 1} plus connection to bottom-right
        assertThat<Array<String>>(
            Solution().createGrid(4, 4, 3),
            equalTo<Array<String>>(arrayOf<String>("..##", "..##", "..##", "#...")),
        )
    }

    @Test
    fun createGrid11() {
        // k = 3 impossible on 2x2 grid
        assertThat<Array<String>>(
            Solution().createGrid(2, 2, 3),
            equalTo<Array<String>>(arrayOf<String>()),
        )
    }

    @Test
    fun createGrid12() {
        // k = 4, m >= 4 && n >= 2 -> dimensions {3, 1}
        assertThat<Array<String>>(
            Solution().createGrid(4, 2, 4),
            equalTo<Array<String>>(arrayOf<String>("..", "..", "..", "..")),
        )
    }

    @Test
    fun createGrid13() {
        // k = 4, m < 4 but n >= 4 -> dimensions {1, 3}
        assertThat<Array<String>>(
            Solution().createGrid(2, 4, 4),
            equalTo<Array<String>>(arrayOf<String>("....", "....")),
        )
    }

    @Test
    fun createGrid14() {
        // k = 4 on 5x5 grid -> dimensions {3, 1} plus connection
        assertThat<Array<String>>(
            Solution().createGrid(5, 5, 4),
            equalTo<Array<String>>(arrayOf<String>("..###", "..###", "..###", "..###", "#....")),
        )
    }

    @Test
    fun createGrid15() {
        // k = 4 with dimensions {1, 3} and a vertical connection
        assertThat<Array<String>>(
            Solution().createGrid(3, 4, 4),
            equalTo<Array<String>>(arrayOf<String>("....", "....", "###.")),
        )
    }

    @Test
    fun createGrid16() {
        // k = 4 impossible on 2x2 grid
        assertThat<Array<String>>(
            Solution().createGrid(2, 2, 4),
            equalTo<Array<String>>(arrayOf<String>()),
        )
    }

    @Test
    fun createGrid17() {
        // k = 2 on 3x5 grid -> dimensions {1, 1} plus connection
        assertThat<Array<String>>(
            Solution().createGrid(3, 5, 2),
            equalTo<Array<String>>(arrayOf<String>("..###", "..###", "#....")),
        )
    }

    @Test
    fun createGrid18() {
        // Unsupported k (> 4)
        assertThat<Array<String>>(
            Solution().createGrid(3, 3, 5),
            equalTo<Array<String>>(arrayOf<String>()),
        )
    }

    @Test
    fun createGrid19() {
        // Unsupported k (0)
        assertThat<Array<String>>(
            Solution().createGrid(3, 3, 0),
            equalTo<Array<String>>(arrayOf<String>()),
        )
    }
}
