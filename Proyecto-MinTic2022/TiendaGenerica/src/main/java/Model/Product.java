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

public class Product {
    private int id = 0; // codigo_producto
    private double iva = 0; // iva_compra
    private int nit = 0; // nit_proveedor
    private String name = ""; // nombre_producto
    private double sale_price = 0; //precio_compra
    private double purchase_price =0; // precio_venta

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSale_price() {
        return sale_price;
    }

    public void setSale_price(double sale_price) {
        this.sale_price = sale_price;
    }

    public double getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(double purchase_price) {
        this.purchase_price = purchase_price;
    }
}
