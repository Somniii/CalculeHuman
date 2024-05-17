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
    public void calcularEdad(String añoActual){
        int diaHoy = calculeDia(añoActual);
        int mesHoy = calculeMes(añoActual);
        int añoHoy = calculeAño(añoActual);

        int dayBirth = calculeDia(getBirthday());
        int monthBirth = calculeMes(getBirthday());
        int yearBirth = calculeAño(getBirthday());

        int añoDelAño = añoHoy-yearBirth;
        if(mesHoy>monthBirth && diaHoy > dayBirth){
            System.out.println("Usted tiene "+ (añoDelAño-1) + " Años");
        }else{
            System.out.println("Usted tiene "+añoDelAño + " Años");

        }
    }
    public int calculeDia(String fecha){
        String[] parte = getBirthday().split("/");
        int dia =  Integer.parseInt(parte[0]);
        return dia;
    }
    public int calculeMes(String fecha){
        String[] parte = getBirthday().split("/");
        int mes = Integer.parseInt(parte[1]);
        return mes;
    }
    public int calculeAño(String fecha){
        String[] parte = getBirthday().split("/");
        int anio = Integer.parseInt(parte[2]);
        return anio;
    }
    public String esPesoIdeal(){
        String respuesta = "";
        return respuesta;
    }
}
