public class Test {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        System.out.println("Rubber Duck:");
        rubberDuck.swim();
        if (rubberDuck instanceof QuackBehavior) {
            ((QuackBehavior) rubberDuck).quack();
        }

        System.out.println("\nWooden Duck:");
        woodenDuck.swim();

        System.out.println("\nRed Head Duck:");
        redHeadDuck.swim();
        if (redHeadDuck instanceof FlyBehavior) {
            ((FlyBehavior) redHeadDuck).fly();
        }
        if (redHeadDuck instanceof QuackBehavior) {
            ((QuackBehavior) redHeadDuck).quack();
        }

        System.out.println("\nLake Duck:");
        lakeDuck.swim();
        if (lakeDuck instanceof FlyBehavior) {
            ((FlyBehavior) lakeDuck).fly();
        }
        if (lakeDuck instanceof QuackBehavior) {
            ((QuackBehavior) lakeDuck).quack();
        }
    }
}
