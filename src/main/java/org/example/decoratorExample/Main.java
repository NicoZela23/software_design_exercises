//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Usuario u = new Usuario();
        u.nombre="Aquiles Castro";
        u.celular="79366677";
        u.email="aquiles@gmail.com";

        INotificador notificador =new NotificadorCombinado(new NotificadorSMS(),new NotificadorEmail());

        EnviarNotificacion(notificador,u);

    }

    public static void EnviarNotificacion(INotificador n, Usuario u)
    {
        n.Notificar(u);
    }
}

class Usuario
{
    public String nombre;
    public String email;
    public String celular;

}

interface INotificador
{
    void Notificar(Usuario u);
}

class NotificadorEmail implements INotificador
{
    public void Notificar(Usuario u)
    {
        System.out.println("enviando email de notificacion a "+u.email);
    }
}

class NotificadorSMS implements INotificador
{
    public void Notificar(Usuario u)
    {
        System.out.println("enviando SMS de notificacion a "+u.celular);
    }
}

class NotificadorCombinado implements INotificador
{
    private INotificador notificador1;
    private INotificador notificador2;

    public NotificadorCombinado(INotificador a, INotificador b)
    {
        notificador1=a;
        notificador2=b;
    }

    public void Notificar(Usuario u)
    {
        System.out.println("enviando notificacion combinada a "+u.nombre);
        notificador1.Notificar(u);
        notificador2.Notificar(u);;

    }
}