public class Main {
    public static void main(String[] args) {

        Shoes product1 = new Shoes();
        product1.setName("Hummel");
        product1.setFootNumber(37.5);
        product1.setPrice(378.99);

        Shoes product2 = new Shoes();
        product2.setName("Nike");
        product2.setFootNumber(37.5);
        product2.setPrice(378.99);

        Shoes product3 = new Shoes();
        product3.setName("Hummel");
        product3.setFootNumber(37.5);
        product3.setPrice(378.99);

        Dress  product4 = new Dress();
        product4.setName("Blue T-shirt");
        product4.setPrice(325.00);
        product4.setId(754);
        product4.setSize("XL");
        product4.setType("Top Clothing");



        Shoes[] products = {product1, product2, product3};
        System.out.println("<ul>");

        for (Shoes product : products)
        {
            System.out.println("<li>" + product.getName() + "</li>");
        }

        Dress[] dresses = {product4};

        for (Dress dress : dresses)
        {
            System.out.println("<li>" + dress.getName() + "</li>");
        }
        System.out.println("</ul>");


    }

}






















        /*
        Product product1 = new Product();
        product1.name = "Delongi Kahve Makinesi";
        product1.unitPrice = 7500;
        product1.discount = 3;
        product1.unitsInStock = 7;
        product1.imageUrl = "abc.jpg";

        Product product2 = new Product();
        product2.name = "ABC Kahve Makinesi";
        product2.unitPrice = 7500;
        product2.discount = 3;
        product2.unitsInStock = 7;
        product2.imageUrl = "FVA.jpg";

        Product product3 = new Product();
        product3.name = "KFG Kahve Makinesi";
        product3.unitPrice = 7500;
        product3.discount = 3;
        product3.unitsInStock = 7;
        product3.imageUrl = "BAA.jpg";
        */


        /*
        System.out.println("<lu>");
        Product[] products = {product1, product2, product3};
        for (Product product : products)
        {
            System.out.println("<li>" + product.name + "</li>");
        }
        System.out.println("</lu>");
        */