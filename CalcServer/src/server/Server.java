package server;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.time.LocalDate;
import Service.ICalc;


public class Server extends UnicastRemoteObject implements ICalc{
    
    public Server() throws RemoteException{
        super();
    }

    @Override
    public String getSoma(float n1, float n2) throws RemoteException {
        float result;
        
        result = n1+n2;
        
        
        return Float.toString(result);
    }

    @Override
    public String getSub(float n1, float n2) throws RemoteException {
        float result;
        result = n1-n2;
        return Float.toString(result); }
    
    @Override
    public String getMult(float n1, float n2) throws RemoteException {
        float result;
        result = n1*n2;
        return Float.toString(result);   }
    
    @Override
    public String getDiv(float n1, float n2) throws RemoteException {
        float result;
       result = n1/n2;
        return Float.toString(result);   }
    
    @Override
    public String getPot(float n1, float n2) throws RemoteException {
        double result;
        result = Math.pow(n1, n2);
        return Double.toString(result);   }
    
    @Override
    public String getLog(float n1) throws RemoteException {
        double result;
        result =  Math.log10(n1);
        return Double.toString(result);   }
 
    public static void main(String[] args) {
        try {
            //Instanciar objeto remoto
            ICalc srv = new Server();
            
            //Registrar o servidor na VM
            Registry rg = LocateRegistry.createRegistry(ICalc.PORTA
            );
            rg.bind(ICalc.NOME, srv);
            System.out.println("Servidor em execução.");
            
        } catch (Exception e) {
            System.err.println("ERRO: " + e.getMessage());
        }
    }
    
}




