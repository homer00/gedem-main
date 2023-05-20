package comConnexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;
 
public class TabEtudiant {
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection con = null;
     
    private String nom;
    private String prenom;
    private String tel;
    private String mail;
     
    public TabEtudiant() {
     
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
     
    public ArrayList<TabEtudiant> afficher(){
        ArrayList<TabEtudiant> ar = new ArrayList<TabEtudiant>();
        String select = "SELECT * FROM etudiant";
        con = ConnexionDB.getCon();
        try {
            ps= con.prepareStatement(select);
            rs = ps.executeQuery();
            while(rs.next()) {
            	TabEtudiant etudiant = new TabEtudiant();
                etudiant.setNom(rs.getString("nom"));
                etudiant.setPrenom(rs.getString("prenom"));
                etudiant.setMail(rs.getString("mail"));
                etudiant.setTel(rs.getString("tel"));
                ar.add(etudiant);
                 
            }
        } catch (SQLException e) {
             
            e.printStackTrace();
        }
         
        return ar;
    }
}
