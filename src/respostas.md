Questão 1:

A partir do Java 8 foi possível implementar métodos com corpo nas interfaces, usando default e static.
Os métodos default têm implementação e são herdados automaticamente pelas classes que implementam a interface,
podendo ser sobrescritos. Sua principal utilidade é permitir que interfaces evoluam sem quebrar as classes
que já as implementam.

Os métodos static são utilitários vinculados à própria interface, não às instâncias, e não são herdados.
Servem para agrupar funções auxiliares diretamente na interface, sem precisar de uma classe separada pra isso.

Questão 2:

Interfaces funcionam como contratos, ou seja, definem o que algo precisa fazer, sem amarrar a como é feito.
Isso permite trocar implementações sem mexer no resto do sistema.

Exemplo clássico: um sistema de pagamentos, em vez de depender diretamente do PayPal, você depende de
uma interface MetodoPagamento. Aí pra adicionar Pix, cartão, ou qualquer outro, só cria uma nova classe
que implementa o contrato sem tocar em nada que já funciona.
É exatamente isso que mantém o sistema organizado e fácil de evoluir.

