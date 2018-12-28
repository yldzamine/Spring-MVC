package com.amine;

public class Yazar {

	private String yazaradi;
	private String yazarsoyadi;
	Kitap kitap;
	
	public String getYazaradi() {
		return yazaradi;
	}
	public void setYazaradi(String yazaradi) {
		this.yazaradi = yazaradi;
	}
	public String getYazarsoyadi() {
		return yazarsoyadi;
	}
	public void setYazarsoyadi(String yazarsoyadi) {
		this.yazarsoyadi = yazarsoyadi;
	}
	public Kitap getKitap() {
		return kitap;
	}
	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}
	@Override
	public String toString() {
		return "Yazar [yazaradi=" + yazaradi + ", yazarsoyadi=" + yazarsoyadi + ", kitap=" + kitap + "]";
	}
	
}
