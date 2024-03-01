package mobil;

public class handphone{
    private String brand;
    private String warna;
    private int memory;
    private double harga;

    public void setbrand(String s){
        brand = s;
    }
    public void setwarna(String s){
        warna = s;
    }
    public void setmemory(int i){
        memory = i;
    }
    public void setharga(double d){
        harga = d;
    }
    public String getbrand(){
        return brand;
    }public String getwarna(){
        return warna;
    }
    public int getmemory(){
        return memory;
    }
    public double getharga(){
        return harga;
    }

    public void displayMessage(){
        System.out.println("HP Anda beremerek " + brand);
        System.out.println("HP Anda berwarna " + warna );
        System.out.println("HP Anda adalah memiliki memory "+ memory);
        System.out.println("HP Anda Diharga "+ harga );
    }
}
