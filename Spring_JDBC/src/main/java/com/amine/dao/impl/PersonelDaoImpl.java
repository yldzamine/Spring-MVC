package com.amine.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.amine.dao.PersonelDao;
import com.amine.model.Personel;

public class PersonelDaoImpl implements PersonelDao {

	private Connection baglanti = null;
	private String Sqlkodu = null;
	private DataSource verikaynagi;
	
	
	
	public Connection getBaglanti() {
		return baglanti;
	}

	public void setBaglanti(Connection baglanti) {
		this.baglanti = baglanti;
	}

	public String getSqlkodu() {
		return Sqlkodu;
	}

	public void setSqlkodu(String sqlkodu) {
		Sqlkodu = sqlkodu;
	}

	public DataSource getVerikaynagi() {
		return verikaynagi;
	}

	public void setVerikaynagi(DataSource verikaynagi) {
		this.verikaynagi = verikaynagi;
	}

	@Override
	public void Ekle(Personel personel) {
		Sqlkodu = "INSERT INTO deneme.personel (adi, soyadi, tecrube) "
				   + "VALUES (?,?,?)";
		Connection baglanti = null;
		try {
			baglanti = verikaynagi.getConnection();
			PreparedStatement preparedStatement= baglanti.prepareStatement(Sqlkodu);
			preparedStatement.setString(1, personel.getAdi());
			preparedStatement.setString(1, personel.getSoyadi());
			preparedStatement.setInt(1, personel.getTecrube());
			
			preparedStatement.executeUpdate();
			preparedStatement.close();
		}
		catch(SQLException e){
			throw new RuntimeException();
			}
		finally{
			if(baglanti != null) {
				try {
				baglanti.close();
			}
				catch(SQLException e){
					
				}
			}
			}
	}

	@Override
	public Personel IdAra(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personel adiAra(String adi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personel soyadiAra(String soyadi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personel tecrubeAra(int tecrube) {
		// TODO Auto-generated method stub
		return null;
	}

}
