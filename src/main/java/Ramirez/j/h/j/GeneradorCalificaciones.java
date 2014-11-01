/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ramirez.j.h.j;

import java.util.ArrayList;
import static javax.swing.text.html.HTML.Tag.S;
import org.hibernate.loader.custom.Return;

/**
 *
 * @author T107
 */
public class GeneradorCalificaciones implements Calif {
    
    ArrayList<Evaluacion> eva;
    String s = "";
    
    public void Evaluacion(){
        
    }
        
    public String cali(String parametro) {
       
        
        eva.add(new Evaluacion("Petra", (float) 8.5));
        eva.add(new Evaluacion("Jose", (float)7.4));
        eva.add(new Evaluacion("Roberta", (float) 8.6));
        
        for ( Evaluacion e : s ){
            
            if( s.equalsIgnoreCase(parametro)  );
                       
        }
    
        return s;
        
}
