📦 Projeto – Classe Estojo
📌 Sobre o Projeto

Este projeto foi desenvolvido para demonstrar o uso de Programação Orientada a Objetos em Java.

A classe criada se chama Estojo e representa um estojo escolar do mundo real.

🎒 O que o objeto representa?

O objeto Estojo representa um estojo utilizado para guardar materiais escolares.

Ele possui características como:

Material

Formato

Capacidade interna

Estado do zíper (aberto ou fechado)

🏗️ Atributos da Classe

A classe possui os seguintes atributos:

material → tipo do material do estojo

formato → formato do estojo

capacidadeEmMl → capacidade interna

ziper → indica se está aberto (true) ou fechado (false)

🔧 Construtor

O construtor serve para criar o objeto já com suas características definidas.

Estojo estojo1 = new Estojo("Tecido", "Retangular", 500.0, false);

No exemplo acima, foi criado um estojo de tecido, formato retangular, com capacidade de 500ml e inicialmente fechado.

⚙️ Métodos
🔓 abrir()

Abre o estojo.
Se ele já estiver aberto, o sistema informa isso.

estojo1.abrir();
🔒 fechar()

Fecha o estojo.
Se ele já estiver fechado, o sistema informa isso.

estojo1.fechar();
