/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author santoshm
 */
public class conexion {
	public String db="bdreserva"; 
	public String url="jdbc:mysqlo://localhost/" + db;
	public String user="root";
	public String pass="";

	public conexion() {
	}
	
	public Connection conectar(){
		Connection link=null;
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			link=DriverManager.getConnection(this.url, this.user, this.pass);
		} catch (ClassNotFoundException | SQLException e) {
			JOptionPane.showConfirmDialog(null, e);
		}
		
		return link;
	}
}