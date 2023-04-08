package g0801_0900.s0874_walking_robot_simulation

// #Medium #Array #Simulation #2023_04_08_Time_274_ms_(100.00%)_Space_47.7_MB_(100.00%)

class Solution {
    internal class Point(var row: Int, var column: Int) {
        override fun equals(other: Any?): Boolean {
            val another = other as Point?
            return another!!.row == row && another.column == column
        }

        override fun hashCode(): Int {
            return row * column * 31
        }
    }

    internal enum class Direction(val x: Int, val y: Int) {
        NORTH(0, 1) {
            override fun turnLeft(): Direction {
                return WEST
            }

            override fun turnRight(): Direction {
                return EAST
            }
        },
        EAST(1, 0) {
            override fun turnLeft(): Direction {
                return NORTH
            }

            override fun turnRight(): Direction {
                return SOUTH
            }
        },
        SOUTH(0, -1) {
            override fun turnLeft(): Direction {
                return EAST
            }

            override fun turnRight(): Direction {
                return WEST
            }
        },
        WEST(-1, 0) {
            override fun turnLeft(): Direction {
                return SOUTH
            }

            override fun turnRight(): Direction {
                return NORTH
            }
        };

        abstract fun turnLeft(): Direction
        abstract fun turnRight(): Direction
        fun next(p: Point): Point {
            return Point(p.row + x, p.column + y)
        }
    }

    fun robotSim(commands: IntArray, obstacles: Array<IntArray>): Int {
        val set: MutableSet<Point> = HashSet()
        for (i in obstacles.indices) {
            val p = Point(obstacles[i][0], obstacles[i][1])
            set.add(p)
        }
        var direction = Direction.NORTH
        var p = Point(0, 0)
        var maxDistance = 0
        for (i in commands.indices) {
            val command = commands[i]
            if (command == -1) {
                direction = direction.turnRight()
                continue
            }
            if (command == -2) {
                direction = direction.turnLeft()
                continue
            }
            for (j in 0 until command) {
                val destination = direction.next(p)
                if (set.contains(destination)) {
                    break
                }
                p = destination
            }
            maxDistance = maxDistance.coerceAtLeast(p.row * p.row + p.column * p.column)
        }
        return maxDistance
    }
}
