package design_pattern_singleton.zad2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLoader {
    public void configReader() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/calculus_config.txt"));

            String line1 = reader.readLine();
            String line2 = reader.readLine();
            String line3 = reader.readLine();
            String line4 = reader.readLine();

            String value1 = line1.split("=")[1];
            String value2 = line2.split("=")[1];
            String value3 = line3.split("=")[1];
            String value4 = line4.split("=")[1];

            int rangeStart = Integer.parseInt(value1);
            int rangeEnd = Integer.parseInt(value2);
            int rounds = Integer.parseInt(value4);

            MySettings.INSTANCE.setStartRange(rangeStart);
            MySettings.INSTANCE.setEndRange(rangeEnd);
            MySettings.INSTANCE.setSigns(value3);
            MySettings.INSTANCE.setRounds(rounds);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("No file found.");
        }
    }
}
