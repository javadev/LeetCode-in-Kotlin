787\. Cheapest Flights Within K Stops

Medium

There are `n` cities connected by some number of flights. You are given an array `flights` where <code>flights[i] = [from<sub>i</sub>, to<sub>i</sub>, price<sub>i</sub>]</code> indicates that there is a flight from city <code>from<sub>i</sub></code> to city <code>to<sub>i</sub></code> with cost <code>price<sub>i</sub></code>.

You are also given three integers `src`, `dst`, and `k`, return _**the cheapest price** from_ `src` _to_ `dst` _with at most_ `k` _stops._ If there is no such route, return `-1`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/03/18/cheapest-flights-within-k-stops-3drawio.png)

**Input:** n = 4, flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0, dst = 3, k = 1

**Output:** 700

**Explanation:** 

The graph is shown above. 

The optimal path with at most 1 stop from city 0 to 3 is marked in red and has cost 100 + 600 = 700. 

Note that the path through cities [0,1,2,3] is cheaper but is invalid because it uses 2 stops.

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/03/18/cheapest-flights-within-k-stops-1drawio.png)

**Input:** n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1

**Output:** 200

**Explanation:** 

The graph is shown above. 

The optimal path with at most 1 stop from city 0 to 2 is marked in red and has cost 100 + 100 = 200.

**Example 3:**

![](https://assets.leetcode.com/uploads/2022/03/18/cheapest-flights-within-k-stops-2drawio.png)

**Input:** n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 0

**Output:** 500

**Explanation:** 

The graph is shown above. 

The optimal path with no stops from city 0 to 2 is marked in red and has cost 500.

**Constraints:**

*   `1 <= n <= 100`
*   `0 <= flights.length <= (n * (n - 1) / 2)`
*   `flights[i].length == 3`
*   <code>0 <= from<sub>i</sub>, to<sub>i</sub> < n</code>
*   <code>from<sub>i</sub> != to<sub>i</sub></code>
*   <code>1 <= price<sub>i</sub> <= 10<sup>4</sup></code>
*   There will not be any multiple flights between two cities.
*   `0 <= src, dst, k < n`
*   `src != dst`