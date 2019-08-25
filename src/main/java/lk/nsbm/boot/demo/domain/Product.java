package lk.nsbm.boot.demo.domain;

import java.math.BigDecimal;

public class Product {
    private String productCode;
    private String name;
    private  String description;
    private BigDecimal prive;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrive() {
        return prive;
    }

    public void setPrive(BigDecimal prive) {
        this.prive = prive;
    }
}
