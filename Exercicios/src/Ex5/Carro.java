package Ex5;

public class Carro {
    private static final double VELOCIDADE_MAXIMA = 110.0;
    private static final double AUMENTO_VELOCIDADE = 10.0;
    private static final double REDUCAO_VELOCIDADE = 10.0;

    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public Carro(String marcaVeiculo, String modeloVeiculo, int anoVeiculo, double velocidadeInicial) {
        marca = marcaVeiculo;
        modelo = modeloVeiculo;
        ano = anoVeiculo;
        velocidadeAtual = velocidadeInicial;
    }

    public void acelerar() {
        if (velocidadeAtual + AUMENTO_VELOCIDADE > VELOCIDADE_MAXIMA) {
            System.out.println("Velocidade máxima da via atingida (" + VELOCIDADE_MAXIMA + " km/h). Reduzindo a velocidade...");
            velocidadeAtual = VELOCIDADE_MAXIMA - REDUCAO_VELOCIDADE; // Reduzindo a velocidade para ficar abaixo da velocidade máxima
            System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            velocidadeAtual += AUMENTO_VELOCIDADE;
            System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        }
    }

    public void frear() {
        if (velocidadeAtual - REDUCAO_VELOCIDADE < 0.0) {
            System.out.println("O veículo já está parado.");
            velocidadeAtual = 0.0;
        } else {
            velocidadeAtual -= REDUCAO_VELOCIDADE;
            System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca veículo: " + marca);
        System.out.println("Modelo veículo: " + modelo);
        System.out.println("Ano veículo: " + ano);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
}
