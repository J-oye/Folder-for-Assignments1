package Reflection;

public enum Nigeria {
    NORTH_CENTRAL("Benue","FCT","Kogi","Nasarawa","Niger","plateau"),
    NORTH_EAST("Adamawa","Bauchi","Borono","Gombe","Taraba","yobe"),
    NORTH_WEST("Kaduna","Kastina","Kana","Kebbi","Sokoto","jigawa","Zamfara"),
    SOUTH_EAST("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SOUTH_SOUTH("Akwa_Ibom","Bayelsa","Cross_River","Delta","Edo","Rivers"),
    SOUTH_WEST("Ekiti","Lagos","Osun","Ondo","Ogun","Oyo");

    private String[] state;

    public String[] getZone(String[] zone) {
        zone = state;
        return zone ;
    }

    public void validateState(){

    }





    Nigeria(String... state) {
        this.state = state;
    }
}
