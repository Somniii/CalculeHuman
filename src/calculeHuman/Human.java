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
    //DISCLAIMER SI ALGUN DIA ME HAGO FAMOSO Y POR ESTAR ESTO EN PUBLICO ME FUNAN QUIERO ACLARAR QUE NO SE QUE DIVISION ME ESTA DANDO
    //Y NO SE SI DICE ALGO DE QUE ALTURA 190 CENTIMETROS PESO 40 ESTA CON SOBREPESO , FIN DEL DISCLAIMER LAMENTO SI OFENDI A ALGUIEN
    public String esPesoIdeal(){
        String respuesta;
        double numeroPromedio = getHeight()/getWeight();
        System.out.println("El numero promedio fue " + numeroPromedio);
        System.out.println("Tiene una altura de "+height+" cm y un peso de "+weight+" kilos");
        if(1 >= numeroPromedio) {
            respuesta = "sobrepeso, insalubre";
        }
        else if(1 < numeroPromedio && 1.5 >= numeroPromedio){
            respuesta = "tiene peso extra ,recomendable bajar de peso";
        }
        else if(1.5 < numeroPromedio && 2.5 >= numeroPromedio){
            respuesta = "Peso saludable";
        }
        else{
            respuesta= "Peso bajo, insalubre";
        }

        return respuesta;
    }
}
