import java.util.ArrayList;
import java.util.List;

public class Brand {
    private String brandId;
    private String  name;

    public Brand(String brandId, String name) {
        this.brandId = brandId;
        this.name = name;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;}

    public void setName(String name) {
        this.name = name;
    }


    public static String[] printBrands(){

        Brand samsung =new Brand("1","SAMSUNG");
        Brand lenovo= new Brand("2","LENOVO");
        Brand apple =new Brand("3","APPLE");
        Brand huawei =new Brand("4","HUAWEI");
        Brand casper =new Brand("5","CASPER");
        Brand asus =new Brand("6","ASUS");
        Brand hp =new Brand("7","HP");
        Brand xiaomi = new Brand("8","XIAOMI");
        Brand monster =new Brand("9","MONSTER");

        List<Brand> brands =new ArrayList<>();
        brands.add(new Brand("1","SAMSUNG"));
        brands.add(new Brand("2","LENOVO"));
        brands.add(new Brand("3","APPLE"));
        brands.add(new Brand("4","HUAWEI"));
        brands.add(new Brand("5","CASPER"));
        brands.add(new Brand("6","ASUS"));
        brands.add(new Brand("7","HP"));
        brands.add(new Brand("8","XIAOMI"));
        brands.add(new Brand("9","MONSTER"));

        String[] nameArray=new String[brands.size()];
        for (Brand brand :brands){
            System.out.println(brand.getBrandId()+" - "+brand.getName());
            for (int i=0;i< brands.size();i++) {
                nameArray[i] = brand.getName();
            }
        }
        return nameArray;
    }
    public static String arrayBrands(int value){

        Brand samsung =new Brand("1","SAMSUNG");
        Brand lenovo= new Brand("2","LENOVO");
        Brand apple =new Brand("3","APPLE");
        Brand huawei =new Brand("4","HUAWEI");
        Brand casper =new Brand("5","CASPER");
        Brand asus =new Brand("6","ASUS");
        Brand hp =new Brand("7","HP");
        Brand xiaomi = new Brand("8","XIAOMI");
        Brand monster =new Brand("9","MONSTER");

        List<Brand> brands =new ArrayList<>();
        brands.add(new Brand("1","SAMSUNG"));
        brands.add(new Brand("2","LENOVO"));
        brands.add(new Brand("3","APPLE"));
        brands.add(new Brand("4","HUAWEI"));
        brands.add(new Brand("5","CASPER"));
        brands.add(new Brand("6","ASUS"));
        brands.add(new Brand("7","HP"));
        brands.add(new Brand("8","XIAOMI"));
        brands.add(new Brand("9","MONSTER"));


        String[] nameArray=new String[brands.size()];
        for (Brand brand :brands){
            for (int i=0;i< brands.size();i++) {
                nameArray[i] = brand.getName();
            }
        }

        if (value>=0&&value<9){

        return nameArray[value];
    }
        else {

            System.out.println("Lütfen lisitede bulunan bir marka id girin!");
            return null;
        }
        }


}
