public abstract class Pizza {
    String name;


    public String getName() {
        return name;
    }
    public void prepare(){
        System.out.print("Preparing -->");
    }
    public void bake(){
        System.out.print("Baking -->");
    }
    public void cut(){
        System.out.print("Cutting -->");
    }
    public void box(){
        System.out.print("Boxing -->");
    }

}
