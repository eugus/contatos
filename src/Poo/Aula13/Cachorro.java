package Poo.Aula13;

public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("au au au billie jean is not my lover");
    }
    public void reagir(String frase){
        if (frase.equalsIgnoreCase("to comida")||frase.equalsIgnoreCase("oi fofo")){
            System.out.println("abanar e sorriso");
        }else {
            System.out.println("rosnar");
        }
    }
    public void reagir(int hora){
        if (hora<12){
            System.out.println("abanar");
        }else if (hora >= 18){
            System.out.println("ignorado otario");
        }else {
            System.out.println("abanar e latir");
        }
    }
    public void reagir(boolean dono){
        if (dono){
            System.out.println("abanar");
        }else {
            System.out.println("rosnar");
        }
    }
    public void reagir(int idade,double peso){
        if (idade<5){
            if (peso<10){
                System.out.println("abanar");
            }else {
                System.out.println("rosnar");
            }
        } else{
            if (peso<10){
                System.out.println("rosnar");
            }else {
                System.out.println("ignorado otario");
            }
        }
    }
}
