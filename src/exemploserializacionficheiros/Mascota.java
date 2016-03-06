
package exemploserializacionficheiros;

import java.io.Serializable;

public class Mascota implements Serializable{
    private String nome;
    private int numPatas;

    public Mascota() {
    }

    public Mascota(String nome, int numPatas) {
        this.nome = nome;
        this.numPatas = numPatas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    @Override
    public String toString() {
        return  "nome=" + nome + ", numPatas=" + numPatas ;
    }
    
    
}
