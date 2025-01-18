package entities;

public class Funcionario {
    int id;
    String nome;
    double salario;

    public Funcionario(){
    }

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double porcentagem){
        salario += salario * porcentagem / 100.0;
    }

    public String toString(){
        return "Id: "+getId()+", Nome: "+getNome()+", Salário: "+String.format("%.2f",salario);
    }
}
