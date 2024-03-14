package app;


import org.junit.jupiter.api.Test;
import javax.xml.crypto.Data;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KnnTest {
    @Test
    public void testDetermineHappiness(){
        Dataset dataset = new Dataset();

        dataset.loadDataFromCSV("feliz.csv");

        Knn knn = new Knn(dataset, 3);
        Knn knn1 =  new Knn(dataset, 5);
        Knn knnNegativo = new Knn(dataset, -5);

        double horas1 = 2.5;
        double calorias1 = 2700;

        double horas2 = 7;
        double calorias2 = 6000;


        assertEquals("Infeliz", knn.determineHappiness(horas1, calorias1));
        assertEquals("Feliz", knn1.determineHappiness(horas2, calorias2));

        //tem que apresentar erro
        assertEquals("Feliz", knnNegativo.determineHappiness(horas2, calorias2));
    }

    @Test
    public void testLoadFromCsv(){


    }

    @Test
    public void testSetCalories(){

    }

    @Test
    public void testSetHours(){

    }
}