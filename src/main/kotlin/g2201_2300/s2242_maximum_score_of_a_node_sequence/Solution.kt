package g2201_2300.s2242_maximum_score_of_a_node_sequence

// #Hard #Array #Sorting #Graph #Enumeration
class Solution {
    fun maximumScore(scores: IntArray, edges: Array<IntArray>): Int {
        // store only top 3 nodes (having highest scores)
        val graph = Array(scores.size) { IntArray(3) }
        for (a in graph) {
            a.fill(-1)
        }
        for (edge in edges) {
            insert(edge[0], graph[edge[1]], scores)
            insert(edge[1], graph[edge[0]], scores)
        }
        var maxScore = -1
        for (edge in edges) {
            val u = edge[0]
            val v = edge[1]
            val score = scores[u] + scores[v]
            for (i in 0..2) {
                // if neighbour is current node, skip
                if (graph[u][i] == -1 || graph[u][i] == v) {
                    continue
                }
                for (j in 0..2) {
                    // if neighbour is current node or already choosen node, skip
                    if (graph[v][j] == -1 || graph[v][j] == u) {
                        continue
                    }
                    if (graph[v][j] == graph[u][i]) {
                        continue
                    }
                    maxScore = Math.max(maxScore, score + scores[graph[u][i]] + scores[graph[v][j]])
                }
            }
        }
        return maxScore
    }

    private fun insert(n: Int, arr: IntArray, scores: IntArray) {
        if (arr[0] == -1) {
            arr[0] = n
        } else if (arr[1] == -1) {
            if (scores[arr[0]] < scores[n]) {
                arr[1] = arr[0]
                arr[0] = n
            } else {
                arr[1] = n
            }
        } else if (arr[2] == -1) {
            if (scores[arr[0]] < scores[n]) {
                arr[2] = arr[1]
                arr[1] = arr[0]
                arr[0] = n
            } else if (scores[arr[1]] < scores[n]) {
                arr[2] = arr[1]
                arr[1] = n
            } else {
                arr[2] = n
            }
        } else {
            if (scores[arr[1]] < scores[n]) {
                arr[2] = arr[1]
                arr[1] = n
            } else if (scores[arr[2]] < scores[n]) {
                arr[2] = n
            }
        }
    }
}
