/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assm.Objects;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class Login implements Serializable {

    public static final String baseUser = "admin";
    public static final String basePassword = "1234";
    private String usr;
    private String pwd;

    //Constructors
    public Login() {
    }

    public Login(String usr, String pwd) {
        this.usr = usr;
        this.pwd = pwd;
    }

    //Getters & Setters
    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
