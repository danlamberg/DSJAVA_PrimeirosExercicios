/* Projete uma classe ContaBancaria que encapsule os atributos de uma conta, 
como numeroConta, nomeTitular e saldo. Utilize modificadores de acesso para garantir o 
encapsulamento e a segurança dos dados. Implemente métodos para depositar(valor), sacar(valor) e 
um método que retorne o saldo atual da conta. Lembre-se de que cada operação deve 
ajustar o saldo da conta de acordo com a transação realizada.” */


public class ContaBancaria {

    private int numeroConta;
    private String nomeTitular;
    private Float saldo;  
    
    public ContaBancaria(int numeroConta, String nomeTitular, Float saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public String getNomeConta(){
        return nomeTitular;
    }

    public Float getSaldo(){
        return saldo;
    }
}




