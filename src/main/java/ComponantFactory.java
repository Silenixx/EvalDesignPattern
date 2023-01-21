public class ComponantFactory {




    public static Componant createComponant(String type){
        Componant componant = null;

        switch (type) {
            case "Quenotte3000":
                componant = new Appareil("Brosse à dent",0,"ADEGTRDFFSD");

                break;
            case "lavetou":
                componant = new Appareil("Machine à laver",0,"ADEGDFDFFSD");
                break;
            default:
                throw new IllegalArgumentException
                        ("Type de componant inconnu");
        }
        return componant;


    }

}
