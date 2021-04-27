import java.util.Scanner;

public class ProgramaAcademico {
    public static void main(String[] args){        
        int limiteFaltas = 17, mediaAprovacao = 7;
        float mediaNotas;

        Scanner in = new Scanner(System.in); 
                
        System.out.println("Digite as três notas do aluno e o numero de faltas: ");        
        float nota01 = in.nextFloat();
        float nota02 = in.nextFloat();
        float nota03 = in.nextFloat();
        int totalFaltas = in.nextInt();

        in.close();
      
        mediaNotas = (nota01 + nota02 + nota03)/3;

        if (totalFaltas > limiteFaltas){
            System.out.println("Reprovado por falta");
        } else if (mediaNotas < mediaAprovacao) {
            System.out.println(String.format("Reprovado por nota %.1f", mediaNotas));
        } else {
            System.out.println(String.format("Aprovado %.1f", mediaNotas));
        }
    }
}
