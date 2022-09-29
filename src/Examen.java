import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        int cantidadExamen;// Cantidad de exámenes a calificar
        int i;
        double suma = 0;
        double promedio;

        do {
            System.out.println("¿Cuántas notas vas a ingresar? ");
            cantidadExamen = entrada.nextInt();

        }while (cantidadExamen <=0);

        String[] nombre = new String[cantidadExamen];

        for(i=0; i<cantidadExamen;i++) {
            System.out.println("¿Cuál es el nombre de alumno?  :"+(i+1));
            nombre[i] =entrada.next();
        }
        String[]apellido=new String[cantidadExamen];
        for (i=0;i<cantidadExamen;i++) {
            System.out.print("¿Cuál es el apellido del alumno? "+(i+1));
            apellido[i]=entrada.next();

        }
        System.out.print("¿Cuántos examenes calificó? ");
        int cantidadCalificados=entrada.nextInt();

        int[]examen=new int[cantidadCalificados];//
        int[]Notas = new int[examen.length];
        double[]promedioNo =new double[nombre.length];

        for(i=0;i<cantidadExamen;i++) {
            for(int o=0;o<Notas.length;o++) {
                System.out.println("Ingrese la nota del examen n° " + (o+1));
                Notas[o]=entrada.nextInt();
                suma = suma +Notas[o];
            }
            promedio =suma / Notas.length;
            System.out.println("El promedio de las notas es: " + promedio + " el  numero de estudiantes calificados fue: "+(i+1));
            suma=0;
            promedioNo[i]=promedio;

        }

        double notaMaxima = 0.0;
        String mejorCalificacion="";
        String apMejor = "";

        for (i=0; i< promedioNo.length;i++) {
            if(promedioNo[i]>notaMaxima) {
                notaMaxima=promedioNo[i];
                mejorCalificacion=nombre[i];
                apMejor=apellido[i];
            }
        }
        System.out.println("La nota más alta la obtuvo  :"+ mejorCalificacion +" "+ apMejor+". Su nota fue " +notaMaxima);

        Double notaMinima = 10.0 ;
        String peorCalificacion = " ";
        String apMin =" ";
        for (i=0; i<promedioNo.length;i++) {
            if(promedioNo[i]<notaMinima) {
                notaMinima=promedioNo[i];
                peorCalificacion=nombre[i];
                apMin=apellido[i];

            }
        }
        System.out.println("la nota mas baja la obtuvo  :"+ peorCalificacion +" "+ apMin+". Su nota fue " +notaMinima);
        for(i=0;i<promedioNo.length;i++) {
            if(promedioNo[i]<7) {System.out.println("El estudiante :"+ nombre[i]+" "+apellido[i] + " perdío  el curso");

            }else {
                System.out.println("El estudiante :"+ nombre[i]+" "+apellido[i] +" pasó al siguiente curso");
            }
        }
        entrada.close();
    }
}
