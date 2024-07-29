package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {

	public Oak(String name, String weapon) {
		//Monsterのコンストラクタ
		super(name, weapon);
		// HPと攻撃力を乱数で設定
		this.hp = Dice.get(170, 230);
		this.offensive = Dice.get(9, 15);
	}
}
