package tugas;
public class tiga {
    public static void main(String[] args) {
    byte [] b = new byte [5];
    System.out.print("Input Bilangan Bulat : ");

    try {
        System.in.read(b);
    }

    catch (java.io.IOException e){
        int N = Integer.valueOf(b).intValue();
        System.out.println("Hasil : " +(N+2));

    //Error : valueOf tidak menerima parameter tipe byte 

    //Cara konversi byte array ke string
    //Buat objek string dan menetapkan byte array padanya
    }
}
}
