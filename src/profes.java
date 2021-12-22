
import java.util.Date;


public class profes {
    
    private final int nump;
    private final String nomp;
    private final String prenomp;
    private final Date datedp;
    private final String matiere;
    
    public profes(int MAT, String Firstname ,String Lastname,Date Birthdate,String Mat){
     this.nump=MAT; this.nomp=Firstname; this.prenomp=Lastname; this.datedp=Birthdate; this.matiere=Mat;
    }
    
   public int getMAT(){return nump;}
     public String getFirstname(){return nomp;}
     public String getLastname(){return prenomp;}
     public String getMat(){return matiere;}
     public Date getdate(){return datedp;} 
    
}
