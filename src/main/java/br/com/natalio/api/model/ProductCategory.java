package br.com.natalio.api.model;

public enum ProductCategory {
    ELECTRONICS(1),
    CLOTHING(2),
    BOOKS(3),
    SPORTS(4),
    BEAUTY(5);

    private final int categoryCode;

    ProductCategory(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

}
