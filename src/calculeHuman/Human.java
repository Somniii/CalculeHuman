package calculeHuman;

public class Human implements HumanFunctions{
    private double weight;
    private String birthday;
    private double height;
    public Human(){

    }
    public Human(double weight, String bithday, double height){
        setBirthday(bithday);
        setHeight(height);
        setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getBirthday(){
        return birthday;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    public void calcularEdad(){

    }
    public String esPesoIdeal(){
        String respuesta = "";
        return respuesta;
    }
}
