package edu.gabriel.terceiromodulo;

/**
 * Classes
 * 
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Gabriel Rodrigues
 * @version 1.0
 * @since 02/10/2026
 */

public class Classes {
    // Classes
    /*
        Toda a estrutura de código na linguagem Java é distribuído em arquivos com extensão .JAVA denominados de CLASSE.

        As classes existentes em nosso projeto serão compostas por IDENTIFICADOR, CARACTERÍSTICAS e COMPORTAMENTOS.
            . CLASSE (class): é a estrutura e/ou representação que direciona a criação de objetos do mesmo tipo;
            . IDENTIFICADOR (identity): propósito existencial aos objetos que serão criados;
            . CARACTERÍSTICAS (states): também conhecido como ATRIBUTOS ou PROPRIEDADES, é toda informação que representa o estado do objeto;
            . COMPORTAMENTOS (behavior): também conhecido como AÇÕES ou MÉTODOS, é toda parte comportamental que um objeto dispõe;
            . INSTANCIAR (new): é o ato de criar um objeto a partir de estrutura definida em uma classe.

        Para ilustrar as etapas de desenvolvimento orientada a objetos em Java, será produzido abaixo um exemplo em forma de código para explicar que primeiro é criada a estrutura correspondente para assim poder criar os objetos com as características e possibilidade de realização de ações (comportamentos) como se fosse no "mundo real".

            // Criando a classe Student
            // Com todas as características e comportamentos aplicados

            public class Student {
                String name;
                int age;
                Color color;
                Sex sex;

                void eating(Food food){
                    // Código aqui
                }

                void drinking(Eat eat){
                    // Código aqui
                }

                void running(){
                    // Código aqui
                }
            }


            // Criando objetos a partir da classe Student
            
            public class School {
                public static void main(String[] args) throws Exception {
                    Student student1 = new Student();
                    student1.name = "John";
                    student1.age = 12;
                    student1.color = Color.FAIR;
                    student1.sex = Sex.MALE;

                    Student student2 = new Student();
                    student2.name = "Sophia";
                    student2.age = 10;
                    student2.color = Color.FAIR;
                    student2.sex = Sex.FEMALE;

                    Student student3 = new Student();
                    student3.name = "Lily";
                    student3.age = 11;
                    student3.color = Color.DARK;
                    student3.sex = Sex.FEMALE;
                }
            }

        // OBS.: O exemplo acima NÃO estruturou a classe Student com o padrão Java Beans getters e setters.
        
        Seguindo alguma convenções, as classes são classificadas como:
            . CLASSE DE MODELO (MODEL): classes que representem estrutura de domínio da aplicação. Exemplos: Cliente, Pedido, Nota Fiscal e etc;
            . CLASSE DE SERVIÇO (SERVICE): classes que contém regras de negócio e validação do sistema;
            . CLASSE DE REPOSITÓRIO (REPOSITORY): classes que contém uma integração com banco de dados;
            . CLASSE DE CONTROLE (CONTROLLER): classes que possuem a finalidade de disponibilizar alguma comunicação externa à aplicação, como http web ou webservices;
            . CLASSE UTILITÁRIA (util): classe que contém recursos comuns à toda aplicação.


        // Aplicação - Concessionária
            Atores / Participantes (atributos)
                Empresa
                Veículo
                Cliente
                Nota Fiscal
                Colaborador
                Peca (peça)

            Serviços (ações)
                VeiculoService
                ClienteService
                OficinaService
                NotaFiscalService

            Repositórios (registro / dados / informação)
                VeiculoRepository
                ClienteRepository
                PecaRepository

            Ferramentas (utilidades)
                FormatadorUtil
                ValidadorUtil
                Calculadora
                Chave Inglesa
    */
    
}
