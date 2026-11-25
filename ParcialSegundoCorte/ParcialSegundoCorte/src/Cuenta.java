public class Cuenta {
    private String titular, numeroCuenta;
    private double saldo;

    public Cuenta (String titular, String numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setSaldo(double saldo){
       if (saldo >= 0){
        this.saldo = saldo;
       }else{
        System.out.println("Saldo debe ser un numero positivo");
       }
    }

    public void depositar (double monto){
        if(monto > 0){
            saldo += monto;
            System.out.println("Deposito de " + monto + " realizado." +  "Nuevo saldo:  " + saldo );
        }else{
            System.out.println("El monto debe ser positivo.");
        }
    }

    public void depositar (double monto, String concepto ){
        if(monto > 0 ){
            saldo += monto;
            System.out.println("Deposito de " + monto + " por concepto" + concepto + ". Nuevo saldo: " + saldo);
        }else{
            System.out.println("El monto debe ser positivo.");
        }
    }
 
    public boolean retirar (double monto){
        if(monto <= 0){
            System.out.println("Monto invalido");
            return false;
        }
        if(monto <= saldo){
            saldo -= monto;
            System.out.println("Retiro de " + monto + " exitoso. Saldo restante: " + saldo);
            return true; 
            }
        
        else{
            System.out.println("Saod insuficiente.");
            return false;
        }
    }
    public void mostrarInfo(){
        System.out.println("=== Información de Cuenta ===");
        System.out.println("Titular: " + titular);
        System.out.println("Numero: " + numeroCuenta);
        System.out.println("Saldo: "+ saldo);
    }

}
