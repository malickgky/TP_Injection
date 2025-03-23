package Presentation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationStrinpXML {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       IMetier Metier = (IMetier) context.getBean("Metier");
       System.out.println("RES="+Metier.calcul());


    }
}
