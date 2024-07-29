package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {

	public Oak(String name, String weapon) {
		super(name, weapon);
		// TODO 自動生成されたコンストラクター・スタブ
		this.hp = Dice.get(170, 230);
		this.offensive = Dice.get(9, 15);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
