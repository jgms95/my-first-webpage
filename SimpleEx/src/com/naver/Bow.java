package com.naver;

public class Bow extends Weapon{
	
	public Bow() {
		
	}
	
	public Bow(String name, int attackPower) {
		super(name, attackPower);
	}

	@Override
	public void describe() {
		System.out.println("화살을 마구 쏩니다.");
	}

	@Override
	public String toString() {
		return super.getName();
	}
	
	

}
