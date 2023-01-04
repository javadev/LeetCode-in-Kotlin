package g0001_0100.s0071_simplify_path

// #Medium #String #Stack #2022_09_24_Time_318_ms_(64.44%)_Space_37.8_MB_(77.78%)

import java.util.ArrayDeque
import java.util.Deque

class Solution {
    fun simplifyPath(path: String): String {
        val stk: Deque<String> = ArrayDeque()
        var start = 0
        while (start < path.length) {
            while (start < path.length && path[start] == '/') {
                start++
            }
            var end = start
            while (end < path.length && path[end] != '/') {
                end++
            }
            val s = path.substring(start, end)
            if (s == "..") {
                if (!stk.isEmpty()) {
                    stk.pop()
                }
            } else if (s != "." && s != "") {
                stk.push(s)
            }
            start = end + 1
        }
        val ans = StringBuilder()
        while (!stk.isEmpty()) {
            ans.insert(0, stk.pop())
            ans.insert(0, "/")
        }
        return if (ans.length > 0) ans.toString() else "/"
    }
}
