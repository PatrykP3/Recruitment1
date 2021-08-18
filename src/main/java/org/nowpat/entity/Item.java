package org.nowpat.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
//@Builder
@NoArgsConstructor
public class Item {

    private int number;
    private String name;
    private LocalDate creationDate;
}
