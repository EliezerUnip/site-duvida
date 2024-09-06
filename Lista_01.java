import java.util.Scanner;
public class Lista_01 {
    
     public static void main(String[] args) {
         
    Scanner s = new Scanner(System.in); 
    int opcao; 
    System.out.println("De '1' a '9' escolha qual exercício rodar"); 
    opcao = s.nextInt(); 
    switch (opcao){ 
        case 1: 
            System.out.println("Faça um programa que peça ao usuário qual foi sua nota final no ano letivo. Se a nota for menor que 6 e maior que 4,"
                + " exiba 'precisa fazer prova substitutiva.' \n" + "Se for maior que 6 exiba 'aprovado'; senão, exiba 'reprovado'.\n");
            System.out.print("A entrada de dados deve ser feita com número de 01 a 100, sem a necessidade de ponto.\n\n");
            
            System.out.println("Qual foi sua nota no ano letivo?");
            int nota = s.nextInt();
            if(nota >= 60){
                System.out.print("Aprovado\n");
            }
            else if (nota < 40){
                System.out.println("Precisa fazer prova substitutiva\n");
            }
            else { 
                System.out.println("Reprovado");
             }
            break;
            
            case 2:
                System.out.println("Qual seu primeiro nome?");
                String nome = s.next();
                System.out.println("Quantos anos você tem?");
                int idade = s.nextInt();
                System.out.println("Entre 'M' (masculino) e 'F' (feminino), qual é o seu gênero?");
                char gen = s.next().charAt(0);
                System.out.println("Qual sua cor favorita?");
                String cor = s.next();
                System.out.println("Você pratica esportes? Entre com 'S' ou 'N'");
                char esporte = s.next().charAt(0);
                System.out.println("Seu nome é: " + nome + "\nVocê tem: " + idade + " anos de idade\nSeu sexo é: " + gen + ""
                        + "\nSua cor favorita é: " + cor);
                if (esporte == 'S'){
                    System.out.println("Você pratica esportes");
                }
                else if (esporte == 'N'){
                    System.out.println("Você não pratica esporte");
                }
                else { 
                    System.out.println("Escreva um valor válido");
                }
                break;
                
                case 3:
                    System.out.println("Entre com dois números:");
                    int num1 = s.nextInt();
                    System.out.println("Entre com dois números:");
                    int num2 = s.nextInt();
                    int soma = num1 + num2;
                    int div = num1 / num2;
                    int sub = num1 - num2;
                    int mult = num1 * num2;
                    System.out.println("Soma = " + soma + "\nDivisão = " + div + "\nSubtração = " + sub + "\nMultiplicação = " + mult);
                    break;
                    
                case 4:
                    System.out.println("Entre com um número inteiro");
                    int nm1 = s.nextInt();
                    System.out.println("Entre com outro número:");
                    int nm2 = s.nextInt();
                    if(nm1 > nm2){
                        System.out.println("É maior");
                    }
                    else{ 
                        System.out.print("É menor");
                    }
                    break;
                    
                    
                    case 5:
                        System.out.println("Entre com um número");
                        double num5 = s.nextDouble();
                        if(num5 % 2 == 0) {
                            System.out.print("O número é par");
                        }
                        else{
                            System.out.println("O número é par");
                        }
                        break;
                        
                        case 6:
                            System.out.println("Digite um número:");
                            int nm6 = s.nextInt();
                            System.out.println("Elelvado a 2: " + Math.pow(nm6, 2) + "\nElelvado a 4: " + Math.pow(nm6, 4) + 
                                    "\nElevado a 6: " + Math.pow(nm6, 6) + "Elevado a 8: " + Math.pow(nm6, 8) + ""
                                            + "\nElevado a 10: " + Math.pow(nm6,10)); 
                            break;
                            
                            case 7:
                                System.out.println("Entre com um número inteiro:");
                                int num7 = s.nextInt(); System.out.println("Entre com outro número inteiro");
                                int num72 = s.nextInt();
                                if(num7 > num72){
                                    System.out.println("É maior");
                                }
                                else if(num7 < num72){
                                    System.out.println("É menor");
                                }
                                else if(num7 == num72){
                                    System.out.println("É igual");
                                }
                                else if(num7 != num72){
                                    System.out.print("É diferente");
                                }
                                else{ 
                                    System.out.print("Insira um número inteiro!");
                                }
                                break;
                                
                                case 8:
                                    double consumo_total;
                                    double media;
                                    System.out.println("Qual seu consumo no dia 1ª?:");
                                    double num8 = Math.abs(s.nextDouble());
                                    System.out.println("Qual seu consumo de agua do dia 30?:");
                                    double num82 = Math.abs(s.nextDouble());
                                    consumo_total = Math.abs(num82 - num8);
                                    media = Math.abs(consumo_total / 30);
                                    System.out.println("Total de litros consumidos no mês: " + consumo_total); 
                                    System.out.println("Média de consumo nos últimos 30 dias: " + media + " litros por dia.");
                                    break;
                                    
                                    case 9:
                                        System.out.println("Entre com um número inteiro:");
                                        int num9 = s.nextInt();
                                        if(num9 > 10 && num9 < 100 ){
                                            System.out.printf("Elevado a 2: " + Math.pow(num9, 2) + ".");
                                        }
                                        else if(num9 > 100 || num9 < 10){
                                            System.out.printf("Raiz quadrada: %.1f" , Math.sqrt(num9) +".");
                                        }
                                        else{ 
                                            System.out.println("Insira um valor válido e incie novamente.");
                                        } 
                                        break;
                                        
                                        
                                        default: 
                                            System.out.println("Entre com uma opção válida"); 
                                            break;
                  

}}}
