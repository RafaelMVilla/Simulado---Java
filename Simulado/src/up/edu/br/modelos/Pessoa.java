package up.edu.br.modelos;

public class Pessoa {

    private String nome;
    private int codigo;
    private String rua;
    private String cidade;


    public Pessoa (){

    }

    
    public Pessoa(int codigo, String nome, String rua, String cidade){

        this.codigo = codigo;
        this.nome = nome;
        this.rua = rua;
        this.cidade = cidade;
    
    }

    public String toCsv(){
        return String.format("%d;%s;%s;%s", codigo, nome, rua, cidade);
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getRua() {
        return rua;
    }


    public void setRua(String rua) {
        this.rua = rua;
    }


    public String getCidade() {
        return cidade;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }



}
