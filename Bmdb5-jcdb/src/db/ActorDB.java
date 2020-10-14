
package db;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor;

public class ActorDB implements DAO<Actor> {
	
	//p. 677
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
		String username = "bmdb_user";
		String password = "sesame";
		
		Connection conn = DriverManager.getConnection(
				dbURL, username, password);
		return conn;
		
	}

	@Override
	public Actor get(int id) {
		Actor a = null;
		String sql = "select * from actor where id = ?";
		
		try(Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)){
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()){
			 a = getActorFromResultSet(rs);
			}
		}catch (SQLException e) {
				e.printStackTrace();
			}
		return a;
	}

	@Override
	public List<Actor> getAll() {
		List<Actor> actors = new ArrayList<>();
		String sql = "select * from actor;";
		//p. 679
		try (Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);){	
			
			//p. 681 - process result set
			while (rs.next()) {
				Actor a = getActorFromResultSet(rs);
				actors.add(a);
			}
			
		} catch (SQLException e) {
			System.out.println("Error getting all actors!");
			e.printStackTrace();
			actors = null;
		}
		return actors;
	}

	private Actor getActorFromResultSet(ResultSet rs) throws SQLException {
		int id = rs.getInt(1);
		String fn = rs.getString(2);
		String ln = rs.getString(3);
		String g = rs.getString(4);
		String bdStr = rs.getString(5);
		LocalDate bd = LocalDate.parse(bdStr);
		Actor a = new Actor(id,fn,ln,g,bd);
		return a;
	}

	@Override
	public boolean add(Actor a) {
		boolean success = false;
		String sql = "insert into actor (FirstName,LastName,Gender,BirthDate)"
				+ "values (?, ?, ?, ?) ";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, a.getFirstName());
			ps.setString(2, a.getLastName());
			ps.setString(3, a.getGender());
			ps.setString(4, a.getBirthDate().toString());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			System.out.println("Error adding actor!");
			e.printStackTrace();
		}
		return success;
	}
	@Override
	public boolean update(Actor a) {
boolean success = false;
		String sql = "update actor set "+
				"firstName = ?, "+
				"lastName = ?, "+
				"gender = ?, "+
				"birthDate = ? "+
				 "where id = ?";
		try(Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)){
			
			ps.setString(1, a.getFirstName());
			ps.setString(2, a.getLastName());
			ps.setString(3, a.getGender());
			ps.setString(4, a.getBirthDate().toString());
			ps.setInt(5, a.getId());
			ps.executeUpdate();
			success = true;
			}catch (SQLException e) {
				System.out.println("Error updating actor");
				e.printStackTrace();
			}
		return success;	
	
	}

	@Override
	public boolean delete(Actor a) {
		boolean success = false;
		String sql = "delete actor set"+
				 " where id = ?;";
		try(Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)){
			ps.setInt(1, a.getId());
			ps.executeUpdate();
			success = true;
			}catch (SQLException e) {
				System.out.println("Error deleteing actor");
				e.printStackTrace();
			}
		return success;	
	}
	@Override
	public List<Actor> findbylname(String lName) {
		List<Actor> actors = new ArrayList<>();
		//p. 679
		
		String sql = "SELECT * FROM actor" + 
				" where LastName = ?";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql);
			 ) {
			ps.setString(1, lName);
			ResultSet rs = ps.executeQuery();
			//p. 681 - process result set
			while (rs.next()) {
				Actor a = getActorFromResultSet(rs);
				actors.add(a);
			}
			
		} catch (SQLException e) {
			System.out.println("Error getting all actors!");
			e.printStackTrace();
			actors = null;
		}
		return actors;
	}

	

}
