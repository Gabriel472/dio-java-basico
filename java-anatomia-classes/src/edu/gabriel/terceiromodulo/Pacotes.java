package edu.gabriel.terceiromodulo;

/**
 * 
 * Pacotes
 * 
 * <b>Note</b> Leia atentamente a documentação desta classe apra desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Gabriel Rodrigues
 * @version 1.0
 * @since 16/10/2026
 */

public class Pacotes {
    // Pacotes
    /*
        A linguagem Java é composta por milhares de classes com diversas finalidades: Classes de tipos de dados, representação de texto, números, datas, arquivos e diretórios, conexão a banco de dados, entre outras. Imagina todas estas classes existirem em um único nível de documentos? E as classes desenvolvidas por nós, meros desenvolvedores de aplicações de vários gêneros? Imagine que ficaria este diretório?

        Para previnir este acontecimento, a linguagem dispõe de um recurso que organiza as classes padrão e criadas por nós, que conhecemos como pacote (package). Os pacotes são subdiretórios a partir da pasta SRC do nosso projeto onde estão localizadas as classes da linguagem e novas que forem criadas para o projeto. Existem algumas convenções para criação de pacotes já utilizados no mercado.

            // Nomenclatura
            Vamos imaginar que sua empresa se chama Power Soft e ela está desenvolvendo softwares comercial, governamental, e um software livre ou de código aberto. Abaixo teriamos os pacotes sugeridos conforme tabela abaixo:
                . COMERCIAL: com.powersoft
                . GOVERNAMENTAL: gov.powersoft
                . CÓDIGO ABERTO: org.powersoft
                . ESTUDANTIL: edu.powersoft // menção honrosa

            Bem, acima já podemos perceber que existe uma definição para o uso do nome dos pacotes, porém podemos organizar ainda mais um pouco as nossas classes mediante a proposta de sua existência:
                . MODEL: Classes que representam a camada e modelo da aplicação: Cliente, Pedido, NotaFiscal, Usuário;
                . REPOSITORY: Classes ou interfaces que possuem a finalidade de interagir com tabelas no banco de dados: ClienteRepository;
                . SERIVCE: Classes que contém regras de negócio do sistema: ClienteService possui o método para validar o CPF do cliente cadastrado;
                . CONTROLLER: Classes que possuem a finalidade de disponibilizar os nossos recursos da aplicação para outras aplicações via padrão HTTP;
                . VIEW: Classes que possuem alguma interação com a interface gráfica acessada pelo usuário;
                . UTIL: Pacote que contém classes utilitárias do sistema: FormatadorNumeroUtil, ValidadorUtil.

            // Identificação
            Uma das características de uma classes é a sua identificação: Cliente, NotaFiscal, TituloPagar. Porém, quando esta classe é organizada por pacotes, ela passa a ter duas identificações: O nome simples (PRÓPRIO NOME) e, agora, o nome qualificado (ENDEREÇAMENTO DO PACOTE + NOME) - Considere a classe Usuario que está endereçada no pacote com.controle.acesso.model, o nome qualificado desta classe é com.controle.acesso.model.Usuario.

            // Package versus Import
            A localização de uma classe é definida pela palavra reservada package, logo, uma classe só contém uma definicação de package no arquivo, sempre na primeira linha do do código. Para a utilização de uma classe existente em outros pacotes, necessitamos realizar a importação das mesmas, seguindo a recomendação abaixo:
                package

                import ...
                import ...

                public class MinhaClasse {
                }
    */
}
