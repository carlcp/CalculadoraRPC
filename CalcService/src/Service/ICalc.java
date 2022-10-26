package Service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalc extends Remote {
    
    //Parametros de Comunicacao
    
    public static final int PORTA = 5000;
    public static final String NOME = "Serviço Data e Hora";
    public static final String HOST = "127.0.0.1";
    
    
    //Assinaturas dos procedimentos
    
    public abstract String getSoma(float n1, float n2) throws RemoteException;
    public abstract String getSub(float n1, float n2) throws RemoteException;
    public abstract String getMult(float n1, float n2) throws RemoteException;
    public abstract String getDiv(float n1, float n2) throws RemoteException;
    public abstract String getPot(float n1, float n2) throws RemoteException;
    public abstract String getLog(float n1) throws RemoteException;
    
}
