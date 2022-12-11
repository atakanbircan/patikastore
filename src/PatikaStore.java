import java.sql.SQLOutput;
import java.util.*;

public class PatikaStore {
    public static void main(String[] args) {
        int menuNo;



        Product nirvana = new Pc(8000,"%10",55," Nirvana","CASPER",
                8,512,14);
        Product noteBookPro = new Pc(30000,"%12",5," Notebook Pro","XIAOMI",
                32,1000,15);

        Phone miNote10=new Phone(10000,"%10",111,"MiNote10","XIAOMI",
                8,512,5,"Black",5000);
        Phone s20=new Phone(10000,"%10",111,"Samsung S20","SAMSUNG",
                16,1024,6,"Blue",5200);

        List<Product> pcs = new ArrayList<>();
        pcs.add(nirvana);
        pcs.add(noteBookPro);

        List<Product> phones =new ArrayList<>();
        phones.add(miNote10);
        phones.add(s20);
        Scanner input = new Scanner(System.in);
        boolean toContinue=true;
        System.out.println("PatikaStore mağazasına hoşgeldiniz!") ;
        System.out.println("1-Bilgisayar");
        System.out.println("2-Telefon");
        System.out.println("3-Markalar");
        System.out.println("4-Ürün ekleme");
        System.out.println("5-Ürün silme");
        System.out.println("6-Ürünleri ID ile sorgula");
        System.out.println("9-Çıkış Yap");
        System.out.println("Seçiminiz: ");
        menuNo=input.nextInt();
        Formatter fmt = new Formatter();


            switch (menuNo) {
                case 1:
                    System.out.println("Bilgisayar Listesi");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| ID                                  | Product Name                  | Price         | Brand      | Storage   | Stock     | Discount  | Screen Size  | Ram    |");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    for (Product pc : pcs) {
                        System.out.printf("| %-2s | %-30s| %-10s TL | %-10s| %-6s SSD| %-10s| %-10s| %-9s INC| %-8s GB|\n",
                                pc.getId(), pc.getProductName(), pc.getPrice(), pc.getProductBrand(), pc.getStorage(),
                                pc.getStock(), pc.getDiscount(), pc.getScreenSize(), pc.getRam());
                    }
                    break;
                case 2:
                    System.out.println("Telefon Listesi");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
                    System.out.println("| ID                                   | Product Name                  | Price         | Brand      | Storage  | Stock     | Discount  | Screen Size  | Ram        | Color     | Depolama  |");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
                    for (Product phone : phones) {
                        //fmt.format("%15s | %15s                   |  %15s | %15s | %15s | %15s | %15s      |" javapoint de buldum..
                        System.out.printf("| %-2s | %-30s| %-10s TL | %-10s| %-7s GB| %-10s| %-10s| %-8s INCH| %-8s GB| %-10s| %-10s|\n",
                                phone.getId(), phone.getProductName(), phone.getPrice(), phone.getProductBrand(), phone.getStorage(),
                                phone.getStock(), phone.getDiscount(), phone.getScreenSize(), phone.getRam(),phone.getColor(),phone.getBattery());
                    }
                    break;
                case 3:
                    System.out.println("Markalar");
                    System.out.println("--------------------------------------------------------");
                    String [] alphabetic=Brand.printBrands();
                    Arrays.sort(alphabetic);
                    Arrays.toString(alphabetic);
                    break;

                case 4:

                    int type;
                    System.out.println("Ürün Ekeme");
                    System.out.println("bilgisayar için 1 ");
                    System.out.println("telefon için 2 ");
                    System.out.println("");
                    System.out.println("Lütfen 1 ya da 2 den size uygun olanı seçin ");
                    type=input.nextInt();
                    switch (type){

                        case 1:

                            System.out.println("Ürünün fiyatı : ");
                            int price = input.nextInt();
                            System.out.print("Ürünün adı : ");
                            String name = input.next();
                            System.out.println("Ürünün indirim oranı : ");
                            int discountRate = input.nextInt();
                            System.out.println("Ürünün stoğu : ");
                            int stock = input.nextInt();
                            System.out.println("Ürünün rami : ");
                            int ram = input.nextInt();
                            System.out.println("Ürünün ekranı : ");
                            int screenSize = input.nextInt();
                            System.out.println("Ürünün hafızası :");
                            int storage = input.nextInt();
                            Brand.printBrands();
                            System.out.println("Lütfen seçtiğiniz marka adını giriniz : ");
                            String brand = input.nextLine();

                            Product pc = new Pc(price, String.valueOf(discountRate), stock, name, brand, ram, storage, screenSize);
                            pcs.add(pc);
                            /*for (Product ele : pcs) {
                                System.out.println(ele.getProductBrand()+" "+ ele.getProductName() + " " + ele.getId());
                            }*/

                            System.out.println("Bilgisayar Listesi");
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("| ID                                  | Product Name                  | Price         | Brand      | Storage   | Stock     | Discount  | Screen Size  | Ram    |");
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            for (Product pc1 : pcs) {
                                System.out.printf("| %-2s | %-30s| %-10s TL | %-10s| %-6s SSD| %-10s| %-10s| %-9s INC| %-8s GB|\n",
                                        pc1.getId(), pc1.getProductName(), pc1.getPrice(), pc1.getProductBrand(), pc1.getStorage(),
                                        pc1.getStock(), pc1.getDiscount(), pc1.getScreenSize(), pc1.getRam());
                            }

                            break;


                        case 2:

                            System.out.println("Telefon Ekleme ");
                            System.out.println("");
                            System.out.print("Ürünün fiyatı : ");
                            int price1 = input.nextInt();
                            System.out.print("Ürünün adı : ");
                            String name1 = input.next();
                            System.out.print("Ürünün indirim oranı : ");
                            int discountRate1 = input.nextInt();
                            System.out.print("Ürünün stoğu : ");
                            int stock1 = input.nextInt();
                            System.out.print("Ürünün rami : ");
                            int ram1 = input.nextInt();
                            System.out.print("Ürünün ekranı : ");
                            double screenSize1 = input.nextDouble();
                            System.out.print("Ürünün hafızası :");
                            int storage1 = input.nextInt();
                            Brand.printBrands();
                            System.out.println("Lütfen seçtiğiniz marka adını giriniz : ");
                            String brand1 = input.next();
                            System.out.println("Telefonun rengi nedir : ");
                            String color = input.next();
                            System.out.println("Telefonun batarya büyüklüğü nedir : ");
                            int battery = input.nextInt();
                            Product phone = new Phone(price1, String.valueOf(discountRate1), stock1, name1, brand1, ram1,
                                    storage1, screenSize1, color, battery);
                            phones.add(phone);
                            /*for (Product ele : phones) {
                                System.out.println(ele.getProductBrand()+" "+ ele.getProductName() + " " + ele.getId());
                            }*/

                            System.out.println("Telefon Listesi");
                            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
                            System.out.println("| ID                                   | Product Name                  | Price         | Brand      | Storage  | Stock     | Discount  | Screen Size  | Ram        | Color     | Depolama  |");
                            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
                            for (Product phonee : phones) {
                                //fmt.format("%15s | %15s                   |  %15s | %15s | %15s | %15s | %15s      |" javapoint de buldum..
                                System.out.printf("| %-2s | %-30s| %-10s TL | %-10s| %-7s GB| %-10s| %-10s| %-8s INCH| %-8s GB| %-10s| %-10s|\n",
                                        phonee.getId(), phonee.getProductName(), phonee.getPrice(), phonee.getProductBrand(), phonee.getStorage(),
                                        phonee.getStock(), phonee.getDiscount(), phonee.getScreenSize(), phonee.getRam(),phonee.getColor(),phonee.getBattery());
                            }

                            break;

                    }
                    break;

                case 5:
                    System.out.println("Ürün Silme");


                    /*for (Product element :pcs) {
                        System.out.println(element.getProductName() + " " + element.getId());
                    }
                    for (Product element:phones) {
                        System.out.println(element.getProductName() + "" + element.getId());
                    }*/

                    System.out.println("Bilgisayar Listesi");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| ID                                  | Product Name                  | Price         | Brand      | Storage   | Stock     | Discount  | Screen Size  | Ram    |");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    for (Product pc : pcs) {
                        System.out.printf("| %-2s | %-30s| %-10s TL | %-10s| %-6s SSD| %-10s| %-10s| %-9s INC| %-8s GB|\n",
                                pc.getId(), pc.getProductName(), pc.getPrice(), pc.getProductBrand(), pc.getStorage(),
                                pc.getStock(), pc.getDiscount(), pc.getScreenSize(), pc.getRam());
                    }

                    System.out.println("Telefon Listesi");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
                    System.out.println("| ID                                   | Product Name                  | Price         | Brand      | Storage  | Stock     | Discount  | Screen Size  | Ram        | Color     | Depolama  |");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
                    for (Product phone : phones) {
                        //fmt.format("%15s | %15s                   |  %15s | %15s | %15s | %15s | %15s      |" javapoint de buldum..
                        System.out.printf("| %-2s | %-30s| %-10s TL | %-10s| %-7s GB| %-10s| %-10s| %-8s INCH| %-8s GB| %-10s| %-10s|\n",
                                phone.getId(), phone.getProductName(), phone.getPrice(), phone.getProductBrand(), phone.getStorage(),
                                phone.getStock(), phone.getDiscount(), phone.getScreenSize(), phone.getRam(),phone.getColor(),phone.getBattery());
                    }

                    System.out.println();
                    System.out.println("silmek istediğiniz ürünün id numarasını giriniz : ");

                    String a=input.next();
                        pcs.removeIf(p -> p.getId().equals(a));
                        phones.removeIf(p ->p.getId().equals(a) );

                    /*for (Product elemen :pcs) {
                        System.out.println(elemen.getProductName() + " " + elemen.getId());
                    }
                    for (Product elemen:phones) {
                        System.out.println(elemen.getProductName() + "" + elemen.getId());
                    }*/

                    System.out.println("Bilgisayar Listesi");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| ID                                  | Product Name                  | Price         | Brand      | Storage   | Stock     | Discount  | Screen Size  | Ram    |");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    for (Product pc : pcs) {
                        System.out.printf("| %-2s | %-30s| %-10s TL | %-10s| %-6s SSD| %-10s| %-10s| %-9s INC| %-8s GB|\n",
                                pc.getId(), pc.getProductName(), pc.getPrice(), pc.getProductBrand(), pc.getStorage(),
                                pc.getStock(), pc.getDiscount(), pc.getScreenSize(), pc.getRam());
                    }

                    System.out.println("Telefon Listesi");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
                    System.out.println("| ID                                   | Product Name                  | Price         | Brand      | Storage  | Stock     | Discount  | Screen Size  | Ram        | Color     | Depolama  |");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
                    for (Product phone : phones) {
                        //fmt.format("%15s | %15s                   |  %15s | %15s | %15s | %15s | %15s      |" javapoint de buldum..
                        System.out.printf("| %-2s | %-30s| %-10s TL | %-10s| %-7s GB| %-10s| %-10s| %-8s INCH| %-8s GB| %-10s| %-10s|\n",
                                phone.getId(), phone.getProductName(), phone.getPrice(), phone.getProductBrand(), phone.getStorage(),
                                phone.getStock(), phone.getDiscount(), phone.getScreenSize(), phone.getRam(),phone.getColor(),phone.getBattery());
                    }





                    break;

                case 6:

                    System.out.println("Bilgisayar Listesi");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| ID                                  | Product Name                  | Price         | Brand      | Storage   | Stock     | Discount  | Screen Size  | Ram    |");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    for (Product pc : pcs) {
                        System.out.printf("| %-2s | %-30s| %-10s TL | %-10s| %-6s SSD| %-10s| %-10s| %-9s INC| %-8s GB|\n",
                                pc.getId(), pc.getProductName(), pc.getPrice(), pc.getProductBrand(), pc.getStorage(),
                                pc.getStock(), pc.getDiscount(), pc.getScreenSize(), pc.getRam());
                    }

                    System.out.println("Telefon Listesi");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
                    System.out.println("| ID                                   | Product Name                  | Price         | Brand      | Storage  | Stock     | Discount  | Screen Size  | Ram        | Color     | Depolama  |");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
                    for (Product phone : phones) {
                        //fmt.format("%15s | %15s                   |  %15s | %15s | %15s | %15s | %15s      |" find ex. at javatpoint ..
                        System.out.printf("| %-2s | %-30s| %-10s TL | %-10s| %-7s GB| %-10s| %-10s| %-8s INCH| %-8s GB| %-10s| %-10s|\n",
                                phone.getId(), phone.getProductName(), phone.getPrice(), phone.getProductBrand(), phone.getStorage(),
                                phone.getStock(), phone.getDiscount(), phone.getScreenSize(), phone.getRam(),phone.getColor(),phone.getBattery());
                    }
                    System.out.println();
                    System.out.println("filtelemek istediğiniz id :");
                    String filter=input.next();

                    for (Product phone2: phones){
                        String filterId=phone2.getId().substring(0,filter.length()-1);
                        if (filter.equals(filterId)){
                            System.out.println(phone2.getId()+" "+phone2.getProductName());

                            }
                        }
                    for (Product pc2: pcs) {

                        if (filter.equals(pc2.getId().substring(0, filter.length() - 1))) {
                            System.out.println(pc2.getId() + " " + pc2.getProductName());
                        }
                    }
                    break;


                case 9:
                    System.out.println("Çıkış yapıldı!");
                    break;
                default:
                    System.out.println("Hatalı Seçim !");
            }








    }

}