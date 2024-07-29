package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {

	public Wizard(String name, String weapon) {
		super(name, weapon);
		// TODO 自動生成されたコンストラクター・スタブ
		this.hp = Dice.get(120, 180);
		this.offensive = Dice.get(12, 18);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
