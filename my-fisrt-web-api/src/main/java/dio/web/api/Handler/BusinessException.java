package dio.web.api.Handler;

public class BusinessException extends RuntimeException{
    public BusinessException(String mensage){
        super(mensage);
    }
    public BusinessException(String mensagem, Object...params){
        super(String.format(mensagem, params));
    }
}
