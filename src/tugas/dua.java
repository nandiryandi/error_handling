package tugas;
public class dua {
    public static void main(String[] args) {
    byte [] b = new byte[5];

    try {
        System.out.print("Masukkan Kata : ");
        System.in.read(b);
        System.out.println("Hasil : " + (char) b[0]+ (char) b[1]+ (char) b[2]);

        //Input  : ngulik
        //Output : ngu (karena mengambil 3 huruf pertama)
    }

    catch (java.io.IOException e){
        //TODO handle exception
    }
}
}
