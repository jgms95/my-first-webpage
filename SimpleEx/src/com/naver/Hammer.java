package com.naver;

public class Hammer extends Weapon{
	
	public Hammer() {
		super("망치",10);
	}
	
	public Hammer(String name, int attackPower) {
		super(name, attackPower);
	}

	@Override
	public void describe() {
		System.out.println("망치로 마구 때립니다.");
	}

	@Override
	public String toString() {
		return super.getName();
	}

}
