class Engine{
    //Fields
    String type;
    int horsePower;
    //Constructor
    Engine (String type, int horsePower){
        this.type = type;
        this.horsePower = horsePower;
    }

    void ShowEngineInfo(){
        System.out.println("Type: " + type);
        System.out.println("Horse Power: " + horsePower);
    }

}