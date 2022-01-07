package g0801_0900.s0864_shortest_path_to_get_all_keys

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestPathAllKeys() {
        val solution = Solution()
        assertThat(
            solution.shortestPathAllKeys(arrayOf("@.a.#", "###.#", "b.A.B")), equalTo(8)
        )
        assertThat(
            solution.shortestPathAllKeys(arrayOf("@..aA", "..B#.", "....b")), equalTo(6)
        )
        assertThat(solution.shortestPathAllKeys(arrayOf("@Aa")), equalTo(-1))
    }
}
