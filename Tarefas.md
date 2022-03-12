Tarefa 1 - Implementação orientada a objetos para produtor rural

Implemente um código orientado a objetos para permitir que um produtor rural, que participa de diferentes feiras em sua cidade, possa saber quanto ele tem de estoque de cada produto que vende (laranja, limão, maçã etc.) quanto cada lote de produto vence e quanto ele ganhou em cada uma das feiras nas quais participou.


---------------------------------------------

Tarefa 2 - Implementação orientada a objetos de sistema de comunicação

Problema
========

Como toda grande cidade, existem diversos problemas nos espaços públicos: buraco nos asfaltos, mato alto nas calçadas e terrenos, fios de energia estragados, entre outros.

Como o município de Mogi das Cruzes é grande e o tamanho de efetivo de fiscalização é incompatível, a identificação destes problemas é trabalhosa e, muitas vezes, incompleta. Desta forma, a população acaba esperando muito tempo para que o problema seja resolvido.

Entre as possíveis soluções estão: aumentar o efetivo de fiscalização, instalar câmeras inteligentes que detectem parte dos problemas automaticamente ou facilitar os meios existentes para que a população possa informar sobre os problemas. A forma atual que a população tem para relatar os problemas está descrita no processo de negócio PN001.

O aumento do efetivo de fiscalização e a instalação de câmeras inteligentes têm custo alto. Desta forma, um caminho possível para reduzir o problema e com baixo custo seria focar na facilitação da comunicação com a população por meio de smartphones. (...)

Proposta
========

Neste contexto, este projeto propõe o desenvolvimento de um aplicativo por meio do qual os moradores possam informar a prefeitura sobre problemas, seus locais, com comprovação de foto, bem como possam acompanhar o passo-a-passo da solução do problema.

Stakeholders
============

* Munícipe;
* Prefeito da cidade;
* Secretarias e funcionários responsáveis pela fiscalização e correção destes problemas;
* Gerente de projetos;
* Equipe de desenvolvimento.

Vocabulário
===========

Auto de notificação: documento formal emitido por um fiscal quando identifica algum problema, como mato alto em terreno.

Processo de negócio
===================

PN0001 - ...
PN0002 - Fiscalização de mato alto
    Atualmente, a fiscalização é realizada por fiscais da Secretaria de Segurança. Diariamente, esses fiscais saem com os seus carros e andam 'aleatoriamente' pela cidade ou dirigem-se a pontos para os quais foram recebidas reclamações. Ao chegar ao local, o fiscal verifica se realmente há um problema. Caso haja, ele deve colher provas do problema (foto, vídeo, etc.), bem como produzir um auto de notificação, que deve ser entregue ao proprietário do imóvel que está com mato alto. Este proprietário tem um prazo para resolver ou recorrer da notificação, conforme regra de negócio RN0001.
PN0003 - ...

Regras de negócio
=================

(...)

Requisitos
==========

(...)
Em resumo, o sistema deve permitir o registro de munícipes, reclamações e o acompanhamento do andamento das reclamações.


---------------------------------------------

Tarefa 3 - Folha de pagamento

Uma empresa deseja criar um sistema simples orientado a objetos para gestão de folha de pagamento.
Atualmente, ela trabalha com 3 tipos de funcionários:
* Horistas: recebem um valor mensal referente a valor/hora * horas trabalhadas;
* Mensalistas: recebem um valor correspondente ao cargo (podem ser inventados cargos e valores);
* Empreitada: recebem um valor único referente a uma empreitada (p.ex.: uma obra de reforma).

A empresa informou que podem ser criados novos tipos de relações de trabalho e cálculos de salário no futuro.
Você deve implementar este programa assumindo que:
* Deve ser possível cadastrar diversos funcionários destes tipos em diversos departamentos diferentes;
* Deve ser possível gerar uma folha de pagamento como a seguinte:

CPF Nome Departamento Tipo Salário Memória de cálculo
012.345.678-90 João da Silva RH Horista R$ 2.300,00 23 (horas) * 100 (valor/hora)
112.345.678-90 Maria da Silva RH Horista R$ 2.500,00 25 (horas) * 100 (valor/hora)
112.345.678-90 Marcia da Silva RH Mensalista R$ 5.000,00 Salário de programador pleno
112.345.678-90 Sérgio da Silva RH Empreitada R$ 2.000,00 Conserto de banheiro
112.345.678-90 Alex da Silva Administração Empreitada R$ 2.500,00 Conserto de banheiro
112.345.678-90 Marco da Silva Administração Mensalista R$ 7.500,00 Salário de gerente pleno

Utilize herança e polimorfismo (faça também sem e sinta a diferença).