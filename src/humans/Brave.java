package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {

	public Brave(String name, String weapon) {
		//Humanのコンストラクタ
		super(name, weapon);
		// HPと攻撃力を乱数で設定
		this.hp = Dice.get(170, 230);
		this.offensive = Dice.get(7, 13);
	}
}
