package g0701_0800.s0733_flood_fill

// #Easy #Array #Depth_First_Search #Breadth_First_Search #Matrix
// #Algorithm_I_Day_7_Breadth_First_Search_Depth_First_Search
// #Graph_Theory_I_Day_1_Matrix_Related_Problems #Level_1_Day_9_Graph/BFS/DFS
// #2023_03_02_Time_230_ms_(97.76%)_Space_38.8_MB_(73.72%)

class Solution {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
        val o = image[sr][sc]
        helper(image, sr, sc, newColor, o)
        return image
    }

    private fun helper(img: Array<IntArray>, r: Int, c: Int, n: Int, o: Int) {
        if (r >= img.size || c >= img[0].size || r < 0 || c < 0 || img[r][c] == n || img[r][c] != o) {
            return
        }
        img[r][c] = n
        helper(img, r + 1, c, n, o)
        helper(img, r - 1, c, n, o)
        helper(img, r, c + 1, n, o)
        helper(img, r, c - 1, n, o)
    }
}
