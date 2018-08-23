import java.util.Scanner;
public class sistemabanco{
public static void main(String[] args){
Scanner entrada = new Scanner(System.in);
double sacar,deposito,saldo = 0;
boolean verdadeiro = false;
while(verdadeiro != true){
System.out.println("	CAIXA ELETRÔNICO");
System.out.println("1 - Sacar");
System.out.println("2 - Depositar");
System.out.println("3 - Saldo");
System.out.println("4 - Sair");
int opcao = entrada.nextInt();
switch(opcao){
case 1:
System.out.println(" Digite quanto quer sacar:");
sacar = entrada.nextDouble();
saldo -= sacar;
break;
case 2:
System.out.println(" Digite quanto quer depositar:");
deposito = entrada.nextDouble();
saldo += deposito;
break;
case 3:
System.out.println(" Seu saldo atual é " + saldo + ".");
break;
case 4:
for(String resposta = "caixa"; resposta != "S" || resposta != "N"; resposta = resposta){
System.out.println("Deseja realmente sair?");
System.out.println("[S/N]");
resposta = entrada.next();
if(resposta.equals("S")){
verdadeiro = true;
}
else if(resposta.equals("N")){
verdadeiro = false;
}
else{
System.out.println("ERRO!");
System.out.println("Digite uma resposta valida.");
}
}
break;
default:
System.out.println("Valor inválido!");
}
}

}
}

