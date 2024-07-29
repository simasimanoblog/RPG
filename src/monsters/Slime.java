package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {

	public Slime(String name, String weapon) {
		//Monsterのコンストラクタ
		super(name, weapon);
		// HPと攻撃力を乱数で設定
		this.hp = Dice.get(70, 130);
		this.offensive = Dice.get(5, 11);
	}
}
