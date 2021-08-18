package org.nowpat;

import org.nowpat.entity.Item;
import org.nowpat.parser.ItemParser;
import org.nowpat.printer.ItemPrinter;

import java.time.Month;
import java.util.List;

public class BootRecruitment1 {

    public static void main(String[] args) {

//        SpringApplication.run(BootSpringMetrics.class, args);

        List<Item> items = ItemParser.parseItems("/hostshare/nordea/ncs-java-springboot-dev.csv");

        items.stream().filter(item -> item.getCreationDate().getMonth().equals(Month.MARCH)).forEach(item -> ItemPrinter.printItem(item));
    }
}
