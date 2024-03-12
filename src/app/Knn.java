package app;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class Dataset {
    public DataPoint[] getDataPoints() {
        // retorna o vetor com os dados carregados

        return new DataPoint[0];
    }

    public Dataset() {
            // Implementar construtor
        }

        public void loadDataFromCSV (String filename){
            // Implementação para ler dados do arquivo CSV e carregar na lista de pontos de dados
        }
}



public class Knn {
    private Dataset dataset;
    private int k;

    public Knn(Dataset dataset, int k) {
        this.dataset = dataset;
        this.k = k;
    }

    public String classify(DataPoint attributes) {
        // Implementação do algoritmo K-NN para classificação


        // Retorna a classe prevista para o ponto de dados fornecido
        return null;
    }

    public String determineHappiness(double horaSono, double caloria) {
        return classify(attributes);
    }


}


public class Ler(){
    public static void lerArquivo() {
        String arquivo = "feliz.csv";
        String divisor = ";";
        String[] componentes;

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(divisor);

                System.out.println("Campo 1: " + campos[0]);
                System.out.println("Campo 2: " + campos[1]);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
