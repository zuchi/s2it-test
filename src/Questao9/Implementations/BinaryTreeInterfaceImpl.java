package Questao9.Implementations;

import Questao9.Interfaces.BinaryTreeInterface;
import Questao9.Models.BinaryTree;

public class BinaryTreeInterfaceImpl implements BinaryTreeInterface {


    @Override
    public BinaryTree createNewElementWithValues(int value, BinaryTree left, BinaryTree right) {
        BinaryTree newTree = new BinaryTree(value, left, right);
        return newTree;
    }

    @Override
    public int sumElementsBasedInNode(BinaryTree root) {
        if (root == null)
            throw new NullPointerException("The root element entered is null");

        int sum = 0;
        if (hasElementInLeft(root))
            sum += sumElementsBasedInNode(root.getLeft());

        if (hasElementInRight(root))
            sum += sumElementsBasedInNode(root.getRight());

        return sum + root.getValor();

    }

    @Override
    public boolean hasElementInLeft(BinaryTree root) {
        if (root == null)
            throw new NullPointerException("The root entered is null");

        return root.getLeft() != null;
    }

    @Override
    public boolean hasElementInRight(BinaryTree root) {
        if (root == null)
            throw new NullPointerException("The root entered is null");

        return root.getRight() != null;
    }

    @Override
    public void printTreeBasedOnRoot(BinaryTree root, Integer level) {

        if (root == null)
            throw new NullPointerException("The root entered is null");

        System.out.println("level: " + level + " root: " + root.getValor() + " left: " + (hasElementInLeft(root) ?
                root.getLeft().getValor() : "  ") + " right: " + (hasElementInRight(root) ? root.getRight().getValor() : "  "));

        if (hasElementInLeft(root))
            printTreeBasedOnRoot(root.getLeft(), level + 1);

        if (hasElementInRight(root))
            printTreeBasedOnRoot(root.getRight(), level + 1);

        level++;

    }

    @Override
    public BinaryTree findBinaryTreeNodeByValue(BinaryTree root, int value) {
        if (root == null)
            throw new NullPointerException("The root entered is null");

        BinaryTree found = null;

        if (root.getValor() == value)
            found = root;

        if (found == null) {
            if (hasElementInLeft(root))
                found = findBinaryTreeNodeByValue(root.getLeft(), value);

            if (found == null) {
                if (hasElementInRight(root))
                    found = findBinaryTreeNodeByValue(root.getRight(), value);
            }
        }

        return found;
    }

}


