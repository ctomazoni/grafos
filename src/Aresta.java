/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ctomazoni
 */
public class Aresta {
    
    /*
    conjunto de arestas (E)
    aresta (e)
    vértice origem (u)
    vértice destino (v)
    */
    
    private String nome;
    private Vertice verticeOrigem;
    private Vertice verticeDestino;

    public Aresta(String nome) {
        this.nome = nome;
    }

    public Aresta(String nome, Vertice verticeOrigem, Vertice verticeDestino) {
        this.nome = nome;
        this.verticeOrigem = verticeOrigem;
        this.verticeDestino = verticeDestino;
    }
    
    public boolean isLoop() {
        return getVerticeOrigem().equals(getVerticeDestino());
    }
    
    public boolean isArestaParalela(Aresta a) {
        return getVerticeOrigem().equals(a.getVerticeOrigem())
                && getVerticeDestino().equals(a.getVerticeDestino());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Vertice getVerticeOrigem() {
        return verticeOrigem;
    }

    public void setVerticeOrigem(Vertice verticeOrigem) {
        this.verticeOrigem = verticeOrigem;
    }

    public Vertice getVerticeDestino() {
        return verticeDestino;
    }

    public void setVerticeDestino(Vertice verticeDestino) {
        this.verticeDestino = verticeDestino;
    }
    
}
