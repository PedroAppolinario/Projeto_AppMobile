package PedroAppolinario.com.github.ProjetoFaculdade.exception;
//RuntimeException já possui Serializable

public class ObjectNotFoundException extends  RuntimeException {

    private static  final long serialVersionUID = 1L;

    public ObjectNotFoundException(String message){
        super(message);
    }

    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}