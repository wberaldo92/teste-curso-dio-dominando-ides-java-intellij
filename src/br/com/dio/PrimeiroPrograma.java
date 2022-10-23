package br.com.dio;


import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);
        /*int a = 3;
        int b = 4;
        System.out.println("Hello people " + (a+b));*/
    }
}

class Livro{
    private String nome;
    private Integer numpagina;

    public Livro(String nome, Integer numpagina) {
        this.nome = nome;
        this.numpagina = numpagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpagina() {
        return numpagina;
    }

    public void setNumpagina(Integer numpagina) {
        this.numpagina = numpagina;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpagina=" + numpagina +
                '}';
    }
}
