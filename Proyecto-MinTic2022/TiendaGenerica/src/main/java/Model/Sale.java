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
public class Sale {
    private int id_sale = 0; // codigo_venta
    private int id_client = 0; // cedula_cliente
    private int id_user = 0; // cedula_usuario
    private double iva =0; // iva_venta
    private double total = 0; // total_venta
    private double value = 0; // valor_venta

    public int getId_sale() {
        return id_sale;
    }

    public void setId_sale(int id_sale) {
        this.id_sale = id_sale;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getValue_sale() {
        return value;
    }

    public void setValue_sale(double value_sale) {
        this.value = value_sale;
    }
}
