package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {

	public Wizard(String name, String weapon) {
		//Humanのコンストラクタ
		super(name, weapon);
		// HPと攻撃力を乱数で設定
		this.hp = Dice.get(120, 180);
		this.offensive = Dice.get(12, 18);
	}
}
