package g1901_2000.s1948_delete_duplicate_folders_in_system

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun deleteDuplicateFolder() {
        assertThat(
            Solution()
                .deleteDuplicateFolder(
                    listOf(
                        listOf("a"),
                        listOf("c"),
                        listOf("d"),
                        mutableListOf("a", "b"),
                        mutableListOf("c", "b"),
                        mutableListOf("d", "a"),
                    ),
                ),
            equalTo(listOf(listOf("d"), mutableListOf("d", "a"))),
        )
    }

    @Test
    fun deleteDuplicateFolder2() {
        assertThat(
            Solution()
                .deleteDuplicateFolder(
                    listOf(
                        listOf("a"),
                        listOf("c"),
                        mutableListOf("a", "b"),
                        mutableListOf("c", "b"),
                        mutableListOf("a", "b", "x"),
                        mutableListOf("a", "b", "x", "y"),
                        listOf("w"),
                        mutableListOf("w", "y"),
                    ),
                ),
            equalTo(
                listOf(listOf("a"), mutableListOf("a", "b"), listOf("c"), mutableListOf("c", "b")),
            ),
        )
    }

    @Test
    fun deleteDuplicateFolder3() {
        assertThat(
            Solution()
                .deleteDuplicateFolder(
                    listOf(mutableListOf("a", "b"), mutableListOf("c", "d"), listOf("c"), listOf("a")),
                ),
            equalTo(
                listOf(listOf("a"), mutableListOf("a", "b"), listOf("c"), mutableListOf("c", "d")),
            ),
        )
    }
}
