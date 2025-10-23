<h2><a href="https://www.geeksforgeeks.org/problems/strange-indices/1?page=3&company=Oracle&sortBy=submissions">Strange indices</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">You are given an array <strong>A</strong> of </span><strong>N</strong><span style="font-size: 18px;"> integers. You have to say whether there exist a triplet i,j,k</span><span style="font-size: 18px;">&nbsp;such that the following conditions holds:</span></p>
<ul>
<li><span style="font-size: 18px;"><strong>i &lt; j &lt; k</strong></span><span style="font-size: 18px;">.</span></li>
<li><span style="font-size: 18px;"><strong>A<sub>i&nbsp;</sub>&lt; A<sub>k</sub>&nbsp;&lt; A<sub>j</sub></strong></span></li>
</ul>
<p><span style="font-size: 18px;">Determine if such subsequence exist.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>5
2 5 3 1 2
<strong>Output:
</strong>Yes
<strong>Explanation:
</strong>i = 1,j = 2,k = 3 satisfies all
the conditions.</span>

</pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span><span style="font-size: 18px;"><strong> </strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>5
1 2 3 4 5
<strong>Output:
</strong>No
<strong>Explanation:
</strong>No valid i,j,k exist.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Your Task:&nbsp;&nbsp;</strong><br>You don't need to read input or print anything. Your task is to complete the function <strong>isPossible( )&nbsp;</strong>which takes an array and its size <strong>N</strong>&nbsp;as input parameters and returns true if such triplet exist otherwise return false.</span><br>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ N&nbsp;≤ 10<sup>5</sup><br>1 ≤ A<sub>i</sub>&nbsp;≤ 10<sup>9</sup></span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(N)<br><strong>Expected Auxiliary Space:</strong>&nbsp;O(N)</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Oracle</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Stack</code>&nbsp;<code>Data Structures</code>&nbsp;