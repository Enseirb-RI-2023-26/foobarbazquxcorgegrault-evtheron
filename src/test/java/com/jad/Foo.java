package com.jad;

public class Foo {
    private Bar bar;
    private Baz[] bazs;
    private Qux qux;
    private Corge corge;
    private Grault[] graults;

    public Bar getBar() {
        return this.bar;
    }

    public Baz[] getBazs() {
        return this.bazs;
    }

    public Qux getQux() {
        return this.qux;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }

    public Grault[] getGraults() {
        return this.graults;
    }

    public Foo(Bar bar) {
        this.bar = bar;
        this.qux = new Qux();
    }

    public void addBaz(Baz baz) {
        this.bazs[this.bazs.length - 1] = baz;
    }

    public void addGrault() {
        this.graults[this.graults.length - 1] = new Grault(this);
    }
}
