/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 * Classe abstrata que define um Livro básico com atributos e métodos comuns.
 * Subclasses devem implementar o método exibeInfoCustomizadas() para exibir informações adicionais.
 * 
 * @author ZF
 */
abstract public class Livro {
    private String titulo, autor, editora, genero;
    private boolean isEmprestado;
    private int numeroDePaginas;
    
    
    /**
     * Construtor da classe Livro.
     * 
     * @param titulo Título do livro.
     * @param autor Nome do autor do livro.
     * @param editora Nome da editora do livro.
     * @param numeroDePaginas Número total de páginas do livro.
     * @param genero Gênero do livro.
        */
    public Livro(String titulo, String autor, String editora, int numeroDePaginas, String genero){
        this.autor = autor;
        this.titulo = titulo;
        this.editora = editora;
        this.numeroDePaginas = numeroDePaginas;
        this.genero = genero;
    }
   
    /**
     * Define a quantidade de páginas do livro.
     * 
     * @param quantidadePaginas Quantidade de páginas do livro.
     */
    public void setNumeroDePaginas(int quantidadePaginas){
        numeroDePaginas = quantidadePaginas;
    }
    
    /**
     * Obtém o título do livro.
     * 
     * @return O título do livro.
     */
    public String getTitulo(){
       return titulo;
    }
    
     /**
     * Define o título do livro.
     * 
     * @param novoTitulo Novo título do livro.
     */
    public void setTitulo(String novoTitulo){
        titulo = novoTitulo;
    }
    
    /**
    * Obtém o nome do Autor do livro
    * @return String autor 
    */
    public String getAutor(){
       return autor;
    }
    
    /**
    * Metodo set, para definir o nome do Autor do livro
    * 
    * @return void 
    */
    public void setAutor(String NovoAutor){
        autor = NovoAutor;
    }
    
    /**
    * Obtém o nome da Editora do livro
    * 
    * @return String editora 
    */
    public String getEditora(){
       return editora;
    }
    
    /**
    * Metodo set, para definir o nome da Editora do livro
    * @return void 
    */
    public void setEditora(String novaEditora){
        editora = novaEditora;
    }
    
    /**
    * Metodo get, para pegar o genero do livro
    * @return String genero 
    */
    public String getGenero(){
       return genero;
    }
    
    /**
    * Metodo set, para definir o Genero do livro
    * @return void 
    */
    public void setGenero(String novaEditora){
        editora = novaEditora;
    }
    
    /**
    * Metodo para Emprestar um livro
    * @return void 
    * 
    */
    public void emprestimo(){
        isEmprestado = true;
    }
    
    /**
    * Metodo para devolver um livro
    * @return void 
    * 
    */
    public void devolucao(){
        isEmprestado = false;
    }
    
    /**
    * Metodo para verificar se um livro pode ou não ser emprestado
    * @return boolean 
    * 
    */
    public boolean podeSerEmprestado(){
        if(isEmprestado == true)
            return false;
        else 
            return true;
    }
    
    /**
    * Metodo para criar exibição de customizada dos dados
    * @return void
    * 
    */
    abstract void exibeInfoCustomizadas();
}
