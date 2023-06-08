package g1201_1300.s1233_remove_sub_folders_from_the_filesystem

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeSubfolders() {
        assertThat(
            Solution()
                .removeSubfolders(arrayOf("/a", "/a/b", "/c/d", "/c/d/e", "/c/f")),
            equalTo(mutableListOf("/a", "/c/d", "/c/f"))
        )
    }

    @Test
    fun removeSubfolders2() {
        assertThat(
            Solution().removeSubfolders(arrayOf("/a", "/a/b/c", "/a/b/d")),
            equalTo(listOf("/a"))
        )
    }

    @Test
    fun removeSubfolders3() {
        assertThat(
            Solution().removeSubfolders(arrayOf("/a/b/c", "/a/b/ca", "/a/b/d")),
            equalTo(mutableListOf("/a/b/c", "/a/b/ca", "/a/b/d"))
        )
    }
}
