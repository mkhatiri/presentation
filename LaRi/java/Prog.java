public class Prog {

    public static void main(String[] args) {
        Integer size = 100;
        Integer[] a = new Integer[size];
        Integer[] b = new Integer[size];
        Integer[] c = new Integer[size];

        for(int i = 0; i<size; i++ ){
            a[i] = 10;
            b[i] = 25;
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }
        System.out.println("fin de calcul");
    }

}


