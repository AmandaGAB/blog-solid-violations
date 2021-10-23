package br.edu.ifpb.padroes.modelo;

public class PostagemPrivada extends Postagem{

	private PostagemPrivada postagemPrivada;
    
    public PostagemPrivada getPostagemPrivada() {
        return postagemPrivada;
    }

    public void setPostagemTipo(PostagemPrivada postagemPrivada) {
        this.postagemPrivada = postagemPrivada;
    }
}
