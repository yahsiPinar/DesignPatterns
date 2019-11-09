public abstract class Pizza {
    String name;

    void prepare(){
        System.out.print("Preparing--> ");
    }
    void bake(){
        System.out.print("Baking--> ");
    }
    void cut(){
        System.out.print("Cutting--> ");
    }
    void box(){
        System.out.print("Boxing--> ");
    }
    public String getName() {
        return name;
    }
}
