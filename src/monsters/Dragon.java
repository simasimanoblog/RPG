package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {

	public Dragon(String name, String weapon) {
		super(name, weapon);
		// TODO 自動生成されたコンストラクター・スタブ
		this.hp = Dice.get(270, 330);
		this.offensive = Dice.get(12, 18);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
