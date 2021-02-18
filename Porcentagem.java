public class Porcentagem 
{
    float R;
    float n1,n2;
    
    public void perc(float n1, float n2)
    {
        R = (n1/n2) * 100;
        System.out.printf("Resultado: %.2f%% \n",R);
    }
}
