# bank-java

A solução de um exercício proposto onde devem ser implementados 7 métodos relacionados a POO. As classes possuem métodos setters, getters e o método construtor. \n

O programa tenta simular uma espécie de banco, com os seguintes métodos: \n\n
  1 - Abrir conta
    1.1 - A conta será cadastrada aqui, ela deve portanto além de informações como nome, data de nascimento, cpf, usuário e senha, também conter o tipo de conta.
    1.2 - A conta pode ser do tipo corrente ou poupança, cada uma delas tem uma mensalidada mensalidade e um saldo inicial, ambos são distintos, porém possuem os mesmos métodos.
    1.3 A conta é cadastrada em um array, afim de ser manipulada ao longo do programa pelo seu índice.
  2 - Fechar conta
    2.1 - A conta, selecionada pela senha e pelo tipo será encerrada, onde todos os seus atributos, já que a conta é um objeto, serão nulos(null).
    2.2 - A conta só pode ser encerrada se não houver saldo, ou seja, saldo = 0.
  3 - Sacar
    3.1 - O método sacar apenas pedirá a senha, tipo e o valor, sendo que se senha e tipo estiverem corretos, além de que o saldo seja maior ou igual ao valor escolhido, o saque será efetuado.
    4.1 - O método sacar apenas pedirá a senha, tipo e o valor, sendo que se senha e tipo estiverem corretos então a conta será identificada e o saldo da conta receberá o saldo antigo mais o valor escolhido.
  5 - Emprestar
    5.1 - Esse é um pouco mais complicado, pois pedirá senha, tipo e valor, caso senha e tipo estejam corretos, então ele adicionará aquela conta o valor emprestado
    5.2 - Se o empréstimo foi autorizado então a mensalidade receberá além de uma taxa fixa mensal, o juros do empréstimo(valor/12) e acrescentará à mensalidade.
  6 - Pagar mensalidade
    6.1 Pedirá senha e tipo, então reunirá todas as informações de mensalidade e descontará a mesma do saldo.
  7 - Listar todas as contas cadastradas ativas
    7.1 Método simples que percorre ambos os arrays que guardam as contas dos dois tipos e mostra suas informações no console.
