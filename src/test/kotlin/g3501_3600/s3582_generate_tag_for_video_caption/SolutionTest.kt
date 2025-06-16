package g3501_3600.s3582_generate_tag_for_video_caption

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun generateTag() {
        assertThat<String>(
            Solution().generateTag("Leetcode daily streak achieved"),
            equalTo<String>("#leetcodeDailyStreakAchieved"),
        )
    }

    @Test
    fun generateTag2() {
        assertThat<String>(
            Solution().generateTag("can I Go There"),
            equalTo<String>("#canIGoThere"),
        )
    }

    @Test
    fun generateTag3() {
        assertThat<String>(
            Solution()
                .generateTag(
                    (
                        "hhhhhhhhhhhhhhhhhhhhh" +
                            "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" +
                            "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"
                        ),
                ),
            equalTo<String>(
                (
                    "#hhhhhhhhhhhhhhhhhhh" +
                        "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" +
                        "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"
                    ),
            ),
        )
    }
}
