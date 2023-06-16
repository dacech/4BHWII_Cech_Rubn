public class Endrekursion {
    public static void main(String[] args) {

        System.out.println("Endrekursion");
        System.out.println(TotalSum(1));    //darf nicht null sein!!!!
    }


    static int TotalSum(int n) {

        return AddSum(0, n);
    }

    static int AddSum(int m, int n) {

        if(n == 1 || n == m) {
            return m + 1;
        }


        else {

            return AddSum(m + n, n - 1)  ;
        }
    }
}
