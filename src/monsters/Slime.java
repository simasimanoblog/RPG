package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {

	public Slime(String name, String weapon) {
		super(name, weapon);
		// TODO 自動生成されたコンストラクター・スタブ
		this.hp = Dice.get(70, 130);
		this.offensive = Dice.get(5, 11);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
