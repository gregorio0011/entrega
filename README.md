Resumo do Projeto
Este projeto consiste em um aplicativo Android desenvolvido em Java com Gradle, cujo objetivo é calcular o Índice de Massa Corporal (IMC) do usuário e fornecer uma resposta personalizada de acordo com a faixa de resultado obtido.

O trabalho foi desenvolvido como parte da avaliação da N1 na disciplina ministrada pelo professor Vinicius Heltai.

Classificação do IMC
O IMC é dividido nas seguintes categorias:

Abaixo do peso: IMC menor que 18,5

Peso ideal: IMC entre 18,5 e 24,9

Sobrepeso: IMC entre 25 e 29,9

Obesidade grau I: IMC entre 30 e 34,9

Obesidade grau II: IMC entre 35 e 39,9

Obesidade grau III: IMC igual ou superior a 40

Tecnologias e Ferramentas
Linguagem: Java

Gerenciador de dependências: Gradle

Plataforma: Android SDK 35

Organização do Projeto
A estrutura do projeto segue a seguinte hierarquia:
app/  
├── build.gradle  
├── src/  
│   ├── main/  
│   │   ├── java/  
│   │   │   └── br/  
│   │   │       └── com/  
│   │   │           └── fecapccp/  
│   │   │               └── calculadoraimc/  
│   │   │                   ├── MainActivity.java  
│   │   │                   ├── calcularimc/  
│   │   │                   │   └── CalculoImcActivity.java  
│   │   │                   └── categoriasimc/  
│   │   │                       ├── AbaixoDoPesoActivity.java  
│   │   │                       ├── PesoNormalActivity.java  
│   │   │                       ├── SobrepesoActivity.java  
│   │   │                       ├── Obesidade1Activity.java  
│   │   │                       ├── Obesidade2Activity.java  
│   │   │                       └── Obesidade3Activity.java  
│   │   └── res/  
│   │       ├── anim/  
│   │       │   ├── scale_animation.xml  
│   │       ├── layout/  
│   │       │   ├── activity_abaixo_do_peso.xml  
│   │       │   ├── activity_peso_normal.xml  
│   │       │   ├── activity_sobrepeso.xml  
│   │       │   ├── activity_obesidade_1.xml  
│   │       │   ├── activity_obesidade_2.xml  
│   │       │   ├── activity_obesidade_3.xml  
│   │       │   └── activity_calculo_imc.xml  
│   │       └── values/  
│   │           ├── colors.xml  
│   │           └── strings.xml  
└── README.md  
Desafios e Soluções
Durante o desenvolvimento, alguns obstáculos foram encontrados, principalmente na criação dos layouts. O posicionamento dos componentes demandou ajustes detalhados e testes constantes.

Além disso, uma decisão importante foi a remoção de gráficos, pois a biblioteca utilizada gerava instabilidade no projeto. Optou-se por manter uma interface mais simples e funcional, garantindo o correto funcionamento do aplicativo.

Como Rodar o Projeto
Clone o repositório:
git clone https://github.com/Pedro-Lemos/projeto-imc-fecap.git  
Abra o projeto no Android Studio.

Sincronize as dependências do Gradle (Groovy).

Conecte um dispositivo físico ou inicie um emulador.

Execute o aplicativo.

Este projeto foi desenvolvido com dedicação para garantir uma experiência intuitiva e eficiente no cálculo do IMC.
