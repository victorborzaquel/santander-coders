package com.letscode.santander.coders.poo2.material.aluno.solid.single.responsability;

public class Main {
    // S - Single-Responsibility Principle
    // O - Open-Closed Principle
    // L - Liskov Substitution Principle
    // I - Interface Segregation Principle
    // D - Dependency Inversion Principle

    // Single-Responsibility Principle: Esse princípio nos diz que uma classe deve possuir apenas uma responsabilidade.
    // Open-Closed Principle: Entidades de software devem estar abertos para extensão, mas fechados para modificação.
    // Liskov Substitution Principle: Objetos de subclasse deve ser substituível pelo objeto da superclasse da qual é deriva.
    // Interface Segregation Principle: Nenhuma classe deve depender de métodos que ela não usa.
    // Dependency Inversion Principle: módulos de alto nível não devem depender de módulos de baixo nível, os dois devem depender de abstrações.

    // DRY (Don't-Repeat-Yourself): Não repita código. Use abstrações e heranças. Cada mudança, não deve provocar efeitos cascatas ou danos colaterais. O princípio está descrito no livro "O programador pragmático".
    // YAGNI (You-Ain't-Gonna-Need-It): Princípio criado na eXtreme Programming (XP), onde uma funcionalidade ou trecho de código só deve ser escrito quando necessário, nunca "para o futuro".
    // KISS (Keep-It-Simple-Stupid): Acrônimo criado na US Navy nos anos 60, define a simplicidade como objetivo máximo no design de soluções.
    public static void main(String[] args) {
        Aluno victor = new Aluno("Victor", "victor@mail.com");
        String message = "Boa noite turma!";

        MailSender.send(victor.getMail(), message);
    }
}
