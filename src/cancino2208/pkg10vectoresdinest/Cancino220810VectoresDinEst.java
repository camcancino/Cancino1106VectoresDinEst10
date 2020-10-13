package cancino2208.pkg10vectoresdinest;
import java.util.Scanner;

public class Cancino220810VectoresDinEst {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        String alumno, fechanac;
        int dni;
      
        System.out.print("Ingrese el nombre completo del alumno: ");
        alumno = ingreso.nextLine();
        
        System.out.print("Ingrese la fecha de nacimiento: ");
        fechanac = ingreso.nextLine();
        
        System.out.print("Ingrese el DNI: ");
        dni = ingreso.nextInt();
        
        System.out.print("Por favor ingrese el número de materias que desea almacenar: ");
        int nMaterias = ingreso.nextInt();
        String materias[] = new String[nMaterias]; //materias[1][nMaterias]
        int notas [][] = new int [nMaterias][3];
        int mnotas = notas[0].length; //sacar el nro de columnas de una matriz
        float promedios[] = new float [nMaterias];
        
        for (int i=0; i<nMaterias; i++){
           System.out.print("Ingrese la materia: ");
           materias[i] = ingreso.next();
          
            for (int j=0; j<mnotas; j++){
                
                do{
                System.out.print((j+1)+". Ingrese la nota(sin decimales): ");
                notas[i][j]= ingreso.nextInt(); //se repite 3 veces
                } while(notas[i][j]<= 0 || notas[i][j]>10);
                promedios[i] += notas[i][j];
                        
            }
            promedios[i]/=3;
        }
        System.out.println("");
        
        
        System.out.println("======================================");
        System.out.println("========= Boletín del Alumno =========");
        System.out.println("=== Alumno: "+alumno+" ====");
        System.out.println("=== Fecha de Nacimiento: "+fechanac+" ==");
        System.out.println("=== DNI: "+dni+" =====================");
        System.out.println("======================================");
        
        
        
        //imprimir notas y promedio
        for (int i=0; i<nMaterias;i++) {
            System.out.println("=== "+materias[i]+" ==");
            
                for (int j=0; j<mnotas;j++){
                    System.out.println("    ="+(j+1)+"=   "+notas[i][j]+"   ===");
                } 
                
            System.out.println("======================================");
            System.out.println("Promedio: "+Math.round(promedios[i]));
            System.out.println("======================================");
            System.out.println("======================================");
            
        }
            
    }
    
}
