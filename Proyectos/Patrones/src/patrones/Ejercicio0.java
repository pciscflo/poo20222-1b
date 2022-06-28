package patrones;

public class Ejercicio0 {
    public static void main(String[] args) {
        SMSEnvio smsEnvio = SMSEnvio.obtenerObjeto();
        smsEnvio.enviarMensaje("Hola");
        SMSEnvio smsEnvio1 = SMSEnvio.obtenerObjeto();
        smsEnvio.enviarMensaje("Hi!");
        if(smsEnvio1 == smsEnvio){
            System.out.println("Son iguales");
        }
    }
}
