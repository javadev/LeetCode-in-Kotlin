package g2001_2100.s2069_walking_robot_simulation_ii

// #Medium #Design #Simulation #2023_06_26_Time_636_ms_(100.00%)_Space_66.2_MB_(100.00%)

class Robot(width: Int, height: Int) {
    private var p: Int
    private val w: Int
    private val h: Int

    init {
        w = width - 1
        h = height - 1
        p = 0
    }

    fun step(num: Int) {
        p += num
    }

    fun getPos(): IntArray {
        var remain = p % (2 * (w + h))
        if (remain <= w) {
            return intArrayOf(remain, 0)
        }
        remain -= w
        if (remain <= h) {
            return intArrayOf(w, remain)
        }
        remain -= h
        if (remain <= w) {
            return intArrayOf(w - remain, h)
        }
        remain -= w
        return intArrayOf(0, h - remain)
    }

    fun getDir(): String {
        val pos = getPos()
        return if (p == 0 || pos[1] == 0 && pos[0] > 0) {
            "East"
        } else if (pos[0] == w && pos[1] > 0) {
            "North"
        } else if (pos[1] == h && pos[0] < w) {
            "West"
        } else {
            "South"
        }
    }
}

/*
 * Your Robot object will be instantiated and called as such:
 * var obj = Robot(width, height)
 * obj.step(num)
 * var param_2 = obj.getPos()
 * var param_3 = obj.getDir()
 */
