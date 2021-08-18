package org.nowpat.printer;

import lombok.extern.slf4j.Slf4j;
import org.nowpat.entity.Item;

import java.time.LocalDate;

@Slf4j
public class ItemPrinter {

    public static void printItem(Item item) {

        log.info("{} {} {}", item.getNumber(), "The Greatest " + item.getName(), maskedDate(item.getCreationDate()));
    }

    private static String maskedDate(LocalDate creationDate) {

        String year = creationDate.isAfter(LocalDate.of(2020, 1, 1)) ? "####" : Integer.toString(creationDate.getYear());
        String month = Integer.toString(creationDate.getMonth().getValue());
        String day = Integer.toString(creationDate.getDayOfMonth());

        return year + "-" + month + "-" + day;
    }
}
