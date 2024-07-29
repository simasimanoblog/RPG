package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {

	public Brave(String name, String weapon) {
		super(name, weapon);
		// TODO 自動生成されたコンストラクター・スタブ
		this.hp = Dice.get(170, 230);
		this.offensive = Dice.get(7, 13);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
