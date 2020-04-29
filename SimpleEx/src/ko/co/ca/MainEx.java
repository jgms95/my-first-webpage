package ko.co.ca;
import com.naver.*;

public class MainEx {
	public static void main(String[] args) {
		
		Monster m = new Monster(10); //10 = hp
		Weapon[] weapons = {new Bow("활",1), new Sword("검",5), new Hammer("망치",10)};
		int hasWeaponIdx = 0;
		
		Hero spyderman = new Hero(weapons, hasWeaponIdx);
		spyderman.attack(m);
		spyderman.attack(m);
		try {
			spyderman.changeWeapon(1);
		} catch (NoHaveWeaponException e1) {
			System.out.println("무기 변경에 실패했습니다.");
		}
		spyderman.attack(m);
		try {
			spyderman.changeWeapon(100);
		} catch (NoHaveWeaponException e) {
			System.out.println("무기 변경에 실패했습니다.");
		}
		
		
		
	}
}
