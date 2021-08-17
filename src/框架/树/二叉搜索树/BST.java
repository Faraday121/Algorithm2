package 框架.树.二叉搜索树;

import 框架.树.TreeNode;

public class BST {

    private TreeNode root;

    //输入一个数字，寻找一个点
    public TreeNode get(int key){
        TreeNode current = root;
        while(current!=null&&current.value!=key){
            if (key<current.value){
                current = current.left;
            }else {
                current=current.right;
            }
        }
        return  current == null?null:current;
    }
}
