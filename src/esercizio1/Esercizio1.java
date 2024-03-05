package esercizio1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Esercizio1 {

    public static boolean stringaPariDispari(String string) {
        if (string.length() % 2 == 0){
          return true;
        }
        else {
            return false;
        }
    }


 public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0  ) {
            return true;
        }
        else if (anno % 100 == 0 && anno % 400 == 0){
            return true;
        }
        else {
            return false;
        }
 }


    public static void main(String[] args) {

        System.out.println(stringaPariDispari("hello"));
        System.out.println (annoBisestile(2025));
    }
}