package g0301_0400.s0355_design_twitter

// #Medium #Hash_Table #Design #Heap_Priority_Queue #Linked_List
// #2022_11_19_Time_288_ms_(68.75%)_Space_36.6_MB_(87.50%)

class Twitter {
    // userId --> user followers
    private val twitterData: MutableMap<Int, HashSet<Int>>

    // head of linked list that stores all the tweets
    private val head: Tweet

    private class Tweet internal constructor(var userId: Int, var tweetId: Int) {
        var next: Tweet? = null
    }

    init {
        head = Tweet(-1, -1)
        twitterData = HashMap()
    }

    fun postTweet(userId: Int, tweetId: Int) {
        checkNewUser(userId)
        val t = Tweet(userId, tweetId)
        val next = head.next
        head.next = t
        t.next = next
    }

    fun getNewsFeed(userId: Int): List<Int> {
        checkNewUser(userId)
        val res: MutableList<Int> = ArrayList()
        val followers = twitterData[userId]!!
        var t = head.next
        while (t != null && res.size < 10) {
            if (followers.contains(t.userId)) {
                res.add(t.tweetId)
            }
            t = t.next
        }
        return res
    }

    fun follow(followerId: Int, followeeId: Int) {
        checkNewUser(followeeId)
        checkNewUser(followerId)
        twitterData[followerId]!!.add(followeeId)
    }

    fun unfollow(followerId: Int, followeeId: Int) {
        checkNewUser(followeeId)
        // cannot unfollower yourself
        if (followerId == followeeId) {
            return
        }
        checkNewUser(followerId)
        twitterData[followerId]!!.remove(followeeId)
    }

    fun checkNewUser(userId: Int) {
        if (twitterData.containsKey(userId)) {
            return
        }
        twitterData[userId] = HashSet()
        // follow  yourself
        twitterData[userId]!!.add(userId)
    }
}

/*
 * Your Twitter object will be instantiated and called as such:
 * var obj = Twitter()
 * obj.postTweet(userId,tweetId)
 * var param_2 = obj.getNewsFeed(userId)
 * obj.follow(followerId,followeeId)
 * obj.unfollow(followerId,followeeId)
 */
