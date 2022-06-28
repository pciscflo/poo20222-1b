package patrones;

public class SMSEnvio {

    private static SMSEnvio smsEnvio = new SMSEnvio();

    private int dado = 10;

    public static SMSEnvio obtenerObjeto(){
        return smsEnvio;
    }

    private SMSEnvio() {
    }

    public void enviarMensaje(String msg){
        //
        //
        //
        System.out.println("Mensaje enviado! " + dado);
    }
}
