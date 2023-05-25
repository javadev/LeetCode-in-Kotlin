587\. Erect the Fence

Hard

You are given an array `trees` where <code>trees[i] = [x<sub>i</sub>, y<sub>i</sub>]</code> represents the location of a tree in the garden.

Fence the entire garden using the minimum length of rope, as it is expensive. The garden is well-fenced only if **all the trees are enclosed**.

Return _the coordinates of trees that are exactly located on the fence perimeter_. You may return the answer in **any order**.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/04/24/erect2-plane.jpg)

**Input:** trees = [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]

**Output:** [[1,1],[2,0],[4,2],[3,3],[2,4]]

**Explanation:** All the trees will be on the perimeter of the fence except the tree at [2, 2], which will be inside the fence.

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/04/24/erect1-plane.jpg)

**Input:** trees = [[1,2],[2,2],[4,2]]

**Output:** [[4,2],[2,2],[1,2]]

**Explanation:** The fence forms a line that passes through all the trees.

**Constraints:**

*   `1 <= trees.length <= 3000`
*   `trees[i].length == 2`
*   <code>0 <= x<sub>i</sub>, y<sub>i</sub> <= 100</code>
*   All the given positions are **unique**.