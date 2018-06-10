package Questao9;


import Questao9.Implementations.BinaryTreeInterfaceImpl;
import Questao9.Interfaces.BinaryTreeInterface;
import Questao9.Models.BinaryTree;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        BinaryTreeInterface binaryTreeManagement = new BinaryTreeInterfaceImpl();
        BinaryTree root = binaryTreeManagement.createNewElementWithValues(0, null, null);

        populateWithNElements(root, 3, 1);
        binaryTreeManagement.printTreeBasedOnRoot(root, 0);

        int valueTyped = getRootNodeByTypeValue();

        BinaryTree foundNodeByValue = binaryTreeManagement.findBinaryTreeNodeByValue(root, valueTyped);

        if (foundNodeByValue != null) {
            int total = binaryTreeManagement.sumElementsBasedInNode(foundNodeByValue);
            System.out.println("The of the node and their children is: " + total);
        } else
            System.out.println("Binary Tree node not found");
    }

    /**
     * Método para popular automaticamente a árvore binária para poder efetuar os teste
     *
     * @param root          nó principal da árvore
     * @param numberOfLevel número de níveis que deverão ser adicionados
     * @param startValue    valor iniciar e de controle para não repetir em cada um dos nós
     */
    private static void populateWithNElements(BinaryTree root, int numberOfLevel, int startValue) {

        if (numberOfLevel == 0)
            return;

        if (root == null)
            return;

        BinaryTreeInterface binaryTreeManagement = new BinaryTreeInterfaceImpl();

        BinaryTree left = binaryTreeManagement.createNewElementWithValues(startValue++, null, null);
        BinaryTree right = binaryTreeManagement.createNewElementWithValues(startValue++, null, null);

        root.setLeft(left);
        root.setRight(right);

        populateWithNElements(left, numberOfLevel - 1, startValue * numberOfLevel);
        populateWithNElements(right, numberOfLevel - 1, ++startValue * numberOfLevel);
    }

    /**
     * Método responsável por pegar via Scanner o que foi digitado pelo usuário
     *
     * @return retorna o valor digitado pelo usuário
     */
    private static int getRootNodeByTypeValue() {
        System.out.println("Type the value of one node to perform the sum: ");

        Scanner leitor = new Scanner(System.in);
        leitor.reset();

        return leitor.nextInt();
    }
}
