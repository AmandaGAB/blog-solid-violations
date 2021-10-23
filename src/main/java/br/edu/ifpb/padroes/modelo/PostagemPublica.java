package br.edu.ifpb.padroes.modelo;

public class PostagemPublica extends Postagem {
	   
    private PostagemPublica postagemPublica;
    
    public PostagemPublica getPostagemPublica() {
        return postagemPublica;
    }

    public void setPostagemTipo(PostagemPublica postagemPublica) {
        this.postagemPublica = postagemPublica;
    }
}
