interface SwimBehavior {
    void swim();
}

interface FlyBehavior {
    void fly();
}

interface QuackBehavior {
    void quack();
}

// Abstract class Duck implementing SwimBehavior
abstract class Duck implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("Swimming");
    }
}

// RubberDuck class
class RubberDuck extends Duck implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

// WoodenDuck class
class WoodenDuck extends Duck {
    // WoodenDuck is mute, so no quack implementation
}

// RedHeadDuck class
class RedHeadDuck extends Duck implements FlyBehavior, QuackBehavior {
    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

// LakeDuck class
class LakeDuck extends Duck implements FlyBehavior, QuackBehavior {
    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
