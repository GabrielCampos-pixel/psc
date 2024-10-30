package OrientadaObjetos;
public class Time {
    private int hora,minuto,segundo;


    public Time() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Time(int hora) {
        setHora(hora);
        this.minuto = 0;
        this.segundo = 0;
    }

    public Time(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
        this.segundo = 0;
    }

    public Time(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setTime(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
    //Metodo para definir hora
    public void setHora(int hora) {
        if(hora>=0 && hora<=23) {
            this.hora = hora;
        } else {
            System.out.println("A hora informada não é válida");
        }
    }
    //Metodo para obter hora
    public int getHora() {
        return hora;
    }
    //Metodo para definir minuto
    public void setMinuto(int minuto) {
        if(minuto>=0 && minuto<=59) {
            this.minuto = minuto;
        } else {
            System.out.println("O minuto informado não é válido");
        }
    }
    //Metodo para obter minuto
    public int getMinuto() {
        return minuto;
    }
    //Metodo para definir segundo
    public void setSegundo(int segundo) {
        if(segundo>=0 && segundo<=59) {
            this.segundo = segundo;
        } else {
            System.out.println("O segundo informado não é válido");
        }
    }
    //Metodo para obter segundo
    public int getSegundo() {
        return segundo;
    }
    //Metodo para retornar a hora no formato h:m:s
    @Override
    public String toString() {
        return hora + ":" + minuto + ":"  + segundo;
    }
    //Teste
    public static void main(String[] args) {
        Time time1 = new Time();        
        Time time2 = new Time(10); 
        Time time3 = new Time(10, 30); 
        Time time4 = new Time(10, 30, 45); 
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(time4);
        time4.setTime(12, 15, 30);
        System.out.println(time4);
    }
}