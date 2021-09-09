/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ander
 */
public class SaleDetail {
    private int id = 0; // codigo_detalle_venta
    private int number_products = 0; // cantidad_producto
    private int id_product = 0; // codigo_venta
    private int id_sale = 0; // codigo_venta
    private double value_total = 0; // valor_total
    private double value_sale = 0; // valor_venta
    private double value_iva = 0; // valor_iva


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber_products() {
        return number_products;
    }

    public void setNumber_products(int number_products) {
        this.number_products = number_products;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getId_sale() {
        return id_sale;
    }

    public void setId_sale(int id_sale) {
        this.id_sale = id_sale;
    }

    public double getValue_total() {
        return value_total;
    }

    public void setValue_total(double value_total) {
        this.value_total = value_total;
    }

    public double getValue_sale() {
        return value_sale;
    }

    public void setValue_sale(double value_sale) {
        this.value_sale = value_sale;
    }

    public double getValue_iva() {
        return value_iva;
    }

    public void setValue_iva(double value_iva) {
        this.value_iva = value_iva;
    }
}