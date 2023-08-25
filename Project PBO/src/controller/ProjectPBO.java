/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import projek.splash;
import projek.Login;

/**
 *
 * @author Bayu Biantara
 */
public class ProjectPBO {
   
    public static void main (String[] args) {
        splash sp = new splash ();
        sp.setVisible(true);
        Login lgn = new Login();
        
        try {
            for (int i = 0; i<=100; i++) {
                Thread.sleep(i);
               sp.Time.setText(Integer.toString(i)+"%");
               sp.prog.setValue(i);
                if (i == 100) {
                    sp.setVisible(false);
                    lgn.setVisible(true);
                }
            }
                
            }catch (Exception e) {
        }
    }
 }