package pl.edu.ur.main;
import java.util.Scanner;
/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        
        String zadanie;
        
        Scanner odczyt = new Scanner(System.in);
        
        System.out.println("Prosze podac numer zadania (3, 4, 6 lub 7)");
        
        zadanie = odczyt.next();
        
        switch(zadanie)
        {
            default : System.out.println("Zly numer zadania");break;
            
            case "3" :
            {
                double[] liczby = new double[10];
                int funkcja;
                
                System.out.println("Prosze podac 10 liczb rzeczywistych");
                
                for(int i = 0;i<10;i++)
                {
                    liczby[i] = odczyt.nextDouble();
                    //System.out.println(liczby[i]);
                }
                
                do
                {
                    System.out.println("Prosze podac numer funkcjonalnosci do wyswietlenia (1, 2, 3 lub 4) lub tez wybrac 5 aby zakonczyc dzialanie");    
                    funkcja = odczyt.nextInt();
                    
                    if(funkcja == 1)
                    {
                        System.out.println("Wyświetlanie tablicy od pierwszego do ostatniego indeksu.");
                        for(int i = 0;i<10;i++)
                        {
                             System.out.println(liczby[i]);  
                        }
                    }
                    else if(funkcja == 2)
                    {
                        System.out.println("Wyświetlanie tablicy od ostatniego do pierwszego indeksu.");
                        for(int i = 9;i>=0;i--)
                        {
                            System.out.println(liczby[i]);  
                        }
                    }
                    else if(funkcja == 3)
                    {
                        System.out.println("Wyświetlanie elementów o nieparzystych indeksach.");
                        for(int i = 1;i<10;i+=2)
                        {
                            System.out.println(liczby[i]);  
                        }
                    }
                    else if(funkcja == 4)
                    {
                        System.out.println("Wyświetlanie elementów o parzystych indeksach.");
                        for(int i = 0;i<10;i+=2)
                        {
                            System.out.println(liczby[i]);  
                        }
                    }
                    else if(funkcja == 5)
                    {
                        System.out.println("Koniec");
                    }
                    else
                    {
                        System.out.println("Nieprawidlowy numer");
                    }
                
                }while(funkcja != 5);
                
            }
            case "4" :
            {
                System.out.println("Prosze podac 10 liczb rzeczywistych");
                
                double[] liczby = new double[10];
                int funkcja;
                
                for(int i = 0;i<10;i++)
                {
                    liczby[i] = odczyt.nextDouble();
                    //System.out.println(liczby[i]);
                }
                
                do
                {
                    System.out.println("Prosze podac numer funkcjonalnosci do wyswietlenia (1, 2, 3 ,4 lub 5) lub tez wybrac 6 aby zakonczyc dzialanie");    
                    funkcja = odczyt.nextInt();
                    
                    if(funkcja == 1)
                    {
                        double suma = 0;
                        System.out.println("Obliczanie sumy elementów tablicy");
                        for(int i = 0;i<10;i++)
                        {
                             suma = suma+liczby[i]; 
                        }
                        
                        System.out.println("Suma elementów wynosi "+suma);
                    }
                    else if(funkcja == 2)
                    {
                        System.out.println("Obliczanie iloczynu elementów tablicy");
                        double iloczyn = 0;
                        
                        for(int i = 0;i<10;i++)
                        {
                            iloczyn = iloczyn*liczby[i];
                        }   
                        System.out.println("Iloczyn wynosi "+iloczyn);
                    }
                    else if(funkcja == 3)
                    {
                        System.out.println("Wyświetlanie wartości średniej,");
                        double srednia = 0;
                        for(int i = 1;i<10;i++)
                        {
                            srednia = srednia+liczby[i]; 
                        }
                        srednia = srednia/10;
                        System.out.println("Srednia wynosi "+srednia);
                    }
                    else if(funkcja == 4)
                    {
                        System.out.println("Wyświetlanie wartosci minimalnej");
                        double minimum = liczby[0];
                        for(int i = 1;i<10;i++)
                        {
                            if(liczby[i]<minimum)
                            {
                                minimum = liczby[i];
                            }
                        }
                        System.out.println("Minimum wynosi "+minimum);
                    }
                    else if(funkcja == 5)
                    {
                        System.out.println("Wyświetlanie wartosci maksymalnej");
                        double maks = liczby[0];
                        
                        for(int i = 0;i<10;i++)
                        {
                            if(liczby[i]>maks)
                            {
                                maks = liczby[i];
                            }
                        }
                        System.out.println("Maksimum wynosi "+maks);
                    }
                    else if(funkcja == 6)
                    {
                        System.out.println("Koniec");
                    }
                    else
                    {
                        System.out.println("Nieprawidlowy numer");
                    }
                     
                
                }while(funkcja != 6);
            }
            case "6" :
            {
                boolean koniec = false;
                int liczba;
                while(true)
                {
                    System.out.println("Prosze podac liczbe calkowita");
                    liczba = odczyt.nextInt();
                   if(liczba < 0)
                   {
                       break;
                   }
                }   
            }
            case "7" :
            {
                int ilosc;
              
                System.out.println("Prosze podac ilosc liczb ktora zostanie wprowadzona");
                
                ilosc = odczyt.nextInt();
                
                double[] liczby = new double[ilosc];
                
                System.out.println("Prosze podac "+ilosc+" liczb/liczby rzeczywistych/rzeczywiste");
                
                for(int i = 0;i<ilosc;i++)
                {
                    liczby[i]=odczyt.nextDouble();
                }
                
                System.out.println("Posortowane");
                
                double x;
                
                for(int i = 0;i<ilosc;i++)
                {
                    for(int j = i;j<ilosc;j++)
                    {
                       if(liczby[i]>liczby[j])
                       {
                           x = liczby[i];
                           liczby[i] = liczby[j];
                           liczby[j]=x;
                       }
                    }

                }
                    for(int i = 0;i<ilosc;i++)
                {
                    System.out.println(liczby[i]);
                }
                   
                  
        }
    }
    
            
}
}
