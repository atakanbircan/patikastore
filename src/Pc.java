import java.util.Scanner;

public class Pc extends Product{

    Scanner scanner = new Scanner(System.in);
    public Pc( int price, String discount, int stock, String productName, String productBrand, int ram,
              int storage, double screenSize) {
        super( price, discount, stock, productName, productBrand, ram, storage, screenSize);
    }

    @Override
    public void addProduct() {
            System.out.print("Ürünün fiyatı : ");
            int price= scanner.nextInt();
            System.out.print("Ürünün adı : ");
            String name=scanner.nextLine();
            System.out.print("Ürünün indirim oranı : ");
            int discountRate= scanner.nextInt();
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
            Pc pc=new Pc(price,String.valueOf(discountRate),stock,name,brand,ram,storage,screenSize);
            //this.notebooks.add(notebook);
            System.out.println("Eklenen notebook'un id'si :"+pc.getId());


    }
}
