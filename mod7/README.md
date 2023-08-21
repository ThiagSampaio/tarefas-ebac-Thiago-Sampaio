# Criando minha classe em Java - Tarefa ebac módulo 7

## 1- Intordução.

Para realização deste projeto, ao invés de criar uma classe "do nada", resolvi pegar um exercício que trabalha praticamente a mesma coisa, aplicando também alguns conceitos ainda não abordados, porém que fazem total sentido para o contexto do módulo.

Abaixo o leitor pode ler o exercício e logo após, acompanhar a resolução.

<b> 1.1 Exercício </b>

Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular da conta e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.

Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do titular pode ser alterado (pois uma pessoa pode mudar o nome por ocasião de casamento, por exemplo).

Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O Saldo só aumento por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa de $5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa.

Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada operação.

<b> 1.1.1 Desenho esperado da classe </b>

<img src="prints/01.png">

<b>1.1.2 Comportamento esperado do programa final</b>

Enter account number: <b>8532</b>

Enter account holder: <b>Alex Green</b>

Is there an initial deposit (y/n)? <b>y</b>

Enter initial deposit value: <b> 500.00 </b>


Account data:

Account 8532, Holder: Alex Green, Balance : $ 500.00


Enter a deposit value: <b>200.00</b>

Updated account data:

Account 8532, Holder: Alex Green, Balance : $ 700.00


Enter a withdraw value: <b>300.00</b>

Updated account data:

Account 8532, Holder: Alex Green, Balance : $ 395.00

## 2- O programa.

<b> 2.1 - Primeiro esboço da classe Account </b>

Na imagem abaixo o primeiro esboço da classe Account

<img src="prints/02.png">

Primeiro, criei a classe com o nome pedido no desenho da classe e depois seus atributos, utilizando o conceito de encapsulamento(complemento logo logo o conceito).

Criei 2 métodos construtores , utilizando o conceito de sobreCarga, obrigando o "usuário" do sistema digitar as infos assim que o objeto é instânciado. 
Como o usuário pode criar uma conta sem saldo, existe o construtor para as três variáveis e também existe o construtor para somente duas variáveis.

Criei depois os métodos get e set dos meus atributos privates("contemplando a finalização do conceito de encapsulamento no qual a regra de ouro diz que os atributos devem ser acessados por meio desses métodos."). Lembrando que o exercício diz que o número da conta é imutável, por isso não existe "setNumber()". O exemplo também diz que o saldo só pode ser mudado via depósito e retirada, por isso não existe "setBalance()".

Este é fim da primeira parte.

