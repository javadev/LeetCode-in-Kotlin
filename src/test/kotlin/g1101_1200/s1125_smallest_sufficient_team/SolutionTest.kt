package g1101_1200.s1125_smallest_sufficient_team

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestSufficientTeam() {
        MatcherAssert.assertThat(
            Solution()
                .smallestSufficientTeam(
                    arrayOf("java", "nodejs", "reactjs"),
                    getLists(arrayOf(arrayOf("java"), arrayOf("nodejs"), arrayOf("nodejs", "reactjs")))
                ),
            CoreMatchers.equalTo(intArrayOf(0, 2))
        )
    }

    @Test
    fun smallestSufficientTeam2() {
        MatcherAssert.assertThat(
            Solution()
                .smallestSufficientTeam(
                    arrayOf(
                        "algorithms", "math", "java", "reactjs", "csharp", "aws"
                    ),
                    getLists(
                        arrayOf(
                            arrayOf("algorithms", "math", "java"),
                            arrayOf("algorithms", "math", "reactjs"),
                            arrayOf("java", "csharp", "aws"),
                            arrayOf("reactjs", "csharp"),
                            arrayOf("csharp", "math"),
                            arrayOf("aws", "java")
                        )
                    )
                ),
            CoreMatchers.equalTo(intArrayOf(1, 2))
        )
    }
}
