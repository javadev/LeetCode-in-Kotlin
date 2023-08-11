886\. Possible Bipartition

Medium

We want to split a group of `n` people (labeled from `1` to `n`) into two groups of **any size**. Each person may dislike some other people, and they should not go into the same group.

Given the integer `n` and the array `dislikes` where <code>dislikes[i] = [a<sub>i</sub>, b<sub>i</sub>]</code> indicates that the person labeled <code>a<sub>i</sub></code> does not like the person labeled <code>b<sub>i</sub></code>, return `true` _if it is possible to split everyone into two groups in this way_.

**Example 1:**

**Input:** n = 4, dislikes = [[1,2],[1,3],[2,4]]

**Output:** true

**Explanation:** The first group has [1,4], and the second group has [2,3].

**Example 2:**

**Input:** n = 3, dislikes = [[1,2],[1,3],[2,3]]

**Output:** false

**Explanation:** We need at least 3 groups to divide them. We cannot put them in two groups.

**Constraints:**

*   `1 <= n <= 2000`
*   <code>0 <= dislikes.length <= 10<sup>4</sup></code>
*   `dislikes[i].length == 2`
*   <code>1 <= a<sub>i</sub> < b<sub>i</sub> <= n</code>
*   All the pairs of `dislikes` are **unique**.