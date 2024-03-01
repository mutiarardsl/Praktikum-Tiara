package mobil;

public class mainHandphone{
    public static void main(String[] args){
        handphone hp1 = new handphone();
        hp1.setbrand("Samsung");
        hp1.setwarna("Hijau");
        hp1.setmemory(128);
        hp1.setharga(8000000);

        String warna = hp1.getwarna();
        System.out.println(warna);

        handphone hp2 = new handphone();
        hp2.setbrand("Oppo");
        hp2.setwarna("Putih");
        hp2.setmemory(256);
        hp2.setharga(6000000);

        
    }
}
