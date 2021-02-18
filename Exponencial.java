public class Exponencial 
{
    double R;
    double n1, n2;
    
    public void exp(double n1, double n2)
    {
        R = Math.pow(n1,n2);
        System.out.printf("Potência: %.2f \n",R);
    }
}
