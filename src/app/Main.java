package app;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Dataset dataset = new Dataset();

        Knn knn = new Knn(dataset, 3);
        System.out.println(knn.classify(new DataPoint(1500, 2)));
        System.out.println(knn.classify(new DataPoint(6000, 7)));
    }

}