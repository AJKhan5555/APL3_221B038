class Vikarn extends Kaurav {
    @Override
    void obey() {
        System.out.println("Vikarn obeying");
    }

    @Override
    void kind() {
        System.out.println("Vikarn being kind");
    }
}

abstract class Pandav extends Bharatvanshi {
    @Override
    void fight() {
        System.out.println("Pandav fighting");
    }

    @Override
    void obey() {
        System.out.println("Pandav obeying");
    }

    @Override
    void kind() {
        System.out.println("Pandav being kind");
    }
}

class Arjun extends Pandav {
    // Inherits fight(), obey(), and kind() from Pandav
}

class Bheem extends Pandav {
    @Override
    void kind() {
        System.out.println("Bheem being less kind");
    }
}

public class Test {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        System.out.println("Arjun:");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        System.out.println("\nBheem:");
        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println("\nDuryodhan:");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        System.out.println("\nVikarn:");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
