class Animal {
    String nome;
    String raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void andar() {
        System.out.println(nome + " está andando.");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }
}

class Ave extends Animal {
    public Ave(String nome, String raca) {
        super(nome, raca);
    }
    
    public void cantar() {
        System.out.println(nome + " está cantando.");
    }

    public void voar() {
        System.out.println(nome + " está voando.");
    }

}

public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Doki", "Labrador");
        Ave minhaAve = new Ave("Blu", "Arara-azul");

        System.out.println("Nome do cachorro: " + meuCachorro.nome);
        System.out.println("Raça do cachorro: " + meuCachorro.raca);
        meuCachorro.comer();
        meuCachorro.andar();
        meuCachorro.latir();

        System.out.println("\nNome da ave: " + minhaAve.nome);
        System.out.println("Espécie da ave: " + minhaAve.raca);
        minhaAve.comer();
        minhaAve.andar();
        minhaAve.cantar();
        minhaAve.voar();
    }
}