package edu.miu.cs.cs489.productmgmtapp.model;

import java.time.LocalDate;

public record Product(
        Integer productId,
        String name,
        LocalDate dateSupplied
) {
}
