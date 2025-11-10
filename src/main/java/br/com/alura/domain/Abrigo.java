package br.com.alura.domain;

public class Abrigo {

    public Abrigo() {}

    public Abrigo(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private Pet[] pets;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return """
               "id":%s,"nome":"%s"
               """.formatted(this.id, this.nome);
    }
}
