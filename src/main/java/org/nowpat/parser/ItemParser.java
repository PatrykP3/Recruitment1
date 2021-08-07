package org.nowpat.parser;

import org.nowpat.entities.Item;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ItemParser {

    private static final String COMMA_DELIMITER = ",";

    public static List<Item> parseItems(String inputFile) {

        List<Item> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                Item item = convertItem(values);
                records.add(item);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return records;
    }

    private static Item convertItem(String[] values) {

        Item item = new Item();

        item.setNumber(Integer.parseInt(values[0]));
        item.setName(values[1]);
        item.setCreationDate(LocalDate.parse(values[2], DateTimeFormatter.ofPattern("dd.MM.yyyy")));

        return item;
    }
}
