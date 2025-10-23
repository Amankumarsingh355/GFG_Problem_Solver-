<h2><a href="https://www.geeksforgeeks.org/problems/finding-profession3834/1?page=3&company=Oracle&sortBy=submissions">Finding Profession</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Consider a special family of <strong>Engineers</strong> and <strong>Doctors</strong> with following rules :</span></p>
<ol>
<li><span style="font-size: 18px;">Everybody has two children.</span></li>
<li><span style="font-size: 18px;">First child of an Engineer is an Engineer and second child is a Doctor.</span></li>
<li><span style="font-size: 18px;">First child of an Doctor is Doctor and second child is an Engineer.</span></li>
<li><span style="font-size: 18px;">All generations of Doctors and Engineers start with Engineer.</span></li>
</ol>
<p><span style="font-size: 18px;">We can represent the situation using below diagram:</span></p>
<pre><span style="font-size: 18px;"><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/705281/Web/Other/blobid0_1749212726.webp" width="281" height="168"></span><br><span style="font-size: 18px;">Given <strong>level</strong> and position(<strong>pos</strong>) of a person in above ancestor tree, find profession of the person.</span></pre>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> level = 4, pos = 2
<strong>Output:</strong> Doctor
<strong>Explaination:</strong> It is shown in the tree given 
in question.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> level = 3, pos = 4
<strong>Output:</strong> Engineer
<strong>Explaination:</strong> Already given in the tree in 
question.</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>You do not need to read input or print anything. Your task is to complete the function <strong>profession()</strong> which takes level and pos as input parameters and returns 'd' if it is a doctor. Otherwise return 'e'. The driver code will output Doctor for 'd' and Engineer for 'e' itself.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity: </strong>O(log(pos))<br><strong>Expected Auxiliary Space:</strong> O(1)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ level ≤ 10<sup>9</sup><br>1 ≤ pos ≤ min(10<sup>9</sup>, 2<sup>level-1</sup>)</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Oracle</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Recursion</code>&nbsp;<code>Algorithms</code>&nbsp;