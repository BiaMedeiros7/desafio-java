package Faturamento;

public class Faturamento {
    public static void main(String[] args) {
        
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        
        
        double total = sp + rj + mg + es + outros;
        
        
        double perSP = (sp / total) * 100;
        double perRJ = (rj / total) * 100;
        double perMG = (mg / total) * 100;
        double perES = (es / total) * 100;
        double perOutros = (outros / total) * 100;
        
       
        System.out.println("Percentual do faturamento mensal:");
        System.out.println("SP: " + perSP + "%");
        System.out.println("RJ: " + perRJ + "%");
        System.out.println("MG: " + perMG + "%");
        System.out.println("ES: " + perES + "%");
        System.out.println("Outros: " + perOutros + "%");
    }
}