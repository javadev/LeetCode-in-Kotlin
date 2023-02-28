package g0301_0400.s0355_design_twitter

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class TwitterTest {
    @Test
    fun twitter() {
        val twitter = Twitter()
        // User 1 posts a new tweet (id = 5).
        twitter.postTweet(1, 5)
        // User 1's news feed should return a list with 1 tweet id -> [5]. return [5]
        assertThat(twitter.getNewsFeed(1), equalTo(listOf(5)))
        // User 1 follows user 2.
        twitter.follow(1, 2)
        // User 2 posts a new tweet (id = 6).
        twitter.postTweet(2, 6)
        assertThat(twitter.getNewsFeed(1), equalTo(listOf(6, 5)))
        // User 1's news feed should return a list with 2 tweet ids -> [6, 5]. Tweet id 6 should
        // precede tweet id 5 because it is posted after tweet id 5.
        twitter.getNewsFeed(1)
        // User 1 unfollows user 2.
        twitter.unfollow(1, 2)
        assertThat(twitter.getNewsFeed(1), equalTo(listOf(5)))
    }
}
