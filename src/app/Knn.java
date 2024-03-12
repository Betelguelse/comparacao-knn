package app;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.LinkedList;


public class Knn {
    private Dataset dataset;
    private int k;

    public Knn(Dataset dataset, int k) {
        this.dataset = dataset;
        this.k = k;
    }

    public String classify(DataPoint attributes) {
        // Implementação do algoritmo K-NN para classificação
        LinkedList<DataPoint> dataPoints = (LinkedList<DataPoint>) this.dataset.getDataPoints();
        DataPoint dataPointMaisProx = null;
        double distanciaMaisProx = Double.MAX_VALUE;
        double distanciaAux;

        for(int i = 0; i < dataPoints.size(); i ++){
            distanciaAux = calcularDistancia(attributes, dataPoints.get(i));

            if(distanciaAux < distanciaMaisProx){
                distanciaMaisProx = distanciaAux;
                dataPointMaisProx = dataPoints.get(i);

            }

        }

        // Retorna a classe prevista para o ponto de dados fornecido
        return dataPointMaisProx.getEstado();
    }

    public String determineHappiness(double horaSono, double caloria) {

        return classify(new DataPoint(caloria, horaSono));
    }

    public double calcularDistancia(DataPoint dataPoint1, DataPoint dataPoint2){
        return Math.sqrt(Math.abs(dataPoint2.getCaloria() / 3000 - dataPoint1.getCaloria() / 3000)
                        + Math.abs(dataPoint1.getHora() / 3000 - dataPoint2.getHora()/3000));

    }

    public class DistanciaPonto implements Comparable<DistanciaPonto>{
        private DataPoint dataPoint;
        private double distancia;

        public DistanciaPonto(DataPoint dataPoint, double distancia){
            this.distancia = distancia;
            this.dataPoint = dataPoint;
        }

        public int compareTo(DistanciaPonto o) {
            return Double.compare(o.distancia, this.distancia);
        }
    }

}




