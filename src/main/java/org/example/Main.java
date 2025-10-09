package org.example;

public class Main {
    public static void main(String[] args) {
        Document v_document=new Document();
        String v_txtOptenido=v_document.m_getText("src/main/resources/input/correos.txt");
        v_document.m_writeText("src/main/resources/output/correos.txt",v_txtOptenido);

    }
}