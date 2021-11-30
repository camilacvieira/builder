import java.util.Date;

public class Hamburguer {
    private String nome;
    private int bife;
    private String molho;
    private String salada;
    private String pao;
    private boolean queijo;
    private boolean picles;

    public Hamburguer() {
        this.nome="BigMac";
        this.bife = 0;
        this.salada="";
        this.queijo=true;
        this.molho = "";
        this.picles=true;
        this.pao="";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.salada = salada;
    }

    public int getBife() {
        return bife;
    }

    public void setBife(int bife) {
        this.bife = bife;
    }

    public String getSalada() {
        return salada;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public boolean getQueijo() {
        return queijo;
    }

    public void setQueijo(boolean queijo) {
        this.queijo = queijo;
    }


    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }


    public boolean getPicles() {
        return picles;
    }

    public void setPicles(boolean picles) {
        this.picles = picles;
    }

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

}
