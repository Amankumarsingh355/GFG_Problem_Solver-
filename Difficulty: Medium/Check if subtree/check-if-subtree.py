# Definition for Node
class Node:
    def __init__(self, x):
        self.data = x
        self.left = None
        self.right = None

class Solution:
     def isSubTree(self, root1, root2):
        if root1 is root2 is None:
            return True
            
        def match(node1: Node, node2: Node) -> bool:
            if node1 is node2 is None:
                return True
            if node1 is None or node2 is None:
                return False
            return (
                node1.data == node2.data
                and match(node1.left, node2.left)
                and match(node1.right, node2.right)
            )
        
        def search(node: Node) -> bool:
            if node is None:
                return False
            if match(node, root2):
                return True
            return search(node.left) or search(node.right)
        
        return search(root1)