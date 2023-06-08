# CalculoMedia

Este programa calcula a média de três notas de 30 alunos e verifica se eles foram aprovados, reprovados ou estão em recuperação.

## Como utilizar

1. Compile o programa utilizando um compilador Java.
2. Execute o arquivo compilado.
3. Digite as notas dos alunos quando solicitado pelo programa.
4. O programa exibirá a média e a situação do aluno.

## Funcionamento

O programa utiliza um loop `for` para solicitar as notas dos 30 alunos e armazenar as médias em um array. 
Em seguida, outro loop `for` é utilizado para exibir as médias e as situações dos alunos.

Se a média do aluno for menor que 5, o programa exibe "Infelizmente o aluno está de reprovado". 
Se a média for entre 5 e 6, o programa exibe "O aluno está em recuperação". Se a média for maior ou igual a 6, o programa exibe "Parabéns!! você passou".

## Tratamento de erros

O programa não realiza tratamento de erros para as entradas do usuário. Portanto, é importante que o usuário digite apenas números para as notas.
Este código simples foi criado no intuito de prática de lógica de programação.
