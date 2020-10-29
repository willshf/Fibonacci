public class FibonacciIterativ
{
    public int fibonacciIterativ(int n) {
        // n=1
        int ErgebnisNullterDurchlauf = 1;
        if(n==1) {
            return ErgebnisNullterDurchlauf;
        }
        // n=2
        int ErgebnisErsterDurchlauf = 0;
        int VorVorherigesErgebnisErsterDurchlauf = 0;
        
        ErgebnisErsterDurchlauf = ErgebnisNullterDurchlauf + VorVorherigesErgebnisErsterDurchlauf;
        if(n==2) {
            return ErgebnisErsterDurchlauf; 
        }
        // n=3
        int ErgebnisZweiterDurchlauf = 0;
        ErgebnisZweiterDurchlauf = ErgebnisNullterDurchlauf + ErgebnisErsterDurchlauf;  
        if(n==3){
            return ErgebnisZweiterDurchlauf;
        }
        // n=4
        int ErgebnisDritterDurchlauf = 0;
        ErgebnisDritterDurchlauf = ErgebnisErsterDurchlauf + ErgebnisZweiterDurchlauf;
        if(n==4) {
            return ErgebnisDritterDurchlauf;
        }
        // n=5
        int ErgebnisVierterDurchlauf = 0;
        ErgebnisVierterDurchlauf = ErgebnisZweiterDurchlauf + ErgebnisDritterDurchlauf;
        if(n==5) {
            return ErgebnisVierterDurchlauf;
        }
        // n>=6
        int Ergebnis = 0; 
        int vorherigesErgebnis = 1;
        int VorVorherigesErgebnis = 0; 
        for(int i = 0; i<n; i++) {
            int ZwischenErgebnis = Ergebnis;
            Ergebnis = vorherigesErgebnis + Ergebnis;
            VorVorherigesErgebnis = vorherigesErgebnis;
            vorherigesErgebnis = ZwischenErgebnis;
        }  
        return Ergebnis;
    }
}
