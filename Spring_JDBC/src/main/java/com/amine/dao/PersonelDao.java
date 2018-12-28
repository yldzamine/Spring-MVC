package com.amine.dao;

import com.amine.model.Personel;

public interface PersonelDao {

	public void Ekle(Personel personel);
	public Personel IdAra(int id);
	public Personel adiAra(String adi);
	public Personel soyadiAra(String soyadi);
	public Personel tecrubeAra(int tecrube);
	
	//public Personel PersonelAra(int id,String adi,String soyadi,int tecrube);
	
}
