package g1501_1600.s1557_minimum_number_of_vertices_to_reach_all_nodes

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findSmallestSetOfVertices() {
        MatcherAssert.assertThat(
            Solution()
                .findSmallestSetOfVertices(
                    6,
                    listOf(
                        mutableListOf<Int?>(0, 1),
                        mutableListOf<Int?>(0, 2),
                        mutableListOf<Int?>(2, 5),
                        mutableListOf<Int?>(3, 4),
                        mutableListOf<Int?>(4, 2)
                    )
                ),
            CoreMatchers.equalTo(mutableListOf(0, 3))
        )
    }

    @Test
    fun findSmallestSetOfVertices2() {
        MatcherAssert.assertThat(
            Solution()
                .findSmallestSetOfVertices(
                    5,
                    listOf(
                        mutableListOf<Int?>(0, 1),
                        mutableListOf<Int?>(2, 1),
                        mutableListOf<Int?>(3, 1),
                        mutableListOf<Int?>(1, 4),
                        mutableListOf<Int?>(2, 4)
                    )
                ),
            CoreMatchers.equalTo(mutableListOf(0, 2, 3))
        )
    }
}
