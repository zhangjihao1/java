package org.example.VisitorPattern;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
 }
