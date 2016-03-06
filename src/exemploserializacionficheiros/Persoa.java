
package exemploserializacionficheiros;

import java.io.Serializable;

public class Persoa implements Serializable{
    
    private String nome,apelido;
    private int edade;
    private Mascota mas = new Mascota();

    public Persoa() {
    }

    public Persoa(String nome, String apelido, int edade,String nomeMas,int numPatas) {
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
        mas.setNome(nomeMas);
        mas.setNumPatas(numPatas);
        
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public int getEdade() {
        return edade;
    }

    public Mascota getMas() {
        return mas;
    }

    @Override
    public String toString() {
        return "Persoa{" + "nome=" + nome + ", apelido=" + apelido + ", edade=" + edade + ", mascota=" + mas + '}';
    }
    
    
    
    
}
