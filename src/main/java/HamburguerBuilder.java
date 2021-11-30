import java.util.Date;

public class HamburguerBuilder {
    private Hamburguer hamburguer;
    public HamburguerBuilder(){
        hamburguer= new Hamburguer();
    }
    public Hamburguer build(){
        if (hamburguer.getBife()>=8) {
            throw new IllegalArgumentException("Escolha um hamburguer com menos bifes");
        }
        return hamburguer;
    }


    public HamburguerBuilder setNome(String nome) {
        hamburguer.setNome(nome);
        return this;
    }
    public HamburguerBuilder setMolho(String molho) {
        hamburguer.setMolho(molho);
        return this;
    }
    public HamburguerBuilder setSalada(String salada) {
        hamburguer.setSalada(salada);
        return this;
    }
    public HamburguerBuilder setPao(String pao) {
        hamburguer.setPao(pao);
        return this;
    }
    public HamburguerBuilder setBife(int bife) {
        hamburguer.setBife(bife);
        return this;
    }
    public HamburguerBuilder setQueijo(boolean queijo) {
        hamburguer.setQueijo(queijo);
        return this;
    }
    public HamburguerBuilder setPicles(boolean picles) {
        hamburguer.setPicles(picles);
        return this;
    }



}
