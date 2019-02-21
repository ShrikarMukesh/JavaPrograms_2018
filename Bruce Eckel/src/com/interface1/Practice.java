package com.interface1;
interface CanFight {
	  void fight();
	}

	interface CanSwim {
	  void swim();
	}

	interface CanFly {
	  void fly();
	}

	class ActionCharacter {
	  public void fight() {}
	}

	class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
		
		public void fly() {
						
		}		
		public void swim() {
			
		}

	}
public class Practice {

}
