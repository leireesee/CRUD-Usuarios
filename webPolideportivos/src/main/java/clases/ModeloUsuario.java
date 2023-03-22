package clases;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ModeloUsuario extends Conector {
	
	
	//CONSEGUIR TODOS LOS USUARIOS
	public ArrayList<Usuario> getUsuarios(){
			
			String sentenciaGetUsuarios = "SELECT * FROM usuarios";
			
			ArrayList<Usuario> usuarios = new ArrayList<>();
			
			try {
				
				PreparedStatement st = this.conexion.prepareStatement(sentenciaGetUsuarios);
				
				ResultSet rst = st.executeQuery();
				
				while(rst.next()) {
					
					Usuario usuario = new Usuario();
					
					usuario.setId(rst.getInt("id"));
					usuario.setNombre(rst.getString("nombre_apellido"));
					
					
					usuarios.add(usuario);
					
				}
				
				return usuarios;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
			
	}
	
	//CONSEGUIR 1 UNIDAD DE USUARO
	public Usuario getUsuario(int id) {
		
		Usuario usuario = new Usuario();
		
		String sentenciaGetUsuario = "SELECT * FROM usuarios WHERE id = ?";
		
		try {
			PreparedStatement st = this.conexion.prepareStatement(sentenciaGetUsuario);
			
			st.setInt(1, id);
			
			ResultSet rst = st.executeQuery();
			
			rst.next();
			
			usuario.setId(rst.getInt("id"));
			usuario.setNombre(rst.getString("nombre_apellido"));
			
			return usuario;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	

	//ELIMINAR USUARIO
	public void eliminarUsuario(int id) {
		
		String sentenciaEliminarUsuario = "DELETE FROM usuarios WHERE id = ?";
		
		try {
			PreparedStatement st = this.conexion.prepareStatement(sentenciaEliminarUsuario);
			
			st.setInt(1, id);
			
			st.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//INSERTAR USUARIO
	public void insertarUsuario(Usuario usuario) {
		
		String sentenciaInsertarUsuario = "INSERT INTO usuarios (nombre_apellido) VALUES (?)";
		
		try {
			PreparedStatement st = this.conexion.prepareStatement(sentenciaInsertarUsuario);
			
			st.setString(1, usuario.getNombre());
			
			st.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//MODIFICAR USUARIO
	public void modificarUsuario(Usuario usuario) {
		
		String sentenciaModificarUsuario = "UPDATE usuarios SET nombre_apellido = ? WHERE id = ?";
		
		try {
			PreparedStatement st = this.conexion.prepareStatement(sentenciaModificarUsuario);
			
			st.setString(1, usuario.getNombre());
			st.setInt(2, usuario.getId());
			
			st.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
