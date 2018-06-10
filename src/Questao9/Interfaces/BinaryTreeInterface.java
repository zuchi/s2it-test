package Questao9.Interfaces;


import Questao9.Models.BinaryTree;

public interface BinaryTreeInterface {

    /**
     * Cria um determinado Nó da árvore
     *
     * @param value informa o valor daquele nó
     * @param left  Coloca valor a esquerda para o nó que está sendo criado
     * @param right Coloca valor a direita para o nó que está sendo criado
     * @return retorna o nó criado
     */
    BinaryTree createNewElementWithValues(int value, BinaryTree left, BinaryTree right);

    /**
     * Faz a somatória do valor do nó e dos filhos da direita e da esquerda
     *
     * @param root Raiz para executar a somatória
     * @return retorna o valor total somado do nó raiz e dos seus filhos
     */
    int sumElementsBasedInNode(BinaryTree root);

    /**
     * Verifica se tem elementos a esquerda de um determinado nó
     *
     * @param root nó que deverá ser verificado se tem elemento a esquerda
     * @return retorna verdadeiro caso tenha nó a esquerda e falso caso não tenha
     */
    boolean hasElementInLeft(BinaryTree root);

    /**
     * Verifica se tem elementos a direita de um determinado nó
     *
     * @param root nó que deverá ser verificado se tem elemento a direita
     * @return retorna verdadeiro caso tenha nó a direita e falso caso não tenha
     */
    boolean hasElementInRight(BinaryTree root);

    /**
     * Imprime em forma linear a arvore binaria, monstrando os níveis o valor do nó e da arvore a esquerda e a direita
     * Levando sempre em consideração que será percorrido os elementos da esquerda da arvore e depois da direita
     *
     * @param root  nó raiz para impressão dos valores
     * @param level nível atual da árvore (usado para as chamadas recursivas)
     */
    void printTreeBasedOnRoot(BinaryTree root, Integer level);

    /**
     * Procura um determinado valor na árvore
     *
     * @param root  nó raiz de onde será iniciada a busca
     * @param value valor que deseja-se localizar dentro da arvore e das sub-arvores
     * @return retorna a árvore encontrada ou nullo caso não encontrar.
     */
    BinaryTree findBinaryTreeNodeByValue(BinaryTree root, int value);


}
