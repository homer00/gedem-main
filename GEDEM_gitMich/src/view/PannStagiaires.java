package view;


import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
public class PannStagiaires
{   private static Connection con;
private JButton btn1;
private JButton btn2;
private static JButton btnsupp;
private static JButton btnenreg;
private JButton btnimprim;
private JButton btnmodif;

private JButton btnannul;
private JLabel jLabel1;
private JLabel jLabel2;
private JLabel jLabel3;
private JLabel jLabel4;
private JLabel jLabel5;
private JLabel jLabel6;
private JLabel jLabel7;
private JLabel jLabel8;
private JPanel jPanel1;
private JPanel jPanel2;
private JPanel jPanel3;
private JScrollPane jScrollPane1;
private static JTable table;
private static JTextField jtextid;
private static JTextField jtextnom;
private static JTextField jtextprenom;
private static JTextField jtexttel;
private static JTextField jtextmail;
private static JTextField jtextlogin;
private static JTextField jtextmdp;






public static JPanel newJPanel(){

JPanel panel13 = new JPanel();
panel13.setLayout(null);
panel13.setPreferredSize(new Dimension(1010, 520));
panel13.setBackground(Color.white);
Container container = new Container();
container.add(panel13);
JPanel panelA = new JPanel();
panelA.setBounds(20,20,710,380); 
panelA.setBackground(Color.white);
JPanel panelB = new JPanel();
panelB.setBounds(730,0,250,400); 
panelB.setBackground(Color.white);
JPanel panelC = new JPanel();
panelC.setBounds(0,400,1010,120); 
panelC.setBackground(Color.white);
panel13.add(panelA);
panel13.add(panelB);
panel13.add(panelC);
panelC.setLayout(new FlowLayout(FlowLayout.CENTER, 15,25));
JButton btn1 = new JButton("IMPRIMER");
panelC.add(btn1);
JButton btn2 = new JButton("ANNULER");
panelC.add(btn2);
JButton btn3 = new JButton("ENREGISTRER");
panelC.add(btn3);
JButton btn4 = new JButton("MODIFIER");
panelC.add(btn4);
JButton btn5 = new JButton("SUPPRIMER");
panelC.add(btn5);
//panelC.setBackground(new Color(226, 234, 242));
btn1.setPreferredSize(new Dimension(180, 60));
btn2.setPreferredSize(new Dimension(180, 60));
btn3.setPreferredSize(new Dimension(180, 60));
btn4.setPreferredSize(new Dimension(180, 60));
btn5.setPreferredSize(new Dimension(180, 60));
btn1.setBackground(new Color(65,164, 191));
btn2.setBackground(new Color(65,164, 191));
btn3.setBackground(new Color(19, 141, 117));
btn4.setBackground(new Color(65,164, 191));
btn5.setBackground(new Color(255, 0, 19 ));
btn1.setForeground(Color.WHITE);
btn2.setForeground(Color.WHITE);
btn3.setForeground(Color.WHITE);
btn4.setForeground(Color.WHITE);
btn5.setForeground(Color.WHITE);
btn1.setBorder(null);
btn2.setBorder(null);
btn3.setBorder(null);
btn4.setBorder(null);
btn5.setBorder(null);
btn1.setMargin(new Insets(0,0,0,0));
btn2.setMargin(new Insets(0,0,0,0));
btn3.setMargin(new Insets(0,0,0,0));
btn4.setMargin(new Insets(0,0,0,0));
btn5.setMargin(new Insets(0,0,0,0));
btn1.setHorizontalAlignment(JButton.CENTER);
btn2.setHorizontalAlignment(JButton.CENTER);
btn3.setHorizontalAlignment(JButton.CENTER);
btn4.setHorizontalAlignment(JButton.CENTER);
btn5.setHorizontalAlignment(JButton.CENTER);
btn1.setFont(new Font("Arial", Font.BOLD, 15));
btn2.setFont(new Font("Arial", Font.BOLD, 15));
btn3.setFont(new Font("Arial", Font.BOLD, 15));
btn4.setFont(new Font("Arial", Font.BOLD, 15));
btn5.setFont(new Font("Arial", Font.BOLD, 15));



panelB.setBackground(new java.awt.Color(238, 245, 247));
panelB.setBorder(BorderFactory.createCompoundBorder(
BorderFactory.createLineBorder(Color.magenta, 2),
BorderFactory.createEmptyBorder(0, 10, 10, 10)));
Border LoweredBevelBorder = BorderFactory.createLoweredBevelBorder();
panelB.setBorder(BorderFactory.createTitledBorder(LoweredBevelBorder, "Stagiaire",
TitledBorder.RIGHT,TitledBorder.TOP, 
new Font("Arial", Font.BOLD , 20), new Color(65,164, 191)));
JLabel label1 = new JLabel();
JLabel label2 = new JLabel();
JLabel label3 = new JLabel();
JLabel label4 = new JLabel();
JLabel label5 = new JLabel();
JLabel label6 = new JLabel();
JLabel label7 = new JLabel();
panelB.setLayout(null);
label1.setFont(new java.awt.Font("Tahoma", 1, 14));
label1.setForeground(new Color(65,164, 191));
label1.setText("Id");
panelB.add(label1);
label1.setBounds(30, 40, 81, 26);
label2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
label2.setForeground(new Color(65,164, 191));
label2.setText("Nom");
panelB.add( label2);
label2.setBounds(30, 90, 81, 26);
label3.setFont(new java.awt.Font("Tahoma", 1, 14));
label3.setForeground(new Color(65,164, 191));
label3.setText("Prénom");
panelB.add( label3);
label3.setBounds(30, 140, 81, 26);
label4.setFont(new java.awt.Font("Tahoma", 1, 14));
label4.setForeground(new Color(65,164, 191));
label4.setText("Tel");
panelB.add(label4);
label4.setBounds(30, 190, 81, 26);
label5.setFont(new java.awt.Font("Tahoma", 1, 14));
label5.setForeground(new Color(65,164, 191));
label5.setText("Mail");
panelB.add( label5);
label5.setBounds(30, 240, 81, 26);
label6.setFont(new java.awt.Font("Tahoma", 1, 14));
label6.setForeground(new Color(65,164, 191));
label6.setText("Login");
panelB.add( label6);
label6.setBounds(30, 290, 81, 26);
label7.setFont(new java.awt.Font("Tahoma", 1, 14)); 
label7.setForeground(new Color(65,164, 191));
label7.setText("MDP");
panelB.add( label7);
label7.setBounds(30, 340, 81, 26);
JTextField text1 = new JTextField();
JTextField text2 = new JTextField();
JTextField text3 = new JTextField();
JTextField text4 = new JTextField();
JTextField text5 = new JTextField();
JTextField text6 = new JTextField();
JTextField text7 = new JTextField();
panelB.add(text1);
text1.setBounds(100, 37, 130, 25);
panelB.add(text2);
text2.setBounds(100, 87, 130, 25);
panelB.add(text3);
text3.setBounds(100, 137, 130, 25);
panelB.add(text4);
text4.setBounds(100, 187, 130, 25);
panelB.add(text5);
text5.setBounds(100, 237, 130, 25);
panelB.add(text6);
text6.setBounds(100, 287, 130, 25);
panelB.add(text7);
text7.setBounds(100, 337, 130, 25);


{
  try 
{
	  
	  con = Connexion.getCon();
	  
	  btn1.addActionListener(new ActionListener(){
			 
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    		
		    }

		});

		btn2.addActionListener(new ActionListener(){
			 
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    }

		});

		btn3.addActionListener(new ActionListener(){
			 
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	

		    }

		});

		btn4.addActionListener(new ActionListener(){
			 
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	

		    }

		});


		btn5.addActionListener(new ActionListener(){
			 
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	

		    }

		});

		
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
    String query = "SELECT * FROM stagiaire";
  
    Statement stm = con.createStatement();
    ResultSet res = stm.executeQuery(query);
  
    String columns[] = { "ID", "Nom", "Prenom", "Tel", "Mail", "Login", "MDP" };
    String data[][] = new String[17][7];
  
    int i = 0;
    while (res.next()) {
      int id = res.getInt("id");
      String nom = res.getString("nom");
      String prenom = res.getString("prenom");
      String tel = res.getString("tel");
      String mail = res.getString("mail");
      String login= res.getString("login");
      String mdp = res.getString("mdp");
      
      data[i][0] = id + "";
      data[i][1] = nom;
      data[i][2] = prenom;
      data[i][3] = tel;
      data[i][4] = mail;
      data[i][5] = login;
      data[i][6] = mdp;
      i++;
    }
  
    DefaultTableModel model = new DefaultTableModel(data, columns);
    JTable table = new JTable(model);
    table.setShowGrid(true);
    table.setShowVerticalLines(true);
    table.setForeground(new Color(0,0,0));
    
    panelA.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "LISTE STAGIAIRES", TitledBorder.CENTER, 
    TitledBorder.TOP , new Font("Arial", Font.BOLD , 20),(new Color(65,164, 191))));
   
    panelA.setBackground(Color.white);
    JTableHeader header;
    header = table.getTableHeader();
    header.setBackground(new Color(65,164, 191));
    Font bigFont = new Font("sansserif", Font.PLAIN, 18); 
    table.getTableHeader().setFont(bigFont);
    header.setForeground(Color.white);
    

     
 
  
    
    table.setRowHeight(20);
    table.getColumnModel().getColumn(0).setPreferredWidth(10);
    table.getColumnModel().getColumn(1).setPreferredWidth(70);
    table.getColumnModel().getColumn(2).setPreferredWidth(70);
    table.getColumnModel().getColumn(3).setPreferredWidth(60);
    table.getColumnModel().getColumn(4).setPreferredWidth(100);
    table.getColumnModel().getColumn(4).setPreferredWidth(80);
    table.getColumnModel().getColumn(4).setPreferredWidth(80);
    
    JScrollPane sp = new JScrollPane(table);
    sp.setPreferredSize(new Dimension(680, 330));
    
    
    
    
    
    
    
   
    panelA.add(sp);
    panel13.add(panelA);
 
    panel13.setLayout(null);
   
} catch(SQLException e) {
    e.printStackTrace();
  }

                                    
      
      


  }  






return panel13;


}
}





