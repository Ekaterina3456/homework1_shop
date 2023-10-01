package ru.gb.lesson1;

public class Product {
    protected String name;
    protected String brand;
    protected double price;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.length() < 3) {
            this.name = "<Product>";
        }
        else {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        checkPrice(price);
    }

    public Product() { // это конструктор, название конструктору даётся такое же как имя класса
        this("<Product>");
    }
    public Product(String name) { // это конструктор, название конструктору даётся такое же как имя класса
        this(name, 100);
    }
    public Product(String name, double price) { // это конструктор, название конструктору даётся такое же как имя класса
        this("<Brand>", name, 100);
    }
    public Product(String brand, String name, double price) { // это конструктор, название конструктору даётся такое же как имя класса
        if (brand == null || brand.length() < 3) {
            this.brand = "<Brand>";
        }
        else {
            this.brand = brand;
        }
        if (name == null || name.length() < 3) {
            this.name = "<Product>";
        }
        else {
            this.name = name;
        }
        checkPrice(price);
    }

    private void checkPrice(double price){
        if (price < 100) {
            this.price = 100;
        }
        else {
            this.price = price;
        }
    }

    public String displayInfo() {
        return String.format("%s - %s - %.2f", brand, name, price);
    }
}