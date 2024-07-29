package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {

	public Fighter(String name, String weapon) {
		//Humanのコンストラクタ
		super(name, weapon);
		// HPと攻撃力を乱数で設定
		this.hp = Dice.get(240, 300);
		this.offensive = Dice.get(17, 23);
	}
}
