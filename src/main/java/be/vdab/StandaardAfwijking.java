package be.vdab;

import be.vdab.repositories.CSVPersoonRepository;
import be.vdab.services.PersoonService;

import java.io.IOException;

public class StandaardAfwijking {
    public static void main(String[] args) {
        try {
            var service=new PersoonService(new CSVPersoonRepository());
            System.out.println(service.standaardAfwijkingWeddes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
