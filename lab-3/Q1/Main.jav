
public class Main {
    public static void main(String[] args) {
        
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi duryodhan = new Duryodhan();
        Bharatvanshi vikarn = new Vikarn();

        
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