package ro.fasttrackit.curs7homework;

public class ProductMain {
    public static void main(String[] args){

        Product ciocan = new Product();

        ciocan.setCategory("GARDEN");
        System.out.println("Categoria introdusa este: "+ciocan.getCategory());
        System.out.println(ciocan.isCategory("GARDEN"));
        ciocan.setName("Ciocan");
        System.out.println("Produsul alses este: "+ciocan.getName());
        ciocan.setPrice(15);
        System.out.println("Produsul ales costa: " + ciocan.getPrice()+" lei.");
        ciocan.setQuanity(0);
        System.out.println("In stoc sunt: "+ciocan.getQuanity() + " bucati");
        System.out.println(ciocan.hasStock());


    }
}
