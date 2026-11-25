public class CuentaAhorros extends Cuenta {
    private double tasaIntereses;
    private int retirosMesActual;

    public CuentaAhorros (String titular, String numeroCuenta, double saldo, double tasaIntereses){
        super(titular, numeroCuenta, saldo);
        this.setTasaIntereses (tasaIntereses);
        this.retirosMesActual = 0;
    }
    public double getTasaInteres(){
        return tasaIntereses;
    }

    public void setTasaIntereses(double tasaIntereses){
        this.tasaIntereses = tasaIntereses;
    }
    @Override 
      public boolean retirar (double monto){
        if(retirosMesActual >= 3){
            System.out.println("Limite de 3 retiros mensuales alcanzados.");
            return false;
        }
        if(monto <= 0 || monto > saldo){
            System.out.println("Retiro de " + monto + " exitoso. Saldo restante: " + saldo);
            return true; 
            }
        
        else{
            System.out.println("Saod insuficiente.");
            return false;
        }
    }


}
