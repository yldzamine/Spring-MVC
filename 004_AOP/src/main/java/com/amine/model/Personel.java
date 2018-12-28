package com.amine.model;

public class Personel {

	private String adi,soyadi;
	private int tecrube;
	
	public void Adsoyadkontrol() {
		System.out.println("Ad soyad kontrol et.................");
		if(getAdi().length()<2 || getSoyadi().length()<2) {
			throw new IllegalArgumentException();
		}
	}
	
	public void selamlama(String mesaj) {
		System.out.println("Selamlama............Benden selam olsun gençler");
		System.out.println("GELEN MESAJ :" + mesaj);
			}
	
	public void Personelbilgiver() {
		System.out.println("............Personel Bilgisini Ver...........");
		System.out.println("ADI :" +getAdi()+
				           "SOYADI :" +getSoyadi()+
				           "\nTECRÜBE :" +getTecrube());
	}
	
	//-------------------------------
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	//-------------------------------
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	//-------------------------------
	public int getTecrube() {
		return tecrube;
	}
	public void setTecrube(int tecrube) {
		this.tecrube = tecrube;
	}
}
