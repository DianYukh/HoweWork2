package org.example.Homework.homework35.Builder;



abstract class PastaBuilder {

    protected Pasta pasta;

    public PastaBuilder(){

    }
    public Pasta GetPasta(){
        return pasta;
    }
    public abstract void BuildPasta();
}
