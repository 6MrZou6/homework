
public class PlayerClass {
public static void main(String[] args) {
	Factory factory=(Factory)XMLUtil.getBean();
	Hero hero=factory.SelectHero();
	hero.fight();
}
}
