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
/**
 * Clase Usuario
 **/
public class User extends Entity{
    private String password = "" ; //contraseña
    private String username = ""; //usuario
    private String rol = "";

    public User(){
        super();
    }
    /**
     * @return contraseña del usuario
     **/
    public String getPassword() {
        return password;
    }
    /**
     * @param password es la contraseña del usuario
     **/
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @return usuario
     **/
    public String getUsername() {
        return username;
    }
    /**
     * @param username es el usuario
     **/
    public void setUsername(String username) {
        this.username = username;
    }
    
        /**
     * @return rol del usuario
     **/
    public String getRol() {
        return rol;
    }
    /**
     * @param rol es el usuario
     **/
    public void setRol(String rol) {
        this.rol = rol;
    }
    
}