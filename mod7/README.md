# Criando minha classe em Java - Tarefa ebac módulo 7

## 1- Intordução.

Para realização deste projeto, ao invés de criar uma classe "do nada", resolvi pegar um exercício que para praticamente a mesma coisa, aplicando também alguns conceitos ainda não abordados, porém que fazem total sentido para o contexto do módulo.

Abaixo o Leitor pode ler o exercício e logo após, acompanhar a resolução.

<b> 1.1 Exercício </b>

Em um banco, para se cadastrar uma conta bançario, é necessário informar o número da conta, o nome do titular da conta e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.

Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do titular pode ser alterado (pois uma pessoa pode mudar o nome por ocasião de casamento, por exemplo).

Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O Saldo só aumento por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, o vanco cobrea uma taxa de $5.00. Nota: a conta pode fical com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa.

Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada operação.

<b> 1.1.1 Desenho da classe esperada </b>

<img src="prints/01.png">

<b>1.1.2 Comportamento esperado</b>
