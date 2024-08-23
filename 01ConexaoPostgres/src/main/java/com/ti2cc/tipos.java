package com.ti2cc;


public class tipos {
   private String nome;
   private String sabor;
   public tipos() {
       this.nome = "";
       this.sabor = "";
   }
   public tipos(String nome, String sabor) {
       this.nome = nome;
       this.sabor = sabor;
   }
   public String getNome() {
       return nome;
   }
   public void setNome(String nome) {
       this.nome = nome;
   }
   public String getSabor() {
       return sabor;
   }
   public void setSabor(String sabor) {
       this.sabor = sabor;
   }
   @Override public String toString() {
       return"tipos [nome=" + nome + ", sabor=" + sabor + "]";
   }
}
