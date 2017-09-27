/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows
 */
public class TesteGrafoMain {
    
    public static void main(String[] args) {
        
        Grafo g = new Grafo(false);
        
        Vertice a = new Vertice("A");
        Vertice b = new Vertice("B");
        Vertice c = new Vertice("C");
        Vertice d = new Vertice("D");
        
        g.adicionaVertice(a);
        g.adicionaVertice(b);
        g.adicionaVertice(c);
        g.adicionaVertice(d);
        
        g.adicionaAresta(new Aresta("X", b, c));
        g.adicionaAresta(new Aresta("Y", c, b));
        g.adicionaAresta(new Aresta("Z", c, c));
        
        System.out.println(g.isGrafo() ? ("É um grafo " + (g.isDirigido() ? "" : "não ") + "dirigido " + (g.isNulo() ? "" : "não ") + "nulo.") : "Não é um grafo.");
        System.out.println("Quantidade de vértices: " + g.obterOrdemGrafo());
        System.out.println("Quantidade de arestas: " + g.obterTamanhoGrafo());
        System.out.println("Grau do vertice A: " + g.obterGrauVertice("A"));
        System.out.println("Grau do vertice B: " + g.obterGrauVertice("B"));
        System.out.println("Grau do vertice C: " + g.obterGrauVertice("C"));
        System.out.println("Grau do vertice D: " + g.obterGrauVertice("D"));
        System.out.println("Grau do grafo: " + g.obterGrauGrafo());
        
    }
    
}
