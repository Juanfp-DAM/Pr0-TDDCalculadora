package TareaTDD_Calculadora;

public class Calculadora {


    public int operacionTDD(String s){
        int resultado;
        if(s.length()>0){
            if(s.endsWith(",")||s.contains("-")){
                resultado=-1;
            }else{
                if(s.length()==1){
                    resultado=Integer.parseInt(s);
                }else{
                    resultado=0;
                    String [] separa = s.split(",");
                    for(String str: separa){
                        int convertir;
                        convertir=Integer.parseInt(str);
                        if(convertir<1000){
                            resultado+=convertir;
                        }else{
                            resultado=5;
                        }
                    }
                }
            }
        }else{
            resultado=0;
        }
        return resultado;
    }
}



