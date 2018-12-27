package com.example.amel.test;

/**
 * Created by Amel on 11/11/2018.
 */


public class Contact {
    String Name,tel;
    String prenom;

    public Contact(String name, String password, String tel) {
        Name = name;
        this.tel = tel;
        this.prenom = password;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPassword(String lastName) {
        prenom = lastName;
    }

    public String getPassword() {
        return prenom;
    }
    public String getName() {

        return Name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
