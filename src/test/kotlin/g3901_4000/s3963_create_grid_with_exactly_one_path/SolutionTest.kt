package g3901_4000.s3963_create_grid_with_exactly_one_path

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun createGrid() {
        assertThat<Array<String>>(
            Solution().createGrid(2, 3),
            equalTo<Array<String>>(arrayOf<String>("...", "##.")),
        )
    }

    @Test
    fun createGrid2() {
        assertThat<Array<String>>(
            Solution().createGrid(3, 3),
            equalTo<Array<String>>(arrayOf<String>("...", "##.", "##.")),
        )
    }

    @Test
    fun createGrid3() {
        assertThat<Array<String>>(
            Solution().createGrid(1, 4),
            equalTo<Array<String>>(arrayOf<String>("....")),
        )
    }

    @Test
    fun createGrid4() {
        assertThat<Array<String>>(
            Solution().createGrid(1, 1),
            equalTo<Array<String>>(arrayOf<String>(".")),
        )
    }
}
