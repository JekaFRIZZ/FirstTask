package com.epam.task.first.data;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    public List<String> readDate(String filename) throws DataException {

        List<String> data = new ArrayList<>();

        try {
            FileReader fileInputStream = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileInputStream);

            String line = bufferedReader.readLine();

            while(line != null) {
                data.add(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
           throw new DataException(e.getMessage(), e);
        }

        return data;
    }
}
