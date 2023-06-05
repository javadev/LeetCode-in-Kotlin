package g1301_1400.s1311_get_watched_videos_by_your_friends

import java.util.LinkedList
import java.util.PriorityQueue
import java.util.Queue

// #Medium #Array #Hash_Table #Sorting #Breadth_First_Search
class Solution {
    internal class VideoCount(var v: String, var count: Int) {
        override fun toString(): String {
            return v + " " + count
        }
    }

    fun watchedVideosByFriends(
        watchedVideos: List<List<String>>,
        friends: Array<IntArray>,
        id: Int,
        level: Int
    ): List<String> {
        val visited = BooleanArray(watchedVideos.size)
        val queue: Queue<Int> = LinkedList()
        queue.add(id)
        visited[id] = true
        var currLevel = 0
        while (!queue.isEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val node = queue.poll()
                val nei = friends[node]
                for (i in nei) {
                    if (!visited[i]) {
                        queue.add(i)
                        visited[i] = true
                    }
                }
            }
            currLevel++
            if (currLevel == level) {
                break
            }
        }
        val map: MutableMap<String, VideoCount> = HashMap()
        while (!queue.isEmpty()) {
            val f = queue.poll()
            val watchedVideo = watchedVideos[f]
            for (video in watchedVideo) {
                map.putIfAbsent(video, VideoCount(video, 0))
                map[video]!!.count++
            }
        }
        val pq = PriorityQueue { v1: VideoCount, v2: VideoCount
            ->
            if (v1.count == v2.count) v1.v.compareTo(v2.v) else v1.count - v2.count
        }
        for ((_, value) in map) {
            pq.add(value)
        }
        val res: MutableList<String> = ArrayList()
        while (!pq.isEmpty()) {
            res.add(pq.poll().v)
        }
        return res
    }
}
