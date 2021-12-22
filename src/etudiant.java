/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
/**
 *
 * @author ROSS
 */
public class etudiant {
    private final int nume;
    private final String nome;
    private final String prenmoe;
    private final Date datee;
    private final String niveau;
    
    public etudiant(int MAT, String Firstname ,String Lastname,Date Birthdate,String Mat){
     this.nume=MAT; this.nome=Firstname; this.prenmoe=Lastname; this.datee=Birthdate; this.niveau=Mat;
    }
    
   public int getMAT(){return nume;}
     public String getFirstname(){return nome;}
     public String getLastname(){return prenmoe;}
     public String getMat(){return niveau;}
     public Date getdate(){return datee;} 
    
}
