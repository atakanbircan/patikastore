import java.util.Scanner;

public class Phone extends Product{




    public Phone(int price, String discount, int stock, String productName, String productBrand, int ram, int storage,
                 double screenSize, String color, int battery) {
        super(price, discount, stock, productName, productBrand, ram, storage, screenSize, color, battery);
    }




   /* public Phone( int price, String discountRate, int stock, String productName, String productBrand, int ram, int storage,
                 int screenSize, String battery, String color) {
        super( price, discountRate, stock, productName, productBrand, ram, storage, screenSize);
        this.battery=battery;
        this.color=color;
    }*/

    Scanner scanner=new Scanner(System.in);
    @Override
    public void addProduct() {
        System.out.print("Ürünün fiyatı : ");
        int price= scanner.nextInt();
        System.out.print("Ürünün adı : ");
        String name=scanner.nextLine();
        System.out.print("Ürünün indirim oranı : ");
        String discountRate= scanner.nextLine();
        System.out.println("Ürünün batarya büyüklüğü : ");
        int battery=scanner.nextInt();
        System.out.println("Ürünün rengi : ");
        String color=scanner.nextLine();
        System.out.print("Ürünün stoğu : ");
        int stock= scanner.nextInt();
        System.out.print("Ürünün rami : ");
        int ram= scanner.nextInt();
        System.out.print("Ürünün ekranı : ");
        double screenSize= scanner.nextDouble();
        System.out.print("Ürünün hafızası :");
        int storage= scanner.nextInt();
        //System.out.println("Ekran Listesi");
        Brand.printBrands();
        System.out.print("Lütfen seçtiğiniz marka ismini giriniz : ");
        String brand=scanner.nextLine();
        //Brand brand=Brand.getBrand(scanner.nextInt());
        Phone phone =new Phone(price,discountRate,stock,name,brand,ram,storage,screenSize,color,battery);
        //this.notebooks.add(notebook);
        System.out.println("Eklenen telefonun'un id'si :"+phone.getId());



    }
}
