
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ctomazoni
 */
public class Grafo {
    
    private boolean dirigido;
    private ArrayList<Vertice> vertices;
    private ArrayList<Aresta> arestas;

    public Grafo(boolean dirigido) {
        this.dirigido = dirigido;
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
    }

    public boolean isGrafo() {
        return !vertices.isEmpty();
    }
    
    public boolean isDirigido() {
        return dirigido;
    }
    
    public boolean isNulo() {
        return arestas.isEmpty();
    }
    
    public int obterOrdemGrafo() {
        return vertices.size();
    }
    
    public int obterTamanhoGrafo() {
        return arestas.size();
    }
    
    public boolean isDenso() {
        //Cuidado: não é um resultado preciso
        return obterTamanhoGrafo() > obterOrdemGrafo();
    }
    
    public boolean isEsparso() {
        //Cuidado: não é um resultado preciso
        return obterTamanhoGrafo() <= obterOrdemGrafo();
    }
    
    public int obterGrauVertice(int i) {
        //falta implementar
        return 0;
    }
    
    public int obterGrauVertice(String n) {
        //falta implementar
        return 0;
    }

    public int obterGrauGrafo() {
        return 2 * obterTamanhoGrafo();
    }
    
    public boolean adicionaVertice(Vertice v) {
        return vertices.add(v);
    }
    
    public boolean adicionaVertice(String n) {
        boolean adiciona = true;
        for (int i = 0; i < vertices.size(); i++) {
            if (n.equals(vertices.get(i).getNome())) {
                adiciona = false;
                break;
            }
        }
        if (adiciona) {
            return vertices.add(new Vertice(n));
        } else {
            return false;
        }
    }
    
    public boolean removeVertice(Vertice v) {
        return vertices.remove(v);
    }
    
    public Vertice removeVertice(String n) {
        for (int i = 0; i < vertices.size(); i++) {
            if (n.equals(vertices.get(i).getNome())) {
                return vertices.remove(i);
            }
        }
        return null;
    }
    
    public Vertice obterVertice(int i) {
        return vertices.get(i);
    }
    
    public Vertice obterVertice(String n) {
        for (int i = 0; i < vertices.size(); i++) {
            if (n.equals(vertices.get(i).getNome())) {
                return vertices.get(i);
            }
        }
        return null;
    }
    
    public boolean adicionaAresta(Aresta a) {
        return arestas.add(a);
    }
    
    public boolean adicionaAresta(String n) {
        boolean adiciona = true;
        for (int i = 0; i < arestas.size(); i++) {
            if (n.equals(arestas.get(i).getNome())) {
                adiciona = false;
                break;
            }
        }
        if (adiciona) {
            return arestas.add(new Aresta(n));
        } else {
            return false;
        }
    }
    
    public boolean removeAresta(Aresta a) {
        return arestas.remove(a);
    }
    
    public Aresta removeAresta(String n) {
        for (int i = 0; i < arestas.size(); i++) {
            if (n.equals(arestas.get(i).getNome())) {
                return arestas.remove(i);
            }
        }
        return null;
    }
    
    public Aresta obterAresta(int i) {
        return arestas.get(i);
    }
    
    public Aresta obterAresta(String n) {
        for (int i = 0; i < arestas.size(); i++) {
            if (n.equals(arestas.get(i).getNome())) {
                return arestas.get(i);
            }
        }
        return null;
    }
    
    public ArrayList<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<Vertice> vertices) {
        this.vertices = vertices;
    }

    public ArrayList<Aresta> getArestas() {
        return arestas;
    }

    public void setArestas(ArrayList<Aresta> arestas) {
        this.arestas = arestas;
    }
    
}
