/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
/**
 *
 * @author ROSS
 * 
 */
public class employe {
   
    private final int numem;
    private final String nomdfam;
    private final String prenom;
    private final Date dated;
    private final String fonc;
    
    public employe(int MAT, String Firstname ,String Lastname,Date Birthdate,String Mat){
     this.numem=MAT; this.nomdfam=Firstname; this.prenom=Lastname; this.dated=Birthdate; this.fonc=Mat;
    }
    
   public int getMAT(){return numem;}
     public String getFirstname(){return nomdfam;}
     public String getLastname(){return prenom;}
     public String getMat(){return fonc;}
     public Date getdate(){return dated;} 
    
}
