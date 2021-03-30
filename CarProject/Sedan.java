public class Sedan implements vehicle {
    public void Brake() {
        System.out.println("This is how a sedan applies the brakes.");
    }
    
    public int getCylinders() {
        System.out.println("This is how many cyclinders the sedan has.");        
        return 4;
    }
    
    public void Drive() {
        System.out.println("This is how to drive a sedan.");
    }
    
}
