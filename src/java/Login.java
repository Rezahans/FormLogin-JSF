/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author Reza Hans
 */
@ManagedBean(name="value_login", eager = true)
@SessionScoped

public class Login implements Serializable {
     public String email,password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String Login(){
        String Email = this.email;
        String Password = this.password;
        {
        this.email = Email;
        this.password = Password;
        if(email.equals("rezahanslatif")&&password.equals("123456")){
            
            return"LoginSucces";
        } else{
            return"LoginFailed";
        }
    }
    }
}
