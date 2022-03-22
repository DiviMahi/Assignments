package com.dv.codingjava;

public class Kpop extends Pop {
	String BandName;

	public Kpop(String Type, String PT, String BD) {
		super(Type, PT);
		BandName = BD;
	}

	public static void main(String[] args) {
		Kpop Kpop = new Kpop("Pop Music", "Kpop", "BTS");
		
		System.out.println("Music Type:" + Kpop.MusicType);
		System.out.println("Pop Type:" + Kpop.PopType);
		System.out.println("Band Name:" + Kpop.BandName);
		
		Kpop kpop=new Kpop("Pop Music","Electro pop","TXT");
		System.out.println("Music Type:" + kpop.MusicType);
		System.out.println("Pop Type:" + kpop.PopType);
		System.out.println("Band Name:" + kpop.BandName);

	}
}
 