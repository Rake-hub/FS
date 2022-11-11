
public class Arrays {

    public static void main(String[] args) {

        int numeros[] = new int[10];
        char[] letras;
        letras = new char[4];

        letras[0] = 'h';
        letras[1] = 'o';
        letras[2] = 'l';
        letras[3] = 'a';

        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i]);
        }
        System.out.println(" ");

        String paises[] = {"Holanda", "Bélgica", "Luxemburgo",};
        try {
            String cadena = null;
            int longitud = cadena.length();
            System.out.println(paises[3]);
        } catch (IndexOutOfBoundsException iob) {   
            System.out.println("Error 1");
        } catch (NullPointerException np) {
            System.out.println("Error 2");
        }catch(Exception e){
            System.out.println("Error general");
        }finally {
            System.out.println("Esta parte siempre se ejecuta");
        }

        System.out.println("Fin del programa");
    }

}
